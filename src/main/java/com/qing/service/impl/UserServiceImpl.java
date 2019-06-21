package com.qing.service.impl;

import com.qing.entity.User;
import com.qing.mapper.UserDao;
import com.qing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/21 15:58
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
       return (userDao.addUser(user) > 0) ? true : false;
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public boolean deleteUserById(int id) {
        return (userDao.deleteUserById(id) > 0) ? true : false;
    }

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }

    @Override
    public boolean updateUser(User user) {
        return ( userDao.updateUser(user) > 0) ? true : false;
    }
}
