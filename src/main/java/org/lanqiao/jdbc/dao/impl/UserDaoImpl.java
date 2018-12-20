package org.lanqiao.jdbc.dao.impl;

import org.lanqiao.jdbc.dao.IUserDao;
import org.lanqiao.jdbc.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Auther: WDS
 * @Date: 2018/12/20 18:56
 * @Description:
 */
public class UserDaoImpl implements IUserDao {
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    JdbcTemplate jdbcTemplate;

    @Override
    public void insertUser(User user) {
        String sql = "insert into tb_user (username,sex,age,email) values (?,?,?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getSex(),user.getAge(),user.getEmail());
    }

    @Override
    public void updateUser(User user) {
        String sql = "update tb_user set username = ?,sex = ?,age = ?,email = ? where id = ?";
        jdbcTemplate.update(sql,user.getUsername(),user.getSex(),user.getAge(),user.getEmail(),user.getId());
    }

    @Override
    public void deleteUser(int id) {
        String sql = "delete from tb_user where id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getUserList() {
        return null;
    }
}
