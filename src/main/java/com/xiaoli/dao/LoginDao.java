package com.xiaoli.dao;

import com.xiaoli.entity.User;

public interface LoginDao {
//    /**
//     * 添加用户
//     * @param user
//     * @return
//     */
//    int add(User user);
//
//    /**
//     * 查询全部用户
//     * @return
//     */
//    List<User> queryAll();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User queryByUserId(int id);
}
