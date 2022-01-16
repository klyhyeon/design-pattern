package com.baekho.design.pattern.abstraction.domain.userinfo.dao;

import com.baekho.design.pattern.abstraction.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void deleteUserInfo(UserInfo userInfo);
}
