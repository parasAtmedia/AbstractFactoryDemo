package com.media.net;

/**
 * Created by paras.a on 17/07/17.
 */
public class ElectronicsProduct extends Product {


    public ElectronicsProduct(Integer productId, String name) {
        super(productId, name);
    }

    @Override
    public String getProductType() {
        return "Electronics";
    }

    @Override
    public void methodOne() {

    }
}
