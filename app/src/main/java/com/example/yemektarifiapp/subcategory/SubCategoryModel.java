package com.example.yemektarifiapp.subcategory;

import com.example.yemektarifiapp.recipedetail.DetailModel;

public class SubCategoryModel {

    public String title;

    private int imageId;

    private DetailModel detailModel;

    public SubCategoryModel(String title, int imageId, DetailModel recipeDetailModel) {
        this.title = title;
        this.imageId = imageId;
        this.detailModel = recipeDetailModel;
    }

    /* TODO :App geneli Tüm bosluklar ctrl alt l yapılacak "reformat"*/

    /* TODO : image isimleri drawable içerisindeki    icon ise   --> ic_your_name  şeklınde  image ise  -->  img_your_name   isimlendırılecek*/

    /*TODO : button_background   yanlıs kullanım    dogrusu  -> background_button  */

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

    public DetailModel getDetailModel() {
        return detailModel;
    }

    public void setDetailModel(DetailModel detailModel) {
        this.detailModel = detailModel;
    }
}
