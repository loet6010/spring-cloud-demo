package com.spring.cloud.producer.controller;

import com.spring.cloud.producer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liurh
 * @Description HelloController
 * @Date 2019/7/19
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String index(String name) {
        return helloService.getHelloName(name);
    }

}
