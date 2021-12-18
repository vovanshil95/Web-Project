package com.WebProject.model;

import com.WebProject.entity.ProductEntity;

public class Product {

    public static Product toModel(ProductEntity productEntity) {
        Product product = new Product();

        product.id = productEntity.getId();

        product.name = productEntity.getName();

        product.description = productEntity.getDescription();

        product.photo = productEntity.getPhoto();

        product.price = productEntity.getPrice();

        product.number = productEntity.getNumber();

        product.shop = Shop.toModel(productEntity.getShop());

        return product;
    }

    private int id;

    private String name;

    private String description;

    private byte[] photo;

    private int price;

    private int number;

    private Shop shop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
