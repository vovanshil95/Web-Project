package com.WebProject.model;

import com.WebProject.entity.ShopEntity;

public class Shop {

    public static Shop toModel(ShopEntity shopEntity) {
        Shop shop = new Shop();
        shop.id = shopEntity.getID();
        shop.name = shopEntity.getName();
        return shop;
    }

    private int id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
