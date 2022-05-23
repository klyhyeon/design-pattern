package com.baekho.design.pattern.solid.lsp;

public abstract class Item {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract boolean isNotDiscountItem();
}
