package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PasswordReset extends Fragment {

    View view;
    TextView textView1;
    EditText editText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_password_reset, container, false);
        definePasswordResetViews();
        return view;
    }

    public void definePasswordResetViews() {
        textView1 = view.findViewById(R.id.textViewResetPassword);
        editText = view.findViewById(R.id.editTextResetPassword);
        button = view.findViewById(R.id.buttonReSetPassword);
    }
}