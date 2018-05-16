package com.yc.generator.entity;

import java.util.Date;

public class SnBjb {
    private Integer id;

    private String commodityName;

    private String commodityPrice;

    private String commodityUrl;

    private String commodityShop;

    private String commodityImgUrl;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice == null ? null : commodityPrice.trim();
    }

    public String getCommodityUrl() {
        return commodityUrl;
    }

    public void setCommodityUrl(String commodityUrl) {
        this.commodityUrl = commodityUrl == null ? null : commodityUrl.trim();
    }

    public String getCommodityShop() {
        return commodityShop;
    }

    public void setCommodityShop(String commodityShop) {
        this.commodityShop = commodityShop == null ? null : commodityShop.trim();
    }

    public String getCommodityImgUrl() {
        return commodityImgUrl;
    }

    public void setCommodityImgUrl(String commodityImgUrl) {
        this.commodityImgUrl = commodityImgUrl == null ? null : commodityImgUrl.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}