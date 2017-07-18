package com.media.net;

/**
 * Created by paras.a on 17/07/17.
 */
public abstract class Supplier {
    private Integer id;
    private String name;
    private String address;

    public abstract String getSupplierType();

    public Supplier(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
