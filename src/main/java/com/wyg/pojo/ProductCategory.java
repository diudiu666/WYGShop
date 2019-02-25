package com.wyg.pojo;

/**
 * 分类详情类
 */
public class ProductCategory {
    private Integer id;             //商品id
    private String name;            //商品名称
    private Integer parentId;       //父级目录
    private Integer type;           //父类级别（1，2,3）
    private String iconClass;       //分类图标

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }
}
