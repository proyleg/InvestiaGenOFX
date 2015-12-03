package investiagenofx.model;

import java.time.LocalDate;
import java.util.ArrayList;
import investiagenofx.util.Utilities;

/**
 *
 * @author Pierre
 */
public class MyTransactions {

    private final String acctID;
    private String dtServer;
    private LocalDate dateHigh;
    private LocalDate dateLow;
    private final ArrayList<Transaction> transactions;

    /**
     *
     * @param acctID
     */
    public MyTransactions(String acctID) {
        this.acctID = acctID;
        this.dtServer = Utilities.myDateFormat().format(LocalDate.now()) + "100000";
        this.dateHigh = LocalDate.parse("19000101", Utilities.myDateFormat());
        this.dateLow = LocalDate.parse("99991231", Utilities.myDateFormat());
        transactions = new ArrayList<>();
    }

    /**
     *
     * @param myTransaction
     */
    public void addTransaction(Transaction myTransaction) {
        this.transactions.add(myTransaction);

    }

    /**
     *
     * @return
     */
    public LocalDate getDateHigh() {
        return dateHigh;
    }

    /**
     *
     * @param dateHigh
     */
    public void setDateHigh(LocalDate dateHigh) {
        this.dateHigh = dateHigh;
    }

    /**
     *
     * @return
     */
    public LocalDate getDateLow() {
        return dateLow;
    }

    /**
     *
     * @param dateLow
     */
    public void setDateLow(LocalDate dateLow) {
        this.dateLow = dateLow;
    }

    /**
     *
     * @return
     */
    public String getDtServer() {
        return dtServer;
    }

    /**
     *
     * @param dtServer
     */
    public void setDtServer(String dtServer) {
        this.dtServer = dtServer;
    }

    /**
     *
     * @return
     */
    public String getAcctID() {
        return acctID;
    }

    /**
     *
     * @return
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

}
