package com.wanyibing.fegin;

import com.wanyibing.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user/list")
public interface UserClient {

    @RequestMapping(path = "/order/list",method = RequestMethod.GET)
    User list();

}
