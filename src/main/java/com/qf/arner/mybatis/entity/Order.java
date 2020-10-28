package com.qf.arner.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//订单对应一个用户
public class Order implements Serializable {
    /**
     *
     */
    private Integer orderId;

    /**
     * 订单号
     */
    private Integer orderNo;

    /**
     * 创建时间
     */
    private Date createData;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 0表示未支付，1表示支付
     */
    private Integer status;

    /**
     * 单个用户
     */
    private User user;

    private List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", createData=" + createData +
                ", userId=" + userId +
                ", status=" + status +
                ", user=" + user +
                '}';
    }
}

