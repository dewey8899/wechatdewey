package spring.cloud.ykf.eureka.provide.main.mapper;

import spring.cloud.ykf.eureka.provide.main.entry.User;

/**
 * Author: Administrator
 * Date 2018/12/18 0018 下午 10:39
 */
public interface UserMapper {
    User findUser(Long id);

    int saveUser(User user);

    int deleteUser(Long id);
}
