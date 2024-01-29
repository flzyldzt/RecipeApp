package com.example.yemektarifiapp.authentication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.FragmentPasswordResetBinding;

public class PasswordResetFragment extends Fragment {

    private FragmentPasswordResetBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPasswordResetBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

}