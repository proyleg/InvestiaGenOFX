package investiagenofx.util;

import investiagenofx.model.Investment;
import investiagenofx.model.MyTransactions;
import investiagenofx.model.Transaction;
import investiagenofx.view.InvestiaGenOFXController;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;

import ofx.BuyEnum;
import ofx.BuyMutualFund;
import ofx.CurrencyEnum;
import ofx.FinancialInstitution;
import ofx.GeneralSecurityInfo;
import ofx.IncomeEnum;
import ofx.InvestmentAccount;
import ofx.InvestmentBuy;
import ofx.InvestmentPosition;
import ofx.InvestmentPositionList;
import ofx.InvestmentSell;
import ofx.InvestmentStatementResponse;
import ofx.InvestmentStatementResponseMessageSetV1;
import ofx.InvestmentStatementTransactionResponse;
import ofx.InvestmentTransaction;
import ofx.InvestmentTransactionList;
import ofx.LanguageEnum;
import ofx.MutualFundInfo;
import ofx.MutualFundTypeEnum;
import ofx.PositionMutualFund;
import ofx.PositionTypeEnum;
import ofx.Reinvest;
import ofx.SecurityId;
import ofx.SecurityList;
import ofx.SecurityListResponseMessageSetV1;
import ofx.SellMutualFund;
import ofx.SellTypeEnum;
import ofx.SeverityEnum;
import ofx.SignonResponse;
import ofx.SignonResponseMessageSetV1;
import ofx.Status;
import ofx.SubAccountEnum;

/**
 *
 * @author Pierre
 */
public class OFXUtilites {

    private static String currency = null;

    /**
     *
     * @param dtServer
     * @param fiInstitution
     * @return
     */
    public static SignonResponseMessageSetV1 genSignonResponseMessageSet(String dtServer, String fiInstitution) {
        SignonResponseMessageSetV1 signonResponseMessageSet = new SignonResponseMessageSetV1();
        SignonResponse signonResponse = new SignonResponse();
        signonResponse.setLANGUAGE(LanguageEnum.ENG);
        Status status = new Status();
        status.setCODE("0");
        status.setMESSAGE("SuccessfulSignOn");
        status.setSEVERITY(SeverityEnum.INFO);
        signonResponse.setSTATUS(status);
        signonResponse.setDTSERVER(dtServer);
        FinancialInstitution financialInstitution = new FinancialInstitution();
        financialInstitution.setFID(fiInstitution);
        financialInstitution.setORG(fiInstitution);
        signonResponse.setFI(financialInstitution);
        signonResponse.setINTUBID("04297");
        signonResponseMessageSet.setSONRS(signonResponse);

        return signonResponseMessageSet;
    }

    /**
     *
     * @param myTransactions
     * @return
     * @throws investiagenofx.util.MyOwnException
     */
    public static InvestmentStatementResponseMessageSetV1 genTransacInvestmentStatementResponseMessageSet(MyTransactions myTransactions) throws MyOwnException {
        InvestmentStatementResponseMessageSetV1 investmentStatementResponseMessageSet = new InvestmentStatementResponseMessageSetV1();
        InvestmentStatementTransactionResponse investmentStatementTransactionResponse = new InvestmentStatementTransactionResponse();
        investmentStatementTransactionResponse.setTRNUID("0");
        Status status = new Status();
        status.setCODE("0");
        status.setSEVERITY(SeverityEnum.INFO);
        investmentStatementTransactionResponse.setSTATUS(status);
        InvestmentStatementResponse investmentStatementResponse = new InvestmentStatementResponse();
        investmentStatementResponse.setDTASOF(myTransactions.getDtServer());
        investmentStatementResponse.setCURDEF(CurrencyEnum.fromValue(currency));
        InvestmentAccount investmentAccount = new InvestmentAccount();
        investmentAccount.setACCTID(myTransactions.getAcctID());
        investmentAccount.setBROKERID("le.com");
        investmentStatementResponse.setINVACCTFROM(investmentAccount);
        InvestmentTransactionList investmentTransactionList = new InvestmentTransactionList();
        investmentTransactionList.setDTSTART(myTransactions.getDateLow().format(Utilities.myDateFormat()) + "100000");
        investmentTransactionList.setDTEND(myTransactions.getDateHigh().format(Utilities.myDateFormat()) + "100000");

        for (Transaction transaction : myTransactions.getTransactions()) {
            switch (transaction.getType()) {
                case "Redemption":
                case "Switch Out":
                case "Transfer Out":
                    investmentTransactionList.getBUYDEBTOrBUYMFOrBUYOPT().add(genSellMutualfund(transaction));
                    break;
                case "Purchase":
                case "Switch In":
                case "Transfer In":
                    investmentTransactionList.getBUYDEBTOrBUYMFOrBUYOPT().add(genBuyMutualfund(transaction));
                    break;
                case "Distribution":
                    investmentTransactionList.getBUYDEBTOrBUYMFOrBUYOPT().add(genReinvest(transaction));
                    break;
                default:
                    try {
                        throw new MyOwnException("TransTypeUnsupported: " + transaction.getType().trim());
                    } catch (MyOwnException ex) {
                        Logger.getLogger(OFXUtilites.class.getName()).log(Level.SEVERE, null, ex);
                        throw ex;
                    }
            }
        }
        investmentStatementResponse.setINVTRANLIST(investmentTransactionList);

        InvestmentPositionList investmentPositionList = new InvestmentPositionList();
        for (Investment investment : InvestiaGenOFXController.investments) {
            if (investment.getName().equals("Cash")) {
                continue;
            }
            investmentPositionList.getPOSMFOrPOSSTOCKOrPOSDEBT().add(genPositionMutualfund(
                    investment.getSymbol(),
                    Float.toString(investment.getQuantity()),
                    Float.toString(investment.getLastPrice()),
                    Float.toString(investment.getQuantity() * investment.getLastPrice()),
                    investment.getBalanceDate().format(Utilities.myDateFormat()) + "100000"));
        }
        investmentStatementResponse.setINVPOSLIST(investmentPositionList);

        investmentStatementTransactionResponse.setINVSTMTRS(investmentStatementResponse);
        investmentStatementResponseMessageSet.getINVSTMTTRNRSOrINVMAILTRNRSOrINVMAILSYNCRS().add(investmentStatementTransactionResponse);

        return investmentStatementResponseMessageSet;
    }

