package com.example.billfirst.controller;

import com.example.billfirst.dao.UserMapper;
import com.example.billfirst.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public String login(HttpSession session, String username, String password, Map<String,Object> map){
        if(!StringUtils.isEmpty(username)&&!StringUtils.isEmpty(password)){
            User user=userMapper.getUserByUsername(username);
            if(user!=null&&user.getPassword().equals(password)){
                session.setAttribute("loginUser",user);
                session.setMaxInactiveInterval(100);
                return "redirect:/main";
            }
        }
        map.put("msg","用户名或密码错误");
        return "main/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("loginUser");
        session.invalidate();
        return "redirect:/";
    }

}
