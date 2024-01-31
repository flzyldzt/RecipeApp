package com.example.yemektarifiapp.authentication;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yemektarifiapp.databinding.FragmentSignUpBinding;
import com.example.yemektarifiapp.util.ChangeFragment;

public class SignUpFragment extends Fragment {

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private static final String USER_INFO_KEY = "userInfoKey";
    private static final String USERNAME_KEY = "usernameKey";
    private static final String EMAIL_KEY = "emailKey";

    private static final String PASSWORD_KEY = "passwordKey";

    private FragmentSignUpBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSignUpBinding.inflate(inflater, container, false);
        onClickSignUp();
        onClickForgotPassword();
        onClickLogIn();
        return binding.getRoot();
    }

    public void onClickForgotPassword() {
        binding.tvForgotPasswordSignUp.setOnClickListener(v -> {
            transitionFromSignUpToReset();
        });
    }

    public void onClickSignUp() {
        binding.buttonSignUp.setOnClickListener(v -> {
            saveUserInfo();
        });
    }

    public void onClickLogIn() {
        binding.btnLogIn.setOnClickListener(v -> transitionFromSignUpToLogIn());
    }

    private void saveUserInfo() {
        preferences = requireContext().getSharedPreferences(USER_INFO_KEY, MODE_PRIVATE);
        //girilen verileri al
        String username = binding.etSignUpName.getText().toString();
        String password = binding.etSignUpPassword.getText().toString();
        String email = binding.etSignUpEmail.getText().toString();

        if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password) && !TextUtils.isEmpty(email)) {
            editor = preferences.edit();
            editor.putString(USERNAME_KEY, username);
            editor.putString(EMAIL_KEY, email);
            editor.putString(PASSWORD_KEY, password);
            editor.commit();
            Toast.makeText(requireContext(), "Kullanıcı Adınız Başarıyla Kayıt Oldu.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(requireContext(), "Lütfen Alanları Doldurunuz.", Toast.LENGTH_SHORT).show();
        }
    }

    public void transitionFromSignUpToReset() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new PasswordResetFragment());
    }

    public void transitionFromSignUpToLogIn() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new LogInFragment());
    }
}