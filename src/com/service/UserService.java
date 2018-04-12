package com.service;

import com.model.User;

import java.util.List;

/**用户类业务层接口
 * @author aizongbin
 * @date 2018/3/11 19:08
 */
public interface UserService {
    /**
     * 根据用户名查询用户，用于登陆
     * @param username 用户名
     * @return 返回查到的用户，没有查到返回null
     */
    public User findUserByUsername(String username);

    /**
     * 注册用户
     * @param user 用户
     */
    public void saveUser(User user);
}
