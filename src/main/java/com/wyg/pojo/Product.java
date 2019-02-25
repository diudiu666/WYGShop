package com.wyg.pojo;

/**
 * 商品类
 */
public class Product {
    private Integer id;                 //商品编号
    private String name;                //商品名称
    private Integer price;              //商品价格
    private Integer stock;              //商品库存
    private Integer categoryLevel1Id;   //一级分类
    private Integer categoryLevel2Id;   //二级分类
    private Integer categoryLevel3Id;   //三级分类
    private String fileName;            //商品图片文件名称
    private Integer isDelete;           //是否删除 0：未删除 1：删除
    private Integer isHot;              //是否是热门 0：非热门  1：热门
    private Integer ismmiaosha;         //是否是秒杀 0：不是 1：是
    private Integer sales;              //销量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategoryLevel1Id() {
        return categoryLevel1Id;
    }

    public void setCategoryLevel1Id(Integer categoryLevel1Id) {
        this.categoryLevel1Id = categoryLevel1Id;
    }

    public Integer getCategoryLevel2Id() {
        return categoryLevel2Id;
    }

    public void setCategoryLevel2Id(Integer categoryLevel2Id) {
        this.categoryLevel2Id = categoryLevel2Id;
    }

    public Integer getCategoryLevel3Id() {
        return categoryLevel3Id;
    }

    public void setCategoryLevel3Id(Integer categoryLevel3Id) {
        this.categoryLevel3Id = categoryLevel3Id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getIsmmiaosha() {
        return ismmiaosha;
    }

    public void setIsmmiaosha(Integer ismmiaosha) {
        this.ismmiaosha = ismmiaosha;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
}
