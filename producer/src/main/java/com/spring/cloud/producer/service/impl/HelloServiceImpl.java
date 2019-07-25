package com.spring.cloud.producer.service.impl;

import com.spring.cloud.producer.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author liurh
 * @Description HelloServiceImpl
 * @Date 2019/7/24
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getHelloName(String name) {
        logger.info("get name:{}", name);
        return "hello " + name + "，this is first service message";
    }
}