    /**
     *
     * @param myTransactions
     * @return
     */
    public static InvestmentStatementResponseMessageSetV1 genUpdateInvestmentStatementResponseMessageSet(MyTransactions myTransactions) {
        InvestmentStatementResponseMessageSetV1 investmentStatementResponseMessageSet = new InvestmentStatementResponseMessageSetV1();
        InvestmentStatementTransactionResponse investmentStatementTransactionResponse = new InvestmentStatementTransactionResponse();
        investmentStatementTransactionResponse.setTRNUID("0");
        Status status = new Status();
        status.setCODE("0");
        status.setSEVERITY(SeverityEnum.INFO);
        investmentStatementTransactionResponse.setSTATUS(status);
        InvestmentStatementResponse investmentStatementResponse = new InvestmentStatementResponse();
        investmentStatementResponse.setDTASOF(myTransactions.getDtServer());
        investmentStatementResponse.setCURDEF(CurrencyEnum.CAD);
        InvestmentAccount investmentAccount = new InvestmentAccount();
        investmentAccount.setACCTID(myTransactions.getAcctID());
        investmentAccount.setBROKERID("le.com");
        investmentStatementResponse.setINVACCTFROM(investmentAccount);
        InvestmentPositionList investmentPositionList = new InvestmentPositionList();
        for (Transaction transaction : myTransactions.getTransactions()) {
            investmentPositionList.getPOSMFOrPOSSTOCKOrPOSDEBT().add(genPositionMutualfund(
                    transaction.getSymbol(),
                    transaction.getUnitBalance(),
                    transaction.getPrice(),
                    Float.toString(Float.parseFloat(transaction.getUnitBalance()) * Float.parseFloat(transaction.getPrice())),
                    transaction.getDate().format(Utilities.myDateFormat()) + "100000"));
        }
        investmentStatementResponse.setINVPOSLIST(investmentPositionList);
        investmentStatementTransactionResponse.setINVSTMTRS(investmentStatementResponse);
        investmentStatementResponseMessageSet.getINVSTMTTRNRSOrINVMAILTRNRSOrINVMAILSYNCRS().add(investmentStatementTransactionResponse);

        return investmentStatementResponseMessageSet;
    }

    private static PositionMutualFund genPositionMutualfund(String symbol, String units, String unitPrice, String marketValue, String datePrice) {
        PositionMutualFund positionMutualFund = new PositionMutualFund();
        InvestmentPosition investmentPosition = new InvestmentPosition();
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(symbol);
        securityId.setUNIQUEIDTYPE("CUSIP");
        investmentPosition.setSECID(securityId);
        investmentPosition.setHELDINACCT(SubAccountEnum.CASH);
        investmentPosition.setPOSTYPE(PositionTypeEnum.LONG);
        investmentPosition.setUNITS(units);
        investmentPosition.setUNITPRICE(unitPrice);
        investmentPosition.setMKTVAL(marketValue);
        investmentPosition.setDTPRICEASOF(datePrice);
        positionMutualFund.setINVPOS(investmentPosition);
        return positionMutualFund;
    }

    /**
     *
     * @param myTransactions
     * @param investments
     * @return
     */
    public static SecurityListResponseMessageSetV1 genSecurityListResponseMessageSet(MyTransactions myTransactions, ObservableList<Investment> investments) {
        List<String> symbols = new ArrayList<>();
        SecurityListResponseMessageSetV1 securityListResponseMessageSet = new SecurityListResponseMessageSetV1();
        SecurityList securityList = new SecurityList();

        for (Transaction transaction : myTransactions.getTransactions()) {
            if (!symbols.contains(transaction.getSymbol())) {
                securityList.getMFINFOOrSTOCKINFOOrOPTINFO().add(genMutualFundInfo(transaction.getSymbol()));
                symbols.add(transaction.getSymbol());
            }
        }
        for (Investment investment : investments) {
            if (!symbols.contains(investment.getSymbol()) && !investment.getName().equals("Cash")) {
                securityList.getMFINFOOrSTOCKINFOOrOPTINFO().add(genMutualFundInfo(investment.getSymbol()));
                symbols.add(investment.getSymbol());
            }
        }
        
        securityListResponseMessageSet.setSECLIST(securityList);

        return securityListResponseMessageSet;
    }

