package spring.cloud.ykf.eureka.provide.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cloud.ykf.eureka.provide.main.entry.User;
import spring.cloud.ykf.eureka.provide.main.mapper.UserMapper;
import spring.cloud.ykf.eureka.provide.main.service.UserService;

/**
 * Author: Administrator
 * Date 2018/12/18 0018 下午 10:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUser(Long id) {
        return userMapper.findUser(id);
    }

    @Override
    public int saveUser(User user) {
        this.userMapper.saveUser(user);
        return 1;
    }

    @Override
    public int deleteUser(Long id) {
        this.userMapper.deleteUser(id);
        return 1;
    }
}
