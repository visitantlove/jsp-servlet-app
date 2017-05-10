package com.xiaoli.test;

import com.xiaoli.dao.LoginDao;
import com.xiaoli.dao.impl.LoginDaoImpl;
import com.xiaoli.entity.User;
import org.junit.Test;

public class JDBCTest {
    @Test
    public void testJDBC() {
        LoginDao login = new LoginDaoImpl();
        User user = login.queryByUserId(1);
        System.out.println(user);
    }
}
