package com.project.controller;

import com.project.daomain.Information;
import com.project.daomain.User;
import com.project.service.Informationservice;
import com.project.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {
    @Autowired
    Userservice userservice;
    @Autowired
    Informationservice informationservice;
    @RequestMapping("/singin")
    public String login1(String name,String password,Model model,Model model1){
        System.out.println("执行方法");
        if(name.equals("") || password.equals("")){
            return "false";
        }else {
            User user=userservice.findBynamepassword(name,password);
            if(user==null){
                return "false";
            }else{
                model1.addAttribute("user",user);
                List<Information> informationList=informationservice.infotop();
                model.addAttribute("informationList",informationList);
                return "shouye";
            }
        }
    }
    @RequestMapping("/register")
    public String Register(){
        return "register";
    }
    @RequestMapping("/sb")
    public String func(String name,String password,String username,String phone,String QQ,Model model){
        if(name==""||password==""||username==""||phone==""||QQ==""){
            return "false";
        }else {
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            user.setUsername(username);
            user.setPhone(phone);
            user.setQQ(QQ);
            userservice.adduser(user);
            List<User> userList = userservice.findall();
            model.addAttribute("userList", userList);
            return "index";
        }
    }
    @RequestMapping("/sd")
    public String test1(Model model){
        List<Information> informationList=informationservice.find();
        model.addAttribute("informationList",informationList);
        return "info";
    }
    @RequestMapping("/own")
    public String own(@RequestParam(name = "id") String id){
        System.out.println(id);
        int oid=Integer.parseInt(id);
        return "own";
    }
}
