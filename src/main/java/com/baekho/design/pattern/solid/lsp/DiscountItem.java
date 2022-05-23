package com.baekho.design.pattern.solid.lsp;

public class DiscountItem extends Item {

    @Override
    public boolean isNotDiscountItem() {
        return false;
    }
}
