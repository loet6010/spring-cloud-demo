package com.spring.cloud.consumer.feign;

import com.spring.cloud.consumer.feign.impl.FeignProducerServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author liurh
 * @Description FeignProducerService
 * @Date 2019/7/19
 */
// 指定服务的注册名，开启Hystrix后，fallback指定失败后的处理
@FeignClient(name = "spring-cloud-producer", fallback = FeignProducerServiceImpl.class)
public interface FeignProducerService {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
