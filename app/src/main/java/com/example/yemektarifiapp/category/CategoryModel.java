package com.example.yemektarifiapp.category;

import com.example.yemektarifiapp.subcategory.SubCategoryModel;

import java.util.ArrayList;

public class CategoryModel {
    private String title;
    private int imageId;
    private CategoryMenuIds menuId;
    private ArrayList<SubCategoryModel> subList;

    public CategoryModel(CategoryMenuIds menuId, String title, int imageId, ArrayList<SubCategoryModel> subList) {
        this.menuId = menuId;
        this.title = title;
        this.imageId = imageId;
        this.subList = subList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public ArrayList<SubCategoryModel> getSubList() {
        return subList;
    }

    public CategoryMenuIds getMenuId() {
        return menuId;
    }

    public void setMenuId(CategoryMenuIds menuId) {
        this.menuId = menuId;
    }

    public void setSubList(ArrayList<SubCategoryModel> subList) {
        this.subList = subList;
    }
}
