package com.baekho.design.pattern.abstraction.factory;

import com.baekho.design.pattern.abstraction.domain.product.dao.MySqlProductDao;
import com.baekho.design.pattern.abstraction.domain.product.dao.ProductDao;
import com.baekho.design.pattern.abstraction.domain.userinfo.dao.UserInfoDao;

public class MySqlFactoryDao implements DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return null;
    }

    @Override
    public ProductDao createProductDao() {
        return new MySqlProductDao();
    }
}
