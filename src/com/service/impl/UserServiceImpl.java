package com.service.impl;

import com.mapper.UserMapper;
import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**用户业务层实现类
 * @author aizongbin
 * @date 2018/3/11 19:12
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名查询用户，用于登陆
     * @param username 用户名
     * @return 返回查到的用户，没有查到返回null
     */
    @Override
    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }

    /**
     * 注册用户
     * @param user 用户
     */
    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }
}
