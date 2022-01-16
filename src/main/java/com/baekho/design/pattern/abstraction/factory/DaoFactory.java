package com.baekho.design.pattern.abstraction.factory;

import com.baekho.design.pattern.abstraction.domain.product.dao.ProductDao;
import com.baekho.design.pattern.abstraction.domain.userinfo.dao.UserInfoDao;

public interface DaoFactory {

    UserInfoDao createUserInfoDao();
    ProductDao createProductDao();
}
