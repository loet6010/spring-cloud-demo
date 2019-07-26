package com.spring.cloud.consumer.service;

import com.spring.cloud.consumer.model.TokenConfigModel;

import java.util.List;

/**
 * @Author liurh
 * @Description TokenConfigService
 * @Date 2019/7/26
 */
public interface TokenConfigService {

    /**
     * 获取token配置
     *
     * @return
     */
    List<TokenConfigModel> getTokenConfigList();
}
