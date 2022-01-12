package com.baekho.design.pattern.encapsulation;

import javax.naming.LimitExceededException;

public class Customer {
    private Wallet wallet;

    public void pay(int payment) throws LimitExceededException {
        if (wallet == null) {
            throw new NullPointerException();
        }
        if (wallet.getTotal() < payment) {
            throw new LimitExceededException();
        }
        wallet.substractTotal(payment);
    }
}
