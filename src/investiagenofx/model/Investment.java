/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx.model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Pierre
 */
public class Investment {

    public SimpleStringProperty symbol = new SimpleStringProperty();
    public SimpleStringProperty name = new SimpleStringProperty();
    public SimpleFloatProperty lastPrice = new SimpleFloatProperty();
    public SimpleFloatProperty quantity = new SimpleFloatProperty();
    public SimpleFloatProperty marketValue = new SimpleFloatProperty();
    public SimpleFloatProperty percentage = new SimpleFloatProperty();

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
}
