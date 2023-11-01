package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PasswordReset extends Fragment {

    View view;
    TextView textViewResetPassword;
    EditText editTextResetPassword;
    Button buttonResetPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_password_reset, container, false);
        definePasswordResetViews();
        return view;
    }

    public void definePasswordResetViews() {
        textViewResetPassword = view.findViewById(R.id.textViewResetPassword);
        editTextResetPassword = view.findViewById(R.id.editTextResetPassword);
        buttonResetPassword = view.findViewById(R.id.buttonReSetPassword);
    }
}