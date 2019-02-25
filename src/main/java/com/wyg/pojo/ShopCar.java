package com.wyg.pojo;

/**
 * 购物车类
 */
public class ShopCar {
    private Integer id;         //id
    private Integer productId;  //商品id
    private Integer userId;     //用户id
    private Integer number;     //购买商品的数量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
