package com.example.yemektarifiapp.authentication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.yemektarifiapp.databinding.FragmentLogInBinding;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.category.CategoryFragment;

public class LogInFragment extends Fragment {

    private FragmentLogInBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLogInBinding.inflate(inflater, container, false);
        onClick();
        return binding.getRoot();
    }

    public void onClick() {
        binding.buttonSignUp.setOnClickListener(v -> transitionFromLoginToSignUp());
        binding.buttonLogIn.setOnClickListener(v -> transitionFromLogInToCategories());
        binding.tvForgotPasswordLogIn.setOnClickListener(v -> transitionFromLoginToReset());
    }

    public void transitionFromLoginToSignUp() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new SignUpFragment());
    }

    public void transitionFromLoginToReset() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new PasswordResetFragment());
    }

    public void transitionFromLogInToCategories() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new CategoryFragment());
    }
}