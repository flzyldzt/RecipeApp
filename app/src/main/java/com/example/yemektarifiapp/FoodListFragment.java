package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodListFragment extends Fragment {

    View view;
    TextView textViewFoodListLogo, textViewDessert, textViewSoup,textViewSalad, textViewLegumes, textViewVegetables, textViewMeat;
    ImageView dessertPicture, soupPicture, saladPicture, legumesPicture, vegetablesPicture, meatPicture;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_food_list, container, false);
        defineFoodListViews();
        return view;
    }

    public void defineFoodListViews(){
        textViewFoodListLogo = view.findViewById(R.id.textViewFoodListLogo);
        textViewDessert = view.findViewById(R.id.textViewDessert);
        textViewSoup = view.findViewById(R.id.textViewSoup);
        textViewSalad = view.findViewById(R.id.textViewSalad);
        textViewLegumes = view.findViewById(R.id.textViewLegumes);
        textViewVegetables = view.findViewById(R.id.textViewVegetables);
        textViewMeat = view.findViewById(R.id.textViewMeat);
        dessertPicture = view.findViewById(R.id.dessertPicture);
        soupPicture = view.findViewById(R.id.soupPicture);
        saladPicture = view.findViewById(R.id.saladPicture);
        legumesPicture = view.findViewById(R.id.legumesPicture);
        vegetablesPicture = view.findViewById(R.id.vegetablesPicture);
        meatPicture = view.findViewById(R.id.meatPicture);
    }
}