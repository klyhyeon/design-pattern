package com.baekho.design.pattern.abstraction.domain.product.dao;

import com.baekho.design.pattern.abstraction.domain.product.Product;

public class MySqlProductDao implements ProductDao {
    @Override
    public void insertUserInfo(Product userInfo) {
        System.out.println("mysqlProduct insert:: " +  userInfo.getName());
    }

    @Override
    public void updateUserInfo(Product userInfo) {
        System.out.println("mysqlProduct update:: " +  userInfo.getName());
    }

    @Override
    public void deleteUserInfo(Product userInfo) {
        System.out.println("mysqlProduct delete:: " +  userInfo.getName());
    }
}
