package com.wyg.pojo;

/**
 * 订单详情类
 */
public class OrderDetail {
    private Integer id;         //订单详情编号
    private Integer orderId;    //订单Id
    private Integer productId;  //商品Id
    private Integer quantity;   //数量
    private Double cost;        //消费

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
