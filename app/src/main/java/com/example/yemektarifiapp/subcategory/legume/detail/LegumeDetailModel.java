package com.example.yemektarifiapp.subcategory.legume.detail;

import java.io.Serializable;

public class LegumeDetailModel implements Serializable {

    private int imageId;
    private String calorie, person, material, recipe;

    public LegumeDetailModel(int imageId, String calorie, String person, String material, String recipe) {
        this.imageId = imageId;
        this.calorie = calorie;
        this.person = person;
        this.material = material;
        this.recipe = recipe;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
