package com.baekho.design.pattern.encapsulation;

public class Wallet {

    private int total;

    public int getTotal() {
        return total;
    }

    public void substractTotal(int payment) {
        this.total -= payment;
    }
}
