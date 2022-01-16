package com.baekho.design.pattern.abstraction.web;

import com.baekho.design.pattern.abstraction.domain.product.Product;
import com.baekho.design.pattern.abstraction.domain.product.dao.ProductDao;
import com.baekho.design.pattern.abstraction.domain.userinfo.UserInfo;
import com.baekho.design.pattern.abstraction.factory.DaoFactory;
import com.baekho.design.pattern.abstraction.factory.MySqlFactoryDao;
import com.baekho.design.pattern.abstraction.factory.OracleFactoryDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebClient {

    public static void main(String[] args) throws IOException {
        DaoFactory daoFactory = getDao();

        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setName("user1");

        Product product = new Product();
        product.setId(1);
        product.setName("product1");

        ProductDao productDao = daoFactory.createProductDao();
        productDao.updateUserInfo(product);
        productDao.insertUserInfo(product);
        productDao.deleteUserInfo(product);

    }

    private static DaoFactory getDao() throws IOException {
        FileInputStream fis = new FileInputStream("src//main//resources//application.properties");
        Properties property = new Properties();
        property.load(fis);

        String dbType = property.getProperty("DBTYPE");

        if (dbType.equals("MYSQL")) {
            return new MySqlFactoryDao();
        }
        return new OracleFactoryDao();
    }
}
