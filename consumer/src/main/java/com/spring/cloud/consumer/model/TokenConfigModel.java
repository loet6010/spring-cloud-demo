package com.spring.cloud.consumer.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * token配置bean
 */
public class TokenConfigModel {
    // 主键ID
    private long id;
    // token验证字段名
    private String tokenName;
    // token验证的URL
    private String tokenUrl;
    // URL名称
    private String urlName;
    // 状态
    private int status;
    // 创建时间
    private Date createTime;

    /**
     * 获取主键ID
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 获取token验证字段名
     *
     * @return the tokenName
     */
    public String getTokenName() {
        return tokenName;
    }

    /**
     * 设置token验证字段名
     *
     * @param tokenName
     */
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    /**
     * 获取token验证的URL
     *
     * @return the tokenUrl
     */
    public String getTokenUrl() {
        return tokenUrl;
    }

    /**
     * 设置token验证的URL
     *
     * @param tokenUrl
     */
    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    /**
     * 获取URL名称
     *
     * @return the urlName
     */
    public String getUrlName() {
        return urlName;
    }

    /**
     * 设置URL名称
     *
     * @param urlName
     */
    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    /**
     * 获取状态
     *
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
