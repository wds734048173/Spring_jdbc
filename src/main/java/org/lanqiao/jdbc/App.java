package org.lanqiao.jdbc;

import org.lanqiao.jdbc.pojo.User;
import org.lanqiao.jdbc.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       //测试连接是否可用
        /*JdbcTemplate jdbcTemplate = context.getBean("myJdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
        System.out.println(jdbcTemplate.getDataSource());*/

        IUserService userService = context.getBean("userService",IUserService.class);
        //新增
        /*User user = User.builder().username("wds").age(28).sex("男").email("wds@126.com").build();
        userService.add(user);
        //修改
        User user1 = User.builder().id(1).username("wds1").age(281).sex("女").email("wds1@126.com").build();
        userService.modify(user1);*/
        //删除
        userService.remove(1);
    }
}
