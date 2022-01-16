package com.baekho.design.pattern.abstraction.domain.product.dao;

import com.baekho.design.pattern.abstraction.domain.product.Product;

public class OracleProductDao implements ProductDao{
    @Override
    public void insertUserInfo(Product userInfo) {
        System.out.println("oracleProduct:: " +  userInfo.getName());
    }

    @Override
    public void updateUserInfo(Product userInfo) {
        System.out.println("oracleProduct:: " +  userInfo.getName());
    }

    @Override
    public void deleteUserInfo(Product userInfo) {
        System.out.println("oracleProduct:: " +  userInfo.getName());
    }
}