    private static MutualFundInfo genMutualFundInfo(String symbol) {
        MutualFundInfo mutualFundInfo = new MutualFundInfo();
        GeneralSecurityInfo generalSecurityInfo = new GeneralSecurityInfo();
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(symbol);
        securityId.setUNIQUEIDTYPE("CUSIP");
        generalSecurityInfo.setSECID(securityId);
        generalSecurityInfo.setSECNAME(symbol);
        generalSecurityInfo.setTICKER(symbol);
        mutualFundInfo.setSECINFO(generalSecurityInfo);
        mutualFundInfo.setMFTYPE(MutualFundTypeEnum.OPENEND);

        return mutualFundInfo;
    }

    private static SellMutualFund genSellMutualfund(Transaction transaction) {
        String myFitid;
        SellMutualFund sellMutualfund = new SellMutualFund();
        InvestmentSell investmentSell = new InvestmentSell();
        InvestmentTransaction investmentTransaction = new InvestmentTransaction();
        myFitid = "100000" + transaction.getFitid() + transaction.getUnit() + transaction.getSymbol();
        investmentTransaction.setFITID("Vente" + transaction.getDate().format(Utilities.myDateFormat()) + myFitid);
        investmentTransaction.setDTTRADE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setDTSETTLE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setMEMO("Vente");
        investmentSell.setINVTRAN(investmentTransaction);
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(transaction.getSymbol());
        securityId.setUNIQUEIDTYPE("CUSIP");
        investmentSell.setSECID(securityId);
        investmentSell.setUNITS(transaction.getUnit());
        investmentSell.setUNITPRICE(transaction.getPrice());
        investmentSell.setTOTAL(transaction.getAmount().replace("-", ""));
        investmentSell.setSUBACCTSEC(SubAccountEnum.CASH);
        investmentSell.setSUBACCTFUND(SubAccountEnum.CASH);
        sellMutualfund.setSELLTYPE(SellTypeEnum.SELL);
        sellMutualfund.setINVSELL(investmentSell);

        return sellMutualfund;
    }

    private static BuyMutualFund genBuyMutualfund(Transaction transaction) {
        String myFitid;
        BuyMutualFund buyMutualfund = new BuyMutualFund();
        InvestmentBuy investmentBuy = new InvestmentBuy();
        InvestmentTransaction investmentTransaction = new InvestmentTransaction();
        myFitid = "100000" + transaction.getFitid() + transaction.getUnit() + transaction.getSymbol();
        investmentTransaction.setFITID("Achat" + transaction.getDate().format(Utilities.myDateFormat()) + myFitid);
        investmentTransaction.setDTTRADE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setDTSETTLE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setMEMO("Achat");
        investmentBuy.setINVTRAN(investmentTransaction);
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(transaction.getSymbol());
        securityId.setUNIQUEIDTYPE("CUSIP");
        investmentBuy.setSECID(securityId);
        investmentBuy.setUNITS(transaction.getUnit());
        investmentBuy.setUNITPRICE(transaction.getPrice());
        investmentBuy.setTOTAL("-" + transaction.getAmount());
        investmentBuy.setSUBACCTSEC(SubAccountEnum.CASH);
        investmentBuy.setSUBACCTFUND(SubAccountEnum.CASH);
        buyMutualfund.setBUYTYPE(BuyEnum.BUY);
        buyMutualfund.setINVBUY(investmentBuy);

        return buyMutualfund;
    }

    private static Reinvest genReinvest(Transaction transaction) {
        String myFitid;
        Reinvest reinvest = new Reinvest();
        InvestmentTransaction investmentTransaction = new InvestmentTransaction();
        myFitid = "100000" + transaction.getFitid() + transaction.getUnit() + transaction.getSymbol();
        investmentTransaction.setFITID("ReInvest" + transaction.getDate().format(Utilities.myDateFormat()) + myFitid);
        investmentTransaction.setDTTRADE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setDTSETTLE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setMEMO("ReInvest");
        reinvest.setINVTRAN(investmentTransaction);
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(transaction.getSymbol());
        securityId.setUNIQUEIDTYPE("CUSIP");
        reinvest.setSECID(securityId);
        reinvest.setUNITS(transaction.getUnit());
        reinvest.setUNITPRICE(transaction.getPrice());
        reinvest.setTOTAL("-" + transaction.getAmount());
        reinvest.setSUBACCTSEC(SubAccountEnum.CASH);
        reinvest.setINCOMETYPE(IncomeEnum.DIV);

        return reinvest;
    }

    /**
     *
     * @return
     */
    public static String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     */
    public static void setCurrency(String currency) {
        OFXUtilites.currency = currency;
    }
}
