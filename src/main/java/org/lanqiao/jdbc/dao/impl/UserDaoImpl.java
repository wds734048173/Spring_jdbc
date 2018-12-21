package org.lanqiao.jdbc.dao.impl;

import org.lanqiao.jdbc.dao.IUserDao;
import org.lanqiao.jdbc.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        String sql = "select * from tb_user where id = ?";

        User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(),id);
        return user;
    }

    @Override
    public List<User> getUserList() {
        String sql = "select * from tb_user";
        List<User> userList = jdbcTemplate.query(sql, new UserRowMapper());
        return userList;
    }


    private class UserRowMapper implements RowMapper<User>{
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = User.builder().build();
            user.setId(resultSet.getInt("id"));
            user.setAge(resultSet.getInt("age"));
            user.setUsername(resultSet.getString("username"));
            user.setEmail(resultSet.getString("email"));
            user.setSex(resultSet.getString("sex"));
            return user;
        }
    }
}
