package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yemektarifiapp.authentication.LogInFragment;
import com.example.yemektarifiapp.databinding.ActivityMainBinding;
import com.example.yemektarifiapp.util.ChangeFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        changeFragment(savedInstanceState);
    }


    private void changeFragment(Bundle savedInstanceState) {

        ChangeFragment changeFragment = new ChangeFragment(MainActivity.this);
        if (savedInstanceState == null) {
            changeFragment.change(new LogInFragment());
        }
    }
}