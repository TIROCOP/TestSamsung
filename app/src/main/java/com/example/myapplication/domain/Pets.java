package com.example.myapplication.domain;

public class Pets {
    private String name;
    private String imgUrl;
    private String breed;
    public Pets(String name, String imgUrl, String breed) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getBreed() {
        return breed;
    }
}
