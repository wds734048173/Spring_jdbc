package org.lanqiao.jdbc.service;

import org.lanqiao.jdbc.pojo.User;

import java.util.List;

/**
 * @Auther: WDS
 * @Date: 2018/12/20 18:57
 * @Description:
 */
public interface IUserService {
    public void add(User user);
    public void remove(int id);
    public void modify(User user);
    public User getById(int id);
    public List<User> getAll();
}
