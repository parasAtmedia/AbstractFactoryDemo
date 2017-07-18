package com.media.net;

/**
 * Created by paras.a on 17/07/17.
 */
public abstract class Product {
    private Integer productId;
    private String name;
    private Double price;

    public Product(Integer productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public abstract String getProductType();

    public abstract void methodOne();

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
