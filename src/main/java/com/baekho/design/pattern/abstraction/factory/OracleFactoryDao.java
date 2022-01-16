package com.baekho.design.pattern.abstraction.factory;

import com.baekho.design.pattern.abstraction.domain.product.dao.OracleProductDao;
import com.baekho.design.pattern.abstraction.domain.product.dao.ProductDao;
import com.baekho.design.pattern.abstraction.domain.userinfo.dao.UserInfoDao;

public class OracleFactoryDao implements DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return null;
    }

    @Override
    public ProductDao createProductDao() {
        return new OracleProductDao();
    }
}
