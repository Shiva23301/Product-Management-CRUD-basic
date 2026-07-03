package com.demoApplication.Product_Management.model;

public class Product {

    private int id;
    private int price;
    private String name;
    private String category;
    private String brand;

    public Product() {

    }

    public Product(int id, int price, String name, String category, String brand) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
