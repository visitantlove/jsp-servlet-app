package com.xiaoli.service.impl;

import com.xiaoli.dao.LoginDao;
import com.xiaoli.dao.impl.LoginDaoImpl;
import com.xiaoli.entity.User;
import com.xiaoli.service.LoginService;

public class LoginServiceImpl implements LoginService {
    private LoginDao loginDao = new LoginDaoImpl();

    public User getUserInfoById(int id) {
        return loginDao.queryByUserId(id);
    }
}
