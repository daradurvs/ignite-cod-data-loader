package ru.sbrf.gg.load

import java.util.concurrent.ExecutorService
import java.util.concurrent.atomic.AtomicInteger

import org.apache.ignite.{Ignite, IgniteCache}

/**
  */
class CheckTable(val tableName: String, val dataRoot: String, val pool: ExecutorService,
    val ignite: Ignite, val poolSize: Int) extends ProcessTableFile {

    val counter = new AtomicInteger()

    val lock = new Object()

    var cache: IgniteCache[Any, Any] = _

    override def taskName: String = "CheckTable"

    override def start(tableInfo: TableInfo): Unit = {
        cache = ignite.getOrCreateCache(tableInfo.cacheName)
    }

    override def processBatch(batch: Array[String], tableInfo: TableInfo, lineCount: Long, name: String): Unit = {
        pool.execute(new CheckBatchTask(batch, tableInfo, ignite, cache, lineCount, name, tableName, lock, counter))

        waitTasksToComplete()
    }

    override def finish(tableInfo: TableInfo): Unit = {
        /* no-op */
    }

    private def waitTasksToComplete(): Unit = {
        lock.synchronized {
            try {
                val currentBatchCnt = counter.incrementAndGet()

                if (currentBatchCnt >= poolSize) {
                    lock.wait()
                }
            }
            catch {
                case e: InterruptedException ⇒ e.printStackTrace()
            }
        }
    }

}
