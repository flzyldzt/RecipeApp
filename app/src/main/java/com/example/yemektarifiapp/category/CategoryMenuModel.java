package com.example.yemektarifiapp.category;

public class CategoryMenuModel {
    private String title;
    private int imageId;
    private CategoryMenuIds menuId;

    public CategoryMenuModel(CategoryMenuIds menuId, String title, int imageId) {
        this.menuId = menuId;
        this.title = title;
        this.imageId = imageId;
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


    public CategoryMenuIds getMenuId() {
        return menuId;
    }

    public void setMenuId(CategoryMenuIds menuId) {
        this.menuId = menuId;
    }
}
