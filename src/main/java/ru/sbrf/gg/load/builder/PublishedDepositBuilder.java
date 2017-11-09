
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.extension.PublishedDeposit;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedDepositBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedDeposit r = new PublishedDeposit();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.productParty_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.deporelationFlagKred = DelimetedStringParser.bool(4, line, indexes);
r.deporelationTypeRec = DelimetedStringParser._long(5, line, indexes);
r.depositAccount = DelimetedStringParser.str(6, line, indexes);
r.depositAddstate = DelimetedStringParser._long(7, line, indexes);
r.depositAllhistflag = DelimetedStringParser._long(8, line, indexes);
r.depositAloneopno = DelimetedStringParser._long(9, line, indexes);
r.depositArreststate = DelimetedStringParser._long(10, line, indexes);
r.depositAssignday = DelimetedStringParser.date(11, line, indexes);
r.depositAssminbalance = DelimetedStringParser.bigDecimal(12, line, indexes);
r.depositSubsidy = DelimetedStringParser.bigDecimal(13, line, indexes);
r.depositInterest = DelimetedStringParser.bigDecimal(14, line, indexes);
r.deposit_branchno = DelimetedStringParser._int(15, line, indexes);
r.depositCapitalday = DelimetedStringParser.date(16, line, indexes);
r.depositCaptured = DelimetedStringParser.str(17, line, indexes);
r.depositCapyear = DelimetedStringParser._long(18, line, indexes);
r.depositCashsource = DelimetedStringParser._int(19, line, indexes);
r.depositClientkind = DelimetedStringParser._long(20, line, indexes);
r.depositCurrency = DelimetedStringParser._long(21, line, indexes);
r.depositDebtflag = DelimetedStringParser.bool(22, line, indexes);
r.depositDepoflags = DelimetedStringParser._long(23, line, indexes);
r.depositDepositrate = DelimetedStringParser.bigDecimal(24, line, indexes);
r.depositDirty = DelimetedStringParser.bool(25, line, indexes);
r.depositExpminbalance = DelimetedStringParser.bigDecimal(26, line, indexes);
r.depositIsExprOverdraft = DelimetedStringParser.bigDecimal(27, line, indexes);
r.depositExprOverdraftInt = DelimetedStringParser.bigDecimal(28, line, indexes);
r.depositFirsttwoday = DelimetedStringParser.date(29, line, indexes);
r.deposit_tb = DelimetedStringParser._int(30, line, indexes);
r.depositIsInterestF = DelimetedStringParser.bigDecimal(31, line, indexes);
r.depositIsProlongation = DelimetedStringParser.bool(32, line, indexes);
r.depositKind = DelimetedStringParser._long(33, line, indexes);
r.depositLastkeykind = DelimetedStringParser._long(34, line, indexes);
r.depositLastopno = DelimetedStringParser._int(35, line, indexes);
r.depositLastvisitday = DelimetedStringParser.date(36, line, indexes);
r.depositLegacy = DelimetedStringParser.bigDecimal(37, line, indexes);
r.depositLossRights = DelimetedStringParser.bool(38, line, indexes);
r.depositMaxamount = DelimetedStringParser.bigDecimal(39, line, indexes);
r.depositMaxamountrate = DelimetedStringParser.bigDecimal(40, line, indexes);
r.depositMaxoptransday = DelimetedStringParser.date(41, line, indexes);
r.depositMbranchallowed = DelimetedStringParser._long(42, line, indexes);
r.depositMbranchdefault = DelimetedStringParser._long(43, line, indexes);
r.depositOffice = DelimetedStringParser._int(44, line, indexes);
r.depositOpcash = DelimetedStringParser.bigDecimal(45, line, indexes);
r.depositOpcashrezerv = DelimetedStringParser.bigDecimal(46, line, indexes);
r.depositOpday = DelimetedStringParser.date(47, line, indexes);
r.depositOpencash = DelimetedStringParser.bigDecimal(48, line, indexes);
r.depositOpencontrol = DelimetedStringParser._long(49, line, indexes);
r.depositOpenkind = DelimetedStringParser._long(50, line, indexes);
r.depositOpkind = DelimetedStringParser._int(51, line, indexes);
r.depositOpno = DelimetedStringParser._int(52, line, indexes);
r.depositOptransday = DelimetedStringParser.date(53, line, indexes);
r.depositMinBalanceMonth = DelimetedStringParser.bigDecimal(54, line, indexes);
r.depositBalanceOwnProlong = DelimetedStringParser.bigDecimal(55, line, indexes);
r.depositIsOverdraft = DelimetedStringParser.bigDecimal(56, line, indexes);
r.depositOverdraftInt = DelimetedStringParser.bigDecimal(57, line, indexes);
r.depositP39cashprev = DelimetedStringParser.bigDecimal(58, line, indexes);
r.depositP39cashyear = DelimetedStringParser.bigDecimal(59, line, indexes);
r.depositP39day = DelimetedStringParser.date(60, line, indexes);
r.depositP39dayprev = DelimetedStringParser.date(61, line, indexes);
r.depositPartrate = DelimetedStringParser.bigDecimal(62, line, indexes);
r.depositPassword = DelimetedStringParser.str(63, line, indexes);
r.depositPasswordno = DelimetedStringParser._long(64, line, indexes);
r.depositPayrollday = DelimetedStringParser.date(65, line, indexes);
r.depositPayAddFirst = DelimetedStringParser.date(66, line, indexes);
r.depositPercentsrate = DelimetedStringParser.bigDecimal(67, line, indexes);
r.depositPermflags = DelimetedStringParser._long(68, line, indexes);
r.depositProlongday = DelimetedStringParser.date(69, line, indexes);
r.depositRatesource = DelimetedStringParser._long(70, line, indexes);
r.depositResident = DelimetedStringParser._long(71, line, indexes);
r.depositRsvdepo = DelimetedStringParser.str(72, line, indexes);
r.depositState = DelimetedStringParser._int(73, line, indexes);
r.depositSubkind = DelimetedStringParser._long(74, line, indexes);
r.depositSubscribers = DelimetedStringParser._long(75, line, indexes);
r.depositTerm = DelimetedStringParser._long(76, line, indexes);
r.depositTermsok = DelimetedStringParser._int(77, line, indexes);
r.depositTxbranchno = DelimetedStringParser._long(78, line, indexes);
r.depositTxclerk = DelimetedStringParser._long(79, line, indexes);
r.depositTxoffice = DelimetedStringParser._long(80, line, indexes);
r.depositTxopcnt = DelimetedStringParser._long(81, line, indexes);
r.depositVServ = DelimetedStringParser._long(82, line, indexes);
r.metalDepositOmsMode = DelimetedStringParser._long(83, line, indexes);
r.depositLastkey = DelimetedStringParser._long(84, line, indexes);
r.depositOprow = DelimetedStringParser._long(85, line, indexes);
r.DepositAtSubscribeAccnt = DelimetedStringParser.str(86, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(87, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(88, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedDeposit f = (PublishedDeposit)first;
         PublishedDeposit s = (PublishedDeposit)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.productParty_DPL_id, s.productParty_DPL_id) != 0) return CompareUtils.compare(f.productParty_DPL_id, s.productParty_DPL_id);
if (CompareUtils.compare(f.deporelationFlagKred, s.deporelationFlagKred) != 0) return CompareUtils.compare(f.deporelationFlagKred, s.deporelationFlagKred);
if (CompareUtils.compare(f.deporelationTypeRec, s.deporelationTypeRec) != 0) return CompareUtils.compare(f.deporelationTypeRec, s.deporelationTypeRec);
if (CompareUtils.compare(f.depositAccount, s.depositAccount) != 0) return CompareUtils.compare(f.depositAccount, s.depositAccount);
if (CompareUtils.compare(f.depositAddstate, s.depositAddstate) != 0) return CompareUtils.compare(f.depositAddstate, s.depositAddstate);
if (CompareUtils.compare(f.depositAllhistflag, s.depositAllhistflag) != 0) return CompareUtils.compare(f.depositAllhistflag, s.depositAllhistflag);
if (CompareUtils.compare(f.depositAloneopno, s.depositAloneopno) != 0) return CompareUtils.compare(f.depositAloneopno, s.depositAloneopno);
if (CompareUtils.compare(f.depositArreststate, s.depositArreststate) != 0) return CompareUtils.compare(f.depositArreststate, s.depositArreststate);
if (CompareUtils.compare(f.depositAssignday, s.depositAssignday) != 0) return CompareUtils.compare(f.depositAssignday, s.depositAssignday);
if (CompareUtils.compare(f.depositAssminbalance, s.depositAssminbalance) != 0) return CompareUtils.compare(f.depositAssminbalance, s.depositAssminbalance);
if (CompareUtils.compare(f.depositSubsidy, s.depositSubsidy) != 0) return CompareUtils.compare(f.depositSubsidy, s.depositSubsidy);
if (CompareUtils.compare(f.depositInterest, s.depositInterest) != 0) return CompareUtils.compare(f.depositInterest, s.depositInterest);
if (CompareUtils.compare(f.deposit_branchno, s.deposit_branchno) != 0) return CompareUtils.compare(f.deposit_branchno, s.deposit_branchno);
if (CompareUtils.compare(f.depositCapitalday, s.depositCapitalday) != 0) return CompareUtils.compare(f.depositCapitalday, s.depositCapitalday);
if (CompareUtils.compare(f.depositCaptured, s.depositCaptured) != 0) return CompareUtils.compare(f.depositCaptured, s.depositCaptured);
if (CompareUtils.compare(f.depositCapyear, s.depositCapyear) != 0) return CompareUtils.compare(f.depositCapyear, s.depositCapyear);
if (CompareUtils.compare(f.depositCashsource, s.depositCashsource) != 0) return CompareUtils.compare(f.depositCashsource, s.depositCashsource);
if (CompareUtils.compare(f.depositClientkind, s.depositClientkind) != 0) return CompareUtils.compare(f.depositClientkind, s.depositClientkind);
if (CompareUtils.compare(f.depositCurrency, s.depositCurrency) != 0) return CompareUtils.compare(f.depositCurrency, s.depositCurrency);
if (CompareUtils.compare(f.depositDebtflag, s.depositDebtflag) != 0) return CompareUtils.compare(f.depositDebtflag, s.depositDebtflag);
if (CompareUtils.compare(f.depositDepoflags, s.depositDepoflags) != 0) return CompareUtils.compare(f.depositDepoflags, s.depositDepoflags);
if (CompareUtils.compare(f.depositDepositrate, s.depositDepositrate) != 0) return CompareUtils.compare(f.depositDepositrate, s.depositDepositrate);
if (CompareUtils.compare(f.depositDirty, s.depositDirty) != 0) return CompareUtils.compare(f.depositDirty, s.depositDirty);
if (CompareUtils.compare(f.depositExpminbalance, s.depositExpminbalance) != 0) return CompareUtils.compare(f.depositExpminbalance, s.depositExpminbalance);
if (CompareUtils.compare(f.depositIsExprOverdraft, s.depositIsExprOverdraft) != 0) return CompareUtils.compare(f.depositIsExprOverdraft, s.depositIsExprOverdraft);
if (CompareUtils.compare(f.depositExprOverdraftInt, s.depositExprOverdraftInt) != 0) return CompareUtils.compare(f.depositExprOverdraftInt, s.depositExprOverdraftInt);
if (CompareUtils.compare(f.depositFirsttwoday, s.depositFirsttwoday) != 0) return CompareUtils.compare(f.depositFirsttwoday, s.depositFirsttwoday);
if (CompareUtils.compare(f.deposit_tb, s.deposit_tb) != 0) return CompareUtils.compare(f.deposit_tb, s.deposit_tb);
if (CompareUtils.compare(f.depositIsInterestF, s.depositIsInterestF) != 0) return CompareUtils.compare(f.depositIsInterestF, s.depositIsInterestF);
if (CompareUtils.compare(f.depositIsProlongation, s.depositIsProlongation) != 0) return CompareUtils.compare(f.depositIsProlongation, s.depositIsProlongation);
if (CompareUtils.compare(f.depositKind, s.depositKind) != 0) return CompareUtils.compare(f.depositKind, s.depositKind);
if (CompareUtils.compare(f.depositLastkeykind, s.depositLastkeykind) != 0) return CompareUtils.compare(f.depositLastkeykind, s.depositLastkeykind);
if (CompareUtils.compare(f.depositLastopno, s.depositLastopno) != 0) return CompareUtils.compare(f.depositLastopno, s.depositLastopno);
if (CompareUtils.compare(f.depositLastvisitday, s.depositLastvisitday) != 0) return CompareUtils.compare(f.depositLastvisitday, s.depositLastvisitday);
if (CompareUtils.compare(f.depositLegacy, s.depositLegacy) != 0) return CompareUtils.compare(f.depositLegacy, s.depositLegacy);
if (CompareUtils.compare(f.depositLossRights, s.depositLossRights) != 0) return CompareUtils.compare(f.depositLossRights, s.depositLossRights);
if (CompareUtils.compare(f.depositMaxamount, s.depositMaxamount) != 0) return CompareUtils.compare(f.depositMaxamount, s.depositMaxamount);
if (CompareUtils.compare(f.depositMaxamountrate, s.depositMaxamountrate) != 0) return CompareUtils.compare(f.depositMaxamountrate, s.depositMaxamountrate);
if (CompareUtils.compare(f.depositMaxoptransday, s.depositMaxoptransday) != 0) return CompareUtils.compare(f.depositMaxoptransday, s.depositMaxoptransday);
if (CompareUtils.compare(f.depositMbranchallowed, s.depositMbranchallowed) != 0) return CompareUtils.compare(f.depositMbranchallowed, s.depositMbranchallowed);
if (CompareUtils.compare(f.depositMbranchdefault, s.depositMbranchdefault) != 0) return CompareUtils.compare(f.depositMbranchdefault, s.depositMbranchdefault);
if (CompareUtils.compare(f.depositOffice, s.depositOffice) != 0) return CompareUtils.compare(f.depositOffice, s.depositOffice);
if (CompareUtils.compare(f.depositOpcash, s.depositOpcash) != 0) return CompareUtils.compare(f.depositOpcash, s.depositOpcash);
if (CompareUtils.compare(f.depositOpcashrezerv, s.depositOpcashrezerv) != 0) return CompareUtils.compare(f.depositOpcashrezerv, s.depositOpcashrezerv);
if (CompareUtils.compare(f.depositOpday, s.depositOpday) != 0) return CompareUtils.compare(f.depositOpday, s.depositOpday);
if (CompareUtils.compare(f.depositOpencash, s.depositOpencash) != 0) return CompareUtils.compare(f.depositOpencash, s.depositOpencash);
if (CompareUtils.compare(f.depositOpencontrol, s.depositOpencontrol) != 0) return CompareUtils.compare(f.depositOpencontrol, s.depositOpencontrol);
if (CompareUtils.compare(f.depositOpenkind, s.depositOpenkind) != 0) return CompareUtils.compare(f.depositOpenkind, s.depositOpenkind);
if (CompareUtils.compare(f.depositOpkind, s.depositOpkind) != 0) return CompareUtils.compare(f.depositOpkind, s.depositOpkind);
if (CompareUtils.compare(f.depositOpno, s.depositOpno) != 0) return CompareUtils.compare(f.depositOpno, s.depositOpno);
if (CompareUtils.compare(f.depositOptransday, s.depositOptransday) != 0) return CompareUtils.compare(f.depositOptransday, s.depositOptransday);
if (CompareUtils.compare(f.depositMinBalanceMonth, s.depositMinBalanceMonth) != 0) return CompareUtils.compare(f.depositMinBalanceMonth, s.depositMinBalanceMonth);
if (CompareUtils.compare(f.depositBalanceOwnProlong, s.depositBalanceOwnProlong) != 0) return CompareUtils.compare(f.depositBalanceOwnProlong, s.depositBalanceOwnProlong);
if (CompareUtils.compare(f.depositIsOverdraft, s.depositIsOverdraft) != 0) return CompareUtils.compare(f.depositIsOverdraft, s.depositIsOverdraft);
if (CompareUtils.compare(f.depositOverdraftInt, s.depositOverdraftInt) != 0) return CompareUtils.compare(f.depositOverdraftInt, s.depositOverdraftInt);
if (CompareUtils.compare(f.depositP39cashprev, s.depositP39cashprev) != 0) return CompareUtils.compare(f.depositP39cashprev, s.depositP39cashprev);
if (CompareUtils.compare(f.depositP39cashyear, s.depositP39cashyear) != 0) return CompareUtils.compare(f.depositP39cashyear, s.depositP39cashyear);
if (CompareUtils.compare(f.depositP39day, s.depositP39day) != 0) return CompareUtils.compare(f.depositP39day, s.depositP39day);
if (CompareUtils.compare(f.depositP39dayprev, s.depositP39dayprev) != 0) return CompareUtils.compare(f.depositP39dayprev, s.depositP39dayprev);
if (CompareUtils.compare(f.depositPartrate, s.depositPartrate) != 0) return CompareUtils.compare(f.depositPartrate, s.depositPartrate);
if (CompareUtils.compare(f.depositPassword, s.depositPassword) != 0) return CompareUtils.compare(f.depositPassword, s.depositPassword);
if (CompareUtils.compare(f.depositPasswordno, s.depositPasswordno) != 0) return CompareUtils.compare(f.depositPasswordno, s.depositPasswordno);
if (CompareUtils.compare(f.depositPayrollday, s.depositPayrollday) != 0) return CompareUtils.compare(f.depositPayrollday, s.depositPayrollday);
if (CompareUtils.compare(f.depositPayAddFirst, s.depositPayAddFirst) != 0) return CompareUtils.compare(f.depositPayAddFirst, s.depositPayAddFirst);
if (CompareUtils.compare(f.depositPercentsrate, s.depositPercentsrate) != 0) return CompareUtils.compare(f.depositPercentsrate, s.depositPercentsrate);
if (CompareUtils.compare(f.depositPermflags, s.depositPermflags) != 0) return CompareUtils.compare(f.depositPermflags, s.depositPermflags);
if (CompareUtils.compare(f.depositProlongday, s.depositProlongday) != 0) return CompareUtils.compare(f.depositProlongday, s.depositProlongday);
if (CompareUtils.compare(f.depositRatesource, s.depositRatesource) != 0) return CompareUtils.compare(f.depositRatesource, s.depositRatesource);
if (CompareUtils.compare(f.depositResident, s.depositResident) != 0) return CompareUtils.compare(f.depositResident, s.depositResident);
if (CompareUtils.compare(f.depositRsvdepo, s.depositRsvdepo) != 0) return CompareUtils.compare(f.depositRsvdepo, s.depositRsvdepo);
if (CompareUtils.compare(f.depositState, s.depositState) != 0) return CompareUtils.compare(f.depositState, s.depositState);
if (CompareUtils.compare(f.depositSubkind, s.depositSubkind) != 0) return CompareUtils.compare(f.depositSubkind, s.depositSubkind);
if (CompareUtils.compare(f.depositSubscribers, s.depositSubscribers) != 0) return CompareUtils.compare(f.depositSubscribers, s.depositSubscribers);
if (CompareUtils.compare(f.depositTerm, s.depositTerm) != 0) return CompareUtils.compare(f.depositTerm, s.depositTerm);
if (CompareUtils.compare(f.depositTermsok, s.depositTermsok) != 0) return CompareUtils.compare(f.depositTermsok, s.depositTermsok);
if (CompareUtils.compare(f.depositTxbranchno, s.depositTxbranchno) != 0) return CompareUtils.compare(f.depositTxbranchno, s.depositTxbranchno);
if (CompareUtils.compare(f.depositTxclerk, s.depositTxclerk) != 0) return CompareUtils.compare(f.depositTxclerk, s.depositTxclerk);
if (CompareUtils.compare(f.depositTxoffice, s.depositTxoffice) != 0) return CompareUtils.compare(f.depositTxoffice, s.depositTxoffice);
if (CompareUtils.compare(f.depositTxopcnt, s.depositTxopcnt) != 0) return CompareUtils.compare(f.depositTxopcnt, s.depositTxopcnt);
if (CompareUtils.compare(f.depositVServ, s.depositVServ) != 0) return CompareUtils.compare(f.depositVServ, s.depositVServ);
if (CompareUtils.compare(f.metalDepositOmsMode, s.metalDepositOmsMode) != 0) return CompareUtils.compare(f.metalDepositOmsMode, s.metalDepositOmsMode);
if (CompareUtils.compare(f.depositLastkey, s.depositLastkey) != 0) return CompareUtils.compare(f.depositLastkey, s.depositLastkey);
if (CompareUtils.compare(f.depositOprow, s.depositOprow) != 0) return CompareUtils.compare(f.depositOprow, s.depositOprow);
if (CompareUtils.compare(f.DepositAtSubscribeAccnt, s.DepositAtSubscribeAccnt) != 0) return CompareUtils.compare(f.DepositAtSubscribeAccnt, s.DepositAtSubscribeAccnt);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
