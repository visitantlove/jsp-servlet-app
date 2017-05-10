package com.xiaoli.dao.impl;

import com.xiaoli.dao.LoginDao;
import com.xiaoli.entity.User;
import com.xiaoli.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

//    public int add(User user) {
//        return 0;
//    }
//
//    public List<User> queryAll() {
//        return null;
//    }

    public User queryByUserId(int id) {
        String sql = "SELECT * FROM user_info WHERE user_id = ?";
        conn = JDBCUtil.getConnection();
        User user = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int userId = rs.getInt("user_id");
                String userName = rs.getString("user_name");
                int age = rs.getInt("user_age");
                String password = rs.getString("user_password");
                user = new User(userId,userName,age,password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn, ps, rs);
        }
        return user;
    }

}
