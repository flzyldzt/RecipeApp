package com.example.yemektarifiapp.authentication;

import static android.content.Context.MODE_PRIVATE;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yemektarifiapp.databinding.FragmentLogInBinding;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.category.CategoryFragment;

public class LogInFragment extends Fragment {

    private FragmentLogInBinding binding;

    private SharedPreferences sharedPreferences;
    private static final String USER_INFO_KEY = "userInfoKey";
    private static final String USERNAME_KEY = "usernameKey";

    private static final String PASSWORD_KEY = "passwordKey";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLogInBinding.inflate(inflater, container, false);
        onClick();
        return binding.getRoot();
    }

    public void onClick() {
        binding.buttonSignUp.setOnClickListener(v -> transitionFromLoginToSignUp());
        binding.buttonLogIn.setOnClickListener(v -> checkUserInfo());
        binding.tvForgotPasswordLogIn.setOnClickListener(v -> transitionFromLoginToReset());
    }

    private void checkUserInfo() {
        sharedPreferences = requireContext().getSharedPreferences(USER_INFO_KEY, MODE_PRIVATE);
        String username = binding.etLogInName.getText().toString();
        String password = binding.etLogInPassword.getText().toString();

        String savedUsername = sharedPreferences.getString(USERNAME_KEY, "");
        String savedPassword = sharedPreferences.getString(PASSWORD_KEY, "");

        Boolean isValidUsername = false;
        Boolean isValidPassword = false;


        if (savedUsername.equals(username)) {
            isValidUsername = true;
        }


        if (savedPassword.equals(password)) {
            isValidPassword = true;
        }


        if (isValidUsername && isValidPassword) {
            Toast.makeText(requireContext(), "Giriş Başarılı", Toast.LENGTH_SHORT).show();
            transitionFromLogInToCategories();
        } else {
            Toast.makeText(requireContext(), "Giriş Bilgileri Hatalıdır.", Toast.LENGTH_SHORT).show();
        }
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