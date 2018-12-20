package org.lanqiao.jdbc.pojo;

import lombok.*;

/**
 * @Auther: WDS
 * @Date: 2018/12/20 18:56
 * @Description:
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private int id;
    private int age;
    private String username;
    private String sex;
    private String email;
}
