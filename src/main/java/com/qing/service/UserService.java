package com.qing.service;

import com.qing.entity.User;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/21 15:57
 * @Version 1.0
 */
public interface UserService {

    boolean addUser(User user);

    User getUserByName(String name);

    boolean deleteUserById(int id);

    List<User> getUser();

    boolean updateUser(User user);
}
