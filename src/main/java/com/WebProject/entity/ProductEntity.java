package com.WebProject.entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",  length = 64, nullable = false)
    private  String name;

    @Column(name = "description",  length = 1000, nullable = false)
    private  String description;

    @Column(name = "photo", nullable = false)
    private  byte[] photo;

    @Column(name = "price", nullable = false)
    private  int price;

    @Column(name = "number", nullable = false)
    private  int number;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private  ShopEntity shop;

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

    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }
}
