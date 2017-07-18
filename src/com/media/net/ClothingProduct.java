package com.media.net;

/**
 * Created by paras.a on 17/07/17.
 */
public class ClothingProduct extends Product {
    public ClothingProduct(Integer productId, String name) {
        super(productId, name);
    }

    @Override
    public String getProductType() {
        return "Clothes";
    }

    @Override
    public void methodOne() {

    }
}
