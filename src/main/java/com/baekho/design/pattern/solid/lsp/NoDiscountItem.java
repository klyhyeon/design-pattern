package com.baekho.design.pattern.solid.lsp;

public class NoDiscountItem extends Item {

    @Override
    public boolean isNotDiscountItem() {
        return true;
    }
}
