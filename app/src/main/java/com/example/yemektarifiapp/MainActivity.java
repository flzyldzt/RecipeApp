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

        changeFragment(savedInstanceState);
    }

    private void changeFragment(Bundle savedInstanceState) {

        ChangeFragment changeFragment = new ChangeFragment(MainActivity.this);
        if (savedInstanceState == null) {
            changeFragment.change(new LogInFragment());
        }
    }
}