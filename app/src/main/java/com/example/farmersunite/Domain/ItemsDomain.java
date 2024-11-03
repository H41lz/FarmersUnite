package com.example.farmersunite.Domain;

import java.io.Serializable;

public class ItemsDomain implements Serializable {
    private String imgPath;
    private String title;
    private double price;
    private String description;
    private double rate;

    public ItemsDomain(String imgPath, double rate, String title, double price, String description) {
        this.imgPath = imgPath;
        this.rate = rate;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
