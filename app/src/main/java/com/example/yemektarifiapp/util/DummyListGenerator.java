package com.example.yemektarifiapp.util;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.recipedetail.DetailModel;
import com.example.yemektarifiapp.subcategory.SubCategoryModel;

import java.util.ArrayList;

public class DummyListGenerator {

    public DummyListGenerator() {
    }

    public ArrayList<SubCategoryModel> getDessertList() {

        //Ürünlerin detay bılgılerını ıceren model:
        ArrayList<SubCategoryModel> dessert = new ArrayList<>();
        dessert.add(
                new SubCategoryModel(
                        "Fırın Sütlaç",
                        R.drawable.firin_sutlac,
                        new DetailModel(R.drawable.firin_sutlac, "   ", "", "", "")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Magnolia",
                        R.drawable.magnolia,
                        new DetailModel(R.drawable.magnolia, "   ", "", "", "")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Aşure",
                        R.drawable.asure,
                        new DetailModel(R.drawable.asure, "   ", "", "", "")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Vişneli Cheesecake",
                        R.drawable.visneli_cheesecake,
                        new DetailModel(R.drawable.visneli_cheesecake, "   ", "", "", "")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Güllaç",
                        R.drawable.gullac,
                        new DetailModel(R.drawable.gullac, "   ", "", "", "")
                )
        );
        return dessert;
    }

    public ArrayList<SubCategoryModel> getSoupList() {
        ArrayList<SubCategoryModel> soup = new ArrayList<>();

        soup.add(
                new SubCategoryModel(
                        "Ezogelin Çorbası",
                        R.drawable.ezogelin,
                        new DetailModel(R.drawable.ezogelin, "  ", "", "", "")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Yayla Çorbası",
                        R.drawable.yayla,
                        new DetailModel(R.drawable.yayla, "   ", "", "", "")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Mercimek Çorbası",
                        R.drawable.mercimek,
                        new DetailModel(R.drawable.mercimek, "   ", "", "", "")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Mantar Çorbası",
                        R.drawable.mantar,
                        new DetailModel(R.drawable.mantar, "   ", "", "", "")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Şehriyeli Tavuk Suyu Çorbası",
                        R.drawable.sehriyeli_tavuk,
                        new DetailModel(R.drawable.sehriyeli_tavuk, "   ", "", "", "")
                )
        );
        return soup;
    }

    public ArrayList<SubCategoryModel> getSaladList() {
        ArrayList<SubCategoryModel> salad = new ArrayList<>();

        salad.add(
                new SubCategoryModel(
                        "Arpa Şehriye Salatası",
                        R.drawable.arpa_sehriye_salatasi,
                        new DetailModel(R.drawable.arpa_sehriye_salatasi, "   ", "", "", "")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Mercimek Köftesi",
                        R.drawable.mercimek_koftesi,
                        new DetailModel(R.drawable.mercimek_koftesi, "   ", "", "", "")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Haydari",
                        R.drawable.haydari,
                        new DetailModel(R.drawable.haydari, "   ", "", "", "")
                ))
        ;

        salad.add(
                new SubCategoryModel(
                        "Humus",
                        R.drawable.humus,
                        new DetailModel(R.drawable.humus, "   ", "", "", "")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Kısır",
                        R.drawable.kisir,
                        new DetailModel(R.drawable.kisir, "   ", "", "", "")
                )
        );
        return salad;
    }

    public ArrayList<SubCategoryModel> getLegumeList() {
        ArrayList<SubCategoryModel> legume = new ArrayList<>();
        legume.add(
                new SubCategoryModel(
                        "Fellah Köfte",
                        R.drawable.fellah_kofte,
                        new DetailModel(R.drawable.fellah_kofte, "   ", "", "", "")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "İçli Köfte",
                        R.drawable.icli_kofte,
                        new DetailModel(R.drawable.icli_kofte, "   ", "", "", "")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Kuru Fasulye",
                        R.drawable.kuru_fasulye,
                        new DetailModel(R.drawable.kuru_fasulye, "   ", "", "", "")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Keşkek",
                        R.drawable.keskek,
                        new DetailModel(R.drawable.keskek, "   ", "", "", "")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Barbunya Pilaki",
                        R.drawable.barbunya_pilaki,
                        new DetailModel(R.drawable.barbunya_pilaki, "   ", "", "", "")
                )
        );
        return legume;
    }

    public ArrayList<SubCategoryModel> getVegetableList() {
        ArrayList<SubCategoryModel> vegetable = new ArrayList<>();
        vegetable.add(
                new SubCategoryModel(
                        "Biber Dolması",
                        R.drawable.biber_dolmasi,
                        new DetailModel(R.drawable.biber_dolmasi, "   ", "", "", "")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Yaprak Sarması",
                        R.drawable.yaprak_sarmasi,
                        new DetailModel(R.drawable.yaprak_sarmasi, "   ", "", "", "")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Patatesli Patlıcan Oturtma",
                        R.drawable.patatesli_patlican,
                        new DetailModel(R.drawable.patatesli_patlican, "   ", "", "", "")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Taze Fasulye",
                        R.drawable.taze_fasulye,
                        new DetailModel(R.drawable.taze_fasulye, "   ", "", "", "")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Etli Bezelye",
                        R.drawable.etli_bezelye,
                        new DetailModel(R.drawable.etli_bezelye, "   ", "", "", "")
                )
        );
        return vegetable;
    }

    public ArrayList<SubCategoryModel> getMeatList() {
        ArrayList<SubCategoryModel> meat = new ArrayList<>();
        meat.add(
                new SubCategoryModel(
                        "Kadınbudu Köfte",
                        R.drawable.kadinbudu_kofte,
                        new DetailModel(R.drawable.kadinbudu_kofte, "   ", "", "", "")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Beyti Kebabı",
                        R.drawable.beyti_kebabi,
                        new DetailModel(R.drawable.beyti_kebabi, "   ", "", "", "")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Tavuk Sote",
                        R.drawable.tavuk_sote,
                        new DetailModel(R.drawable.tavuk_sote, "   ", "", "", "")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Ali Nazik Kebabı",
                        R.drawable.ali_nazik_kebabi,
                        new DetailModel(R.drawable.ali_nazik_kebabi, "   ", "", "", "")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Fırında Köfte Patates",
                        R.drawable.kofte_patates,
                        new DetailModel(R.drawable.kofte_patates, "   ", "", "", "")
                )
        );
        return meat;
    }
}
