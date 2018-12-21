package org.lanqiao.jdbc.service.impl;

import org.lanqiao.jdbc.dao.IUserDao;
import org.lanqiao.jdbc.pojo.User;
import org.lanqiao.jdbc.service.IUserService;

import java.util.List;

/**
 * @Auther: WDS
 * @Date: 2018/12/20 18:57
 * @Description:
 */
public class UserServiceImpl implements IUserService {
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    IUserDao userDao;
    @Override
    public void add(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void remove(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void modify(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getUserList();
    }
}
