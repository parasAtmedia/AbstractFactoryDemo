package com.media.net;

/**
 * Created by paras.a on 17/07/17.
 */
public class BooksProduct extends Product {

    public BooksProduct(Integer productId, String name) {
        super(productId, name);
    }

    @Override
    public String getProductType() {
        return "Books";
    }

    @Override
    public void methodOne() {

    }
}
