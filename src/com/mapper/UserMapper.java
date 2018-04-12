package com.mapper;

import com.model.User;

import java.util.List;

/**
 * @author aizongbin
 * @date 2018/3/11 19:04
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户，用于登陆
     * @return 返回查到的用户，没有查到返回null
     */
    public User findUserByUsername(String username);

    /**
     * 注册用户
     * @param user 用户
     */
    public void saveUser(User user);
}
