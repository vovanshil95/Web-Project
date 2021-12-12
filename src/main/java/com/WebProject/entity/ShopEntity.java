package com.WebProject.entity;


import javax.persistence.*;

@Entity
@Table(name="shop")
public class ShopEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;

    @Column(name = "email", length =  64, nullable = false)
    private String email;

    @Column(name = "password", length =  64, nullable = false)
    private  String password;

    @Column(name = "name", length = 64, nullable = false)
    private String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}