package com.example.billfirst.controller;

import com.example.billfirst.dao.UserMapper;
import com.example.billfirst.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/users")
    public String list(Map<String, Object> map,User user){
        List<User> users=userMapper.getUsers(user);
        map.put("users", users);
        return "user/list";
    }

    @GetMapping("/user/{id}")
    public String view(@PathVariable("id") Integer id,
                       @RequestParam(value = "type",defaultValue = "view")String type,
                       Map<String,Object> map){
        User user=userMapper.getUserById(id);
        map.put("user",user);
        return "user/"+type;
    }

    //修改供应商信息
    @PutMapping("/user")
    public String update(User user){
        userMapper.updateUser(user);
        return "redirect:users";
    }

    //前往添加页面
    @GetMapping("/user")
    public String toAddPage(){
        return "user/add";
    }

    //添加数据
    @PostMapping("/user")
    public String add(User user){
        userMapper.addUser(user);
        return "redirect:/users";
    }

    //删除
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id")Integer id){
        userMapper.deleteUserById(id);
        return "redirect:/users";
    }

    @GetMapping("/user/pwd")
    public String toUpdatePwdPage(){
        return "main/password";
    }

    @ResponseBody
    @GetMapping("/user/pwd/{oldPwd}")
    public Boolean checkPwd(HttpSession session,@PathVariable("oldPwd")String oldPwd){
        User user=(User)session.getAttribute("loginUser");
        if(user.getPassword().equals(oldPwd)){
            return true;
        }
        return false;
    }

    @PostMapping("/user/pwd")
    public String updatePwd(HttpSession session,String password){
        User user=(User)session.getAttribute("loginUser");
        user.setPassword(password);
        userMapper.updateUser(user);
        return "redirect:/logout";
    }

}
