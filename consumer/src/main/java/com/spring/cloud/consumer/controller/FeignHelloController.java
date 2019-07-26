package com.spring.cloud.consumer.controller;

import com.spring.cloud.consumer.service.FeignProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liurh
 * @Description FeignHelloController
 * @Date 2019/7/19
 */
@RestController
public class FeignHelloController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    FeignProducerService feignProducerService;

    @RequestMapping("/hello")
    public String index(String name) {
        logger.info("test name :{}", name);
        String feignName = feignProducerService.hello(name);
        logger.info("feign name :{}", feignName);

        return "Feign Name:" + feignName;
    }
}
