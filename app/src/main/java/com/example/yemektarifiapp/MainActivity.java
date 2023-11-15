package com.example.yemektarifiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.yemektarifiapp.authentication.LogInFragment;
import com.example.yemektarifiapp.util.ChangeFragment;

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