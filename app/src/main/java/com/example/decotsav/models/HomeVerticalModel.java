package com.example.decotsav.models;

public class HomeVerticalModel {

    int image;
    String name;
    String description;
    String price;
    String slot;

    public HomeVerticalModel(int image, String name, String description, String price, String slot) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
        this.slot = slot;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}
