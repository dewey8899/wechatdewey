package spring.cloud.ykf.eureka.provide.main.service;

import spring.cloud.ykf.eureka.provide.main.entry.User;

/**
 * Author: Administrator
 * Date 2018/12/18 0018 下午 10:36
 */
public interface UserService {
    User findUser(Long id);
    int saveUser(User user);
    int deleteUser(Long id);
}
