package com.example.decotsav.models;

public class CustomizedVerticalModel {

    int image;
    String name;
    String description;
    String quantity;
    String price;
    String total;

    public CustomizedVerticalModel(int image, String name, String description, String quantity, String price, String total) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
