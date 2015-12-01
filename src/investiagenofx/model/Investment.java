/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx.model;

import java.time.LocalDate;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Pierre
 */
public class Investment {

    private final SimpleStringProperty symbol = new SimpleStringProperty();
    private final SimpleStringProperty name = new SimpleStringProperty();
    private final SimpleFloatProperty lastPrice = new SimpleFloatProperty();
    private final SimpleFloatProperty quantity = new SimpleFloatProperty();
    private final SimpleFloatProperty marketValue = new SimpleFloatProperty();
    private final SimpleFloatProperty percentage = new SimpleFloatProperty();
    private final LocalDate balanceDate;

    public Investment(String symbol, String name, String quantity, String lastPrice, String marketValue, String percentage, LocalDate balanceDate) {
        this.symbol.set(symbol);
        this.name.set(name);
        this.quantity.setValue(Float.valueOf(quantity));
        this.lastPrice.setValue(Float.valueOf(lastPrice));
        this.marketValue.setValue(Float.valueOf(marketValue));
        this.percentage.setValue(Float.valueOf(percentage));
        this.balanceDate = balanceDate;
    }

    public String getSymbol() {
        return symbol.get();
    }

    public String getName() {
        return name.get();
    }

    public Float getLastPrice() {
        return lastPrice.get();
    }

    public Float getQuantity() {
        return quantity.get();
    }

    public Float getMarketValue() {
        return marketValue.get();
    }

    public Float getPercentage() {
        return percentage.get();
    }

    public LocalDate getBalanceDate() {
        return balanceDate;
    }
}
