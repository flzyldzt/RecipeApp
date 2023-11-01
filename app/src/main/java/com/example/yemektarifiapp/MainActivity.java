package com.example.yemektarifiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*LogInFragment logInFragment = new LogInFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_Activity, logInFragment, "Fragment 1");
        fragmentTransaction.commit();*/

        ChangeFragment changeFragment = new ChangeFragment(MainActivity.this);
        if (savedInstanceState == null) {
            changeFragment.change(new LogInFragment());
        }
    }
}