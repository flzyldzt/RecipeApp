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
                        new DetailModel(R.drawable.firin_sutlac,
                                "1 porsiyon için 286 kaloridir.",
                                "4-6 kişilik")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Magnolia",
                        R.drawable.magnolia,
                        new DetailModel(R.drawable.magnolia, "1 porsiyon için 443 kaloridir.",
                                "6 kişilik")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Aşure",
                        R.drawable.asure,
                        new DetailModel(R.drawable.asure, "1 porsiyon için 350 kaloridir.",
                                "16+ kişilik")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Vişneli Cheesecake",
                        R.drawable.visneli_cheesecake,
                        new DetailModel(R.drawable.visneli_cheesecake, "Orta büyüklükte 1 dilim Frambuazlı Cheesecake yaklaşık olarak 441 kaloridir.",
                                "10-12 kişilik")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Güllaç",
                        R.drawable.gullac,
                        new DetailModel(R.drawable.gullac, "Orta büyüklükteki 1 dilim güllaç yaklaşık olarak 250 kaloridir.",
                                "8-10 kişilik")
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
                        new DetailModel(R.drawable.ezogelin, "Orta büyüklükte 1 kase ezogelin çorbası yaklaşık olarak 91 kaloriye denk gelmektedir.",
                                "8-10 kişilik")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Yayla Çorbası",
                        R.drawable.yayla,
                        new DetailModel(R.drawable.yayla, "Orta büyüklükteki 1 kase yayla çorbası yaklaşık olarak 94 kaloriye denk gelmektedir.",
                                "4-6 kişilik")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Mercimek Çorbası",
                        R.drawable.mercimek,
                        new DetailModel(R.drawable.mercimek, "Orta büyüklükteki 1 kase kırmızı mercimek çorbası yaklaşık olarak 62 kaloridir.",
                                "6-8 kişilik")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Mantar Çorbası",
                        R.drawable.mantar,
                        new DetailModel(R.drawable.mantar, "Orta büyüklükte 1 kase mantar çorbası yaklaşık olarak 133 kaloridir.",
                                "2-4 kişilik")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Şehriyeli Tavuk Suyu Çorbası",
                        R.drawable.sehriyeli_tavuk,
                        new DetailModel(R.drawable.sehriyeli_tavuk, "1 kase şehriyeli tavuk suyu çorba yaklaşık olarak 110 kaloridir.",
                                "4-6 kişilik")
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
                        new DetailModel(R.drawable.arpa_sehriye_salatasi, "1 kase arpa şehriye salatası yaklaşık olarak 260 kaloridir.",
                                "6-8 kişilik")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Mercimek Köftesi",
                        R.drawable.mercimek_koftesi,
                        new DetailModel(R.drawable.mercimek_koftesi, "1 adet mercimek köftesi, yaklaşık olarak 39 kaloridir.",
                                "4-6 kişilik")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Haydari",
                        R.drawable.haydari,
                        new DetailModel(R.drawable.haydari, "Orta büyüklükte 1 kase haydari yaklaşık olarak 300 kaloridir.",
                                "2-4 kişilik")
                ))
        ;

        salad.add(
                new SubCategoryModel(
                        "Humus",
                        R.drawable.humus,
                        new DetailModel(R.drawable.humus, "Orta büyüklükte 1 porsiyon humus yaklaşık olarak 339 kaloridir.",
                                "7-8 kişilik")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Kısır",
                        R.drawable.kisir,
                        new DetailModel(R.drawable.kisir, "Orta büyüklükte 1 kase kısır yaklaşık olarak 178 kaloridir.",
                                "4-6 kişilik")
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
                        new DetailModel(R.drawable.fellah_kofte, "1 porsiyon ( 277g) fellah köftesi 331 kaloridir.",
                                "6-8 kişilik")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "İçli Köfte",
                        R.drawable.icli_kofte,
                        new DetailModel(R.drawable.icli_kofte, "Orta büyüklükte bir içli köfte yaklaşık 349 kaloridir.",
                                "1-2 kişilik")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Kuru Fasulye",
                        R.drawable.kuru_fasulye,
                        new DetailModel(R.drawable.kuru_fasulye, "Orta büyüklükte 1 kase kuru fasulye yaklaşık olarak 267 kaloridir.",
                                "6-8 kişilik")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Keşkek",
                        R.drawable.keskek,
                        new DetailModel(R.drawable.keskek, "1 porsiyon keşkek yaklaşık olarak 481 kaloridir.",
                                "12-14 kişilik")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Barbunya Pilaki",
                        R.drawable.barbunya_pilaki,
                        new DetailModel(R.drawable.barbunya_pilaki, "1 porsiyon zeytinyağlı barbunya pilaki yaklaşık olarak 415 kaloridir.",
                                "2-4 kişilik")
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
                        new DetailModel(R.drawable.biber_dolmasi, "Orta büyüklükteki 1 adet biber dolması yaklaşık olarak 132 kaloridir.",
                                "4-6 kişilik")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Yaprak Sarması",
                        R.drawable.yaprak_sarmasi,
                        new DetailModel(R.drawable.yaprak_sarmasi, "1 adet yaprak sarması yaklaşık olarak 32 kaloridir.",
                                "6-8 kişilik")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Patatesli Patlıcan Oturtma",
                        R.drawable.patatesli_patlican,
                        new DetailModel(R.drawable.patatesli_patlican, "1 porsiyon patatesli patlıcan oturtma yaklaşık olarak 326 kaloridir.",
                                "4-6 kişilik")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Taze Fasulye",
                        R.drawable.taze_fasulye,
                        new DetailModel(R.drawable.taze_fasulye, "Orta porsiyon taze fasulye yemeği yaklaşık olarak 31,3 kaloridir.",
                                "4-6 kişilik")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Etli Bezelye",
                        R.drawable.etli_bezelye,
                        new DetailModel(R.drawable.etli_bezelye, "1 porsiyon etli bezelye yaklaşık olarak 360 kaloridir.",
                                "6-8 kişilik")
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
                        new DetailModel(R.drawable.kadinbudu_kofte, "1 adet kadınbudu köfte yaklaşık olarak 203 kaloridir.",
                                "4-6 kişilik")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Beyti Kebabı",
                        R.drawable.beyti_kebabi,
                        new DetailModel(R.drawable.beyti_kebabi, "1 dilim beyti kebabı yaklaşık olarak 97,8 kaloridir.",
                                "4-6 kişilik")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Tavuk Sote",
                        R.drawable.tavuk_sote,
                        new DetailModel(R.drawable.tavuk_sote, "Orta büyüklükteki 1 porsiyon tavuk göğsü yaklaşık olarak 288 kaloridir.",
                                "2-4 kişilik")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Ali Nazik Kebabı",
                        R.drawable.ali_nazik_kebabi,
                        new DetailModel(R.drawable.ali_nazik_kebabi, "Orta porsiyon Alinazik kebabı yaklaşık olarak 407 kaloridir.",
                                "4-6 kişilik")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Fırında Köfte Patates",
                        R.drawable.kofte_patates,
                        new DetailModel(R.drawable.kofte_patates, "Orta porsiyon fırında köfte patates yaklaşık olarak 260 kaloridir.",
                                "4-6 kişilik")
                )
        );
        return meat;
    }
}
