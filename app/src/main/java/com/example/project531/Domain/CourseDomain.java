package com.example.project531.Domain;

import java.io.Serializable;

public class CourseDomain implements Serializable {
    private String title;
    private String pic;
    private String description;
    private Double fee;
    private int star;
    private int time;
    private String level;
    private int numberInCart;

    public CourseDomain(String title, String pic, String description, Double fee, int star, int time, String level) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.star = star;
        this.time = time;
        this.level = level;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCalories() {
        return level;
    }

    public void setCalories(String calories) {
        this.level = calories;
    }
}
