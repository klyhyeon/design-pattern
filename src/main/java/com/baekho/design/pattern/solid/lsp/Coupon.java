package com.baekho.design.pattern.solid.lsp;

public class Coupon {

    private final double DISCOUNT_RATE = 0.4;

    public double calculateDiscountPrice(Item item) {

        if (item.isNotDiscountItem()) {
            return 0;
        }
        return item.getPrice() * DISCOUNT_RATE;
    }
}
