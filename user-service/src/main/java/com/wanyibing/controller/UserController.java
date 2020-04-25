package com.wanyibing.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wanyibing.entity.User;
import com.wanyibing.fegin.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller控制层
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserClient userClient;

    /**
     * 服务调用失败 采取这边
     * @param id
     * @return
     */
    public User usergetlistRack(Integer id){
        User user = new User();
        user.setId(id);
        user.setUserName("Gudingzhi");
        return user;
    }

    @HystrixCommand(fallbackMethod = "usergetlistRack")
    @RequestMapping("list")
    public User getlist(@RequestParam("id") Integer id){
        //服务调用
        User user= userClient.list();
            user.setId(id);
        return user;
    }

}
