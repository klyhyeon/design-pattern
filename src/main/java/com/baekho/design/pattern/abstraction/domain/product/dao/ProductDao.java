package com.baekho.design.pattern.abstraction.domain.product.dao;

import com.baekho.design.pattern.abstraction.domain.product.Product;

public interface ProductDao {

    void insertUserInfo(Product userInfo);

    void updateUserInfo(Product userInfo);

    void deleteUserInfo(Product userInfo);
}
