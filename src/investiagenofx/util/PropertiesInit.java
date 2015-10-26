/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx.util;

import investiagenofx.InvestiaGenOFX;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Pierre
 */
public class PropertiesInit {

    private static String investiaURL;
    private static String lastGenUsedDate;
    private static String clientNumList;

    /**
     *
     */
    public static void getProperties() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(InvestiaGenOFX.class.getSimpleName() + ".properties"));
            if (!(prop.size() == 3)) {
                initProperties();
            }
            investiaURL = prop.getProperty("investiaURL").trim();
            lastGenUsedDate = prop.getProperty("lastGenUsedDate").trim();
            clientNumList = prop.getProperty("clientNumList").trim();
        } catch (IOException ex) {
            ex.printStackTrace();
            initProperties();
        }

    }

    private static void initProperties() {
        investiaURL = "https://client.investia.ca";
        lastGenUsedDate = "2015-01-01";
        clientNumList = "";
        setProperties();
        System.exit(0);
    }

    /**
     *
     */
    public static void setProperties() {
        Properties prop = new Properties();
        try {
            prop.setProperty("investiaURL", investiaURL);
            prop.setProperty("lastGenUsedDate", lastGenUsedDate);
            prop.setProperty("clientNumList", clientNumList);
            prop.store(new FileOutputStream(InvestiaGenOFX.class.getSimpleName() + ".properties"), null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @return the investiaURL
     */
    public static String getInvestiaURL() {
        return investiaURL;
    }

    /**
     * @param aInvestiaURL the investiaURL to set
     */
    public static void setInvestiaURL(String aInvestiaURL) {
        investiaURL = aInvestiaURL;
    }

    /**
     * @return the lastGenUsedDate
     */
    public static String getLastGenUsedDate() {
        return lastGenUsedDate;
    }

    /**
     * @param aLastGenUsedDate the lastGenUsedDate to set
     */
    public static void setLastGenUsedDate(String aLastGenUsedDate) {
        lastGenUsedDate = aLastGenUsedDate;
    }

    /**
     * @return the clientNumList
     */
    public static String getClientNumList() {
        return clientNumList;
    }

    /**
     * @param aClientNumList the clientNumList to set
     */
    public static void setClientNumList(String aClientNumList) {
        clientNumList = aClientNumList;
    }
}
