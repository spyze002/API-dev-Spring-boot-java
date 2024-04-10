package com.myapp.shoppingbackend;

import org.springframework.boot.origin.TextResourceOrigin.Location;

public class Shoes {

    private String brand;
    private String color;
    private String size;
    private int price;
    private int stock;
    private int id;
    private String description;
    private String image;
    private String category;



    public Shoes(String brand, String color, String size, int price, int stock, int id, String description,
            String image, String category, Location location) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.stock = stock;
        this.id = id;
        this.description = description;
        this.image = image;
        this.category = category;

    }



    public Shoes() {
    }

    



    public Shoes(String brand, String color, String size, int price, int stock, String description, String image,
            String category) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.stock = stock;
        this.description = description;
        this.image = image;
        this.category = category;

    }



    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getImage() {
        return image;
    }


    public void setImage(String image) {
        this.image = image;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
