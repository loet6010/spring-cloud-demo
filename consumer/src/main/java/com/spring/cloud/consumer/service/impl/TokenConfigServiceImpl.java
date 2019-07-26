package com.spring.cloud.consumer.service.impl;

import com.spring.cloud.consumer.dao.TokenConfigMapper;
import com.spring.cloud.consumer.model.TokenConfigModel;
import com.spring.cloud.consumer.service.TokenConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * token验证Service
 */
@Service("tokenConfigService")
public class TokenConfigServiceImpl implements TokenConfigService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TokenConfigMapper tokenConfigMapper;

    /**
     * 获取token配置
     *
     * @return
     */
    @Override
    public List<TokenConfigModel> getTokenConfigList() {
        List<TokenConfigModel> tokenConfigModelList = tokenConfigMapper.selectTokenConfigList();
        for (TokenConfigModel tokenConfigModel : tokenConfigModelList) {
            logger.info("token:{}",tokenConfigModel.toString());
        }

        return tokenConfigModelList;
    }
}
