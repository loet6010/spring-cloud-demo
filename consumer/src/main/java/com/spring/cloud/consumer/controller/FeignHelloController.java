package com.spring.cloud.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.spring.cloud.consumer.feign.FeignProducerService;
import com.spring.cloud.consumer.model.TokenConfigModel;
import com.spring.cloud.consumer.service.TokenConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author liurh
 * @Description FeignHelloController
 * @Date 2019/7/19
 */
@RestController
public class FeignHelloController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TokenConfigService tokenConfigService;
    @Autowired
    FeignProducerService feignProducerService;

    @RequestMapping("/hello")
    public Object index(String name) {
        List<TokenConfigModel> tokenConfigModelList = tokenConfigService.getTokenConfigList();
        logger.info("Token list size:{}", tokenConfigModelList.size());

        logger.info("test name :{}", name);
        String feignName = feignProducerService.hello(name);
        logger.info("feign name :{}", feignName);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Feign_name", feignName);
        jsonObject.put("Token_list", tokenConfigModelList);
        return jsonObject;
    }
}
