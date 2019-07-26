package com.spring.cloud.consumer.dao;

import com.spring.cloud.consumer.model.TokenConfigModel;

import java.util.List;

/**
 * token验证Dao
 */
public interface TokenConfigMapper {

    /**
     * 查询token配置
     * @return
     */
    List<TokenConfigModel> selectTokenConfigList();
}
