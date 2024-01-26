package com.example.yemektarifiapp.authentication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.R;

public class SignUpFragment extends Fragment {

    View view;

    TextView tvSignUpLogo, tvCheckBox, tvForgotPasswordSignUp;
    EditText etSignUpName, etSignUpEmail, etSignUpPassword;
    CheckBox cbSignUp;
    Button buttonSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        defineSignUpViews();
        onClick();
        return view;
    }

    public void defineSignUpViews() {
        tvSignUpLogo = view.findViewById(R.id.tvSignUpLogo);
        tvCheckBox = view.findViewById(R.id.cbText);
        etSignUpName = view.findViewById(R.id.etSignUpName);
        etSignUpEmail = view.findViewById(R.id.etSignUpEmail);
        etSignUpPassword = view.findViewById(R.id.etSignUpPassword);
        cbSignUp = view.findViewById(R.id.cbSignUp);
        buttonSignUp = view.findViewById(R.id.buttonSignUp);
        tvForgotPasswordSignUp = view.findViewById(R.id.tvForgotPasswordSignUp);
    }

    public void onClick() {
        tvForgotPasswordSignUp.setOnClickListener(v -> transitionFromSignUpToReset());
    }

    public void transitionFromSignUpToReset() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new PasswordResetFragment());
    }
}