package com.example.yemektarifiapp.subcategory;

import com.example.yemektarifiapp.subcategory.soup.detail.SoupDetailModel;

public class SubCategoryModel {

    public String title;

    private int imageId;

    private SoupDetailModel soupDetailModel;

    public SubCategoryModel(String title, int imageId, SoupDetailModel recipeSoupDetailModel) {
        this.title = title;
        this.imageId = imageId;
        this.soupDetailModel = recipeSoupDetailModel;
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

    public SoupDetailModel getDetailModel() {
        return soupDetailModel;
    }

    public void setDetailModel(SoupDetailModel soupDetailModel) {
        this.soupDetailModel = soupDetailModel;
    }
}
