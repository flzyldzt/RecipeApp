package com.example.yemektarifiapp.recipedetail;

import java.io.Serializable;

public class DetailModel implements Serializable {

    private int imageId;
    private String calorie, person;
    //recipe, material

    public DetailModel(int imageId, String calorie, String person) {
        this.imageId = imageId;
        //this.recipe = recipe;
        //this.material = material;
        this.calorie = calorie;
        this.person = person;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    /*public String getRecipe() {
        return recipe;
    }*/

    /*public void setRecipe(String recipe) {
        this.recipe = recipe;
    }*/

   /* public String getMaterial() {
        return material;
    }*/

    /*public void setMaterial(String material) {
        this.material = material;
    }*/

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
