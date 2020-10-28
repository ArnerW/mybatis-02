package com.qf.arner.mybatis.entity;

import java.io.Serializable;

public class Address implements Serializable {
    /**
     * 主键（地址ID）
     */
    private Integer addrId;

    /**
     * 外键（用户ID）
     */
    private Integer userId;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * 所在地
     */
    private String location;

    /**
     * 详细地址
     */
    private String detailedadd;

    /**
     * 默认收货地址 1为默认 0为不默认
     */
    private Integer isDef;

    private static final long serialVersionUID = 1L;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetailedadd() {
        return detailedadd;
    }

    public void setDetailedadd(String detailedadd) {
        this.detailedadd = detailedadd;
    }

    public Integer getIsDef() {
        return isDef;
    }

    public void setIsDef(Integer isDef) {
        this.isDef = isDef;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addrId=" + addrId +
                ", userId=" + userId +
                ", consignee='" + consignee + '\'' +
                ", tel='" + tel + '\'' +
                ", location='" + location + '\'' +
                ", detailedadd='" + detailedadd + '\'' +
                ", isDef=" + isDef +
                '}';
    }
}

