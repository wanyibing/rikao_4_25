package com.wanyibing.controller;

import com.wanyibing.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {


    @RequestMapping("list")
    public User getuser(){
        User user = new User();
        user.setUserName("gudingzhi");
        return user;
    }

}
