package com.baekho.design.pattern.solid.lsp;

public class CouponController {

    public static void main(String[] args) {

        Coupon coupon = new Coupon();
        Item item = new NoDiscountItem();
        item.setPrice(1.00);
        double price = coupon.calculateDiscountPrice(item);
        System.out.println("discounted price is: " + price);

        Item discountItem = new DiscountItem();
        discountItem.setPrice(1.00);
        double discountPrice = coupon.calculateDiscountPrice(discountItem);
        System.out.println("discounted price is: " + discountPrice);
    }
}
