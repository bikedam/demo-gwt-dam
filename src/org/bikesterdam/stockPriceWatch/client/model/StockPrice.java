package org.bikesterdam.stockPriceWatch.client.model;

import java.io.Serializable;

public class StockPrice implements Serializable {

    private String symbol;
    private double price;
    private double change;
    private float changePercent;

    public StockPrice() {
    }
    public StockPrice(String symbol, double price, double change) {
        this.symbol = symbol;
        this.price = price;
        this.change = change;
        this.changePercent = 10;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public float getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(float changePercent) {
        this.changePercent = changePercent;
    }
}
