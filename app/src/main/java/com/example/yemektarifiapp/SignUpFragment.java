package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpFragment extends Fragment {

    View view;
    TextView textViewSignUpLogo, textViewCheckBox, textViewForgotPasswordSignUp;
    EditText editTextSignUpName, editTextSignUpEmail, editTextSignUpPassword;
    CheckBox checkBoxSignUp;
    Button buttonSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        defineSignUpViews();

        return view;
    }

    public void defineSignUpViews() {
        textViewSignUpLogo = view.findViewById(R.id.textViewSignUpLogo);
        textViewCheckBox = view.findViewById(R.id.checkBoxText);
        editTextSignUpName = view.findViewById(R.id.editTextSignUpName);
        editTextSignUpEmail = view.findViewById(R.id.editTextSignUpEmail);
        editTextSignUpPassword = view.findViewById(R.id.editTextSignUpPassword);
        checkBoxSignUp = view.findViewById(R.id.checkBoxSignUp);
        buttonSignUp = view.findViewById(R.id.buttonSignUp);

        textViewForgotPasswordSignUp = view.findViewById(R.id.forgotPasswordSignUp);
        textViewForgotPasswordSignUp.setOnClickListener(v -> transitionFromSignUpToReset());
    }

    public void transitionFromSignUpToReset() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new PasswordReset());
    }
}