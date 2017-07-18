package com.media.net;

/**
 * Created by paras.a on 17/07/17.
 */
public class DomesticSupplier extends Supplier {
    @Override
    public String getSupplierType() {
        return "Domestic";
    }

    public DomesticSupplier(Integer id, String name, String address) {
        super(id, name, address);
    }
}
