package com.example.demo.entity;

import java.util.Date;

public class SwiperPO {
    Long id;
    /**
     * 商品id
     */

    /**
     * 图片url
     */
    String imageSrc;
    /**
     * 打开方式
     */
    String openType;
    /**
     * 导航链接
     */
    String navigatorUrl;
    /**
     * 创建时间
     */
    Date createTime;
    /**
     * 更新时间
     */
    Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public String getNavigatorUrl() {
        return navigatorUrl;
    }

    public void setNavigatorUrl(String navigatorUrl) {
        this.navigatorUrl = navigatorUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
