package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInFragment extends Fragment {

    View view;
    TextView tvLogInLogo, tvForgotPasswordLogIn;
    EditText etNameLogIn, etPasswordLogIn;
    Button buttonLogIn, buttonSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_log_in, parent, false);
        defineLogInViews();
        onClick();
        return view;
    }

    public void defineLogInViews() {
        tvLogInLogo = view.findViewById(R.id.tvLogInLogo);
        etNameLogIn = view.findViewById(R.id.etLogInName);
        etPasswordLogIn = view.findViewById(R.id.etLogInPassword);
        buttonLogIn = view.findViewById(R.id.buttonLogIn);
        buttonSignUp = view.findViewById(R.id.buttonLogInSignUp);
        buttonLogIn = view.findViewById(R.id.buttonLogIn);
        tvForgotPasswordLogIn = view.findViewById(R.id.tvForgotPasswordLogIn);
    }

    public void onClick() {
        buttonSignUp.setOnClickListener(v -> transitionFromLoginToSignUp());
        buttonLogIn.setOnClickListener(v -> transitionFromLogInToCategories());
        tvForgotPasswordLogIn.setOnClickListener(v -> transitionFromLoginToReset());
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
        changeFragment.change(new RecipeCategoriesFragment());
    }
}