package com.WebProject.entity;


import javax.persistence.*;

@Entity
@Table(name = "person_product_order")
public class OrderRelations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    UserEntity user;


    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    ProductEntity product;


    @Column(name = "product_number", nullable = false)
    int productNumber;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
}