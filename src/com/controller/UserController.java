package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


/**处理用户类请求
 * @author aizongbin
 * @date 2018/3/11 19:17
 */
@Controller
@SessionAttributes("user")
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName){
        //动态跳转页面
        return formName;
    }

    /**
     * 登陆
     * @param user 登陆者信息
     * @return
     */
    @RequestMapping("/login")
    public String findAllUser(User user,Model model){
        User user1=userService.findUserByUsername(user.getUsername());
        if (user.getPassword().equals(user.getPassword())) {
            model.addAttribute("user",user1);
            return "success";
        }
        return "error";
    }

    /**
     * 注册用户
     * @param user 用户信息
     * @return
     */
    @RequestMapping("/register")
    public String saveUser(User user){
        System.out.println(user.getUsername());
        userService.saveUser(user);
        return "success";
    }
}
