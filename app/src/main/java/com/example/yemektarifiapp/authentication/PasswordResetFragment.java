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

public class PasswordResetFragment extends Fragment {

    View view;
    TextView tvResetPassword;
    EditText etResetPassword;
    Button buttonResetPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_password_reset, container, false);
        definePasswordResetViews();
        return view;
    }

    public void definePasswordResetViews() {
        tvResetPassword = view.findViewById(R.id.tvResetPassword);
        etResetPassword = view.findViewById(R.id.etResetPassword);
        buttonResetPassword = view.findViewById(R.id.buttonResetPassword);
    }
}