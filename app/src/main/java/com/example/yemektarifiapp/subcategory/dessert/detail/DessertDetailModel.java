package com.example.yemektarifiapp.subcategory.dessert.detail;

import java.io.Serializable;

public class DessertDetailModel implements Serializable {

    private int imageId;
    private String calorie, person, material, recipe;

    public DessertDetailModel(int imageId, String calorie, String person, String material, String recipe) {
        this.imageId = imageId;
        this.recipe = recipe;
        this.material = material;
        this.calorie = calorie;
        this.person = person;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial() {
        this.material = material;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
