package com.spring.cloud.consumer.feign.impl;

import com.spring.cloud.consumer.feign.FeignProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author liurh
 * @Description FeignProducerServiceImpl
 * @Date 2019/7/22
 */
@Component
public class FeignProducerServiceImpl implements FeignProducerService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String hello(String name) {
        logger.info("Hystrix name:{}", name);
        return "hello" + name + ", this message send failed";
    }
}
