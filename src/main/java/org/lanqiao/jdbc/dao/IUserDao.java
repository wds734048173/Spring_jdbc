package org.lanqiao.jdbc.dao;

import org.lanqiao.jdbc.pojo.User;

import java.util.List;

/**
 * @Auther: WDS
 * @Date: 2018/12/20 18:56
 * @Description:
 */
public interface IUserDao {
    //新增用户
    public void insertUser(User user);
    //修改用户
    public void updateUser(User user);
    //删除用户
    public void deleteUser(int id);
    //通过用户id获取用户
    public User getUserById(int id);
    //获取用户列表
    public List<User> getUserList();
}
