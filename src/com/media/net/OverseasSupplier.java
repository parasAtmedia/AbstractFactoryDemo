package com.media.net;

/**
 * Created by paras.a on 17/07/17.
 */
public class OverseasSupplier extends Supplier {
    public OverseasSupplier(Integer id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public String getSupplierType() {
        return "Overseas";
    }
}
