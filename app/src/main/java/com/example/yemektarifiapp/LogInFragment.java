package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInFragment extends Fragment {

    View view;
    TextView textViewLogInLogo, textViewForgotPasswordLogIn;
    EditText editTextNameLogIn, editTextPasswordLogIn;
    Button buttonLogIn, buttonSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_log_in, parent, false);
        defineLogInViews();
        return view;
        //button2 = view.findViewById(R.id.buttonLogInSignUp);
        //button2.setOnClickListener(v -> transitionFromLoginToSignUp(v));
        //forgotPassword = view.findViewById(R.id.forgotPasswordLogIn);
        //forgotPassword.setOnClickListener(v -> transitionFromLoginToReset(v));
    }

    public void defineLogInViews() {
        textViewLogInLogo = view.findViewById(R.id.textViewLogInLogo);
        editTextNameLogIn = view.findViewById(R.id.editTextLogInName);
        editTextPasswordLogIn = view.findViewById(R.id.editTextLogInPassword);
        buttonLogIn = view.findViewById(R.id.buttonLogIn);

        buttonSignUp = view.findViewById(R.id.buttonLogInSignUp);
        buttonSignUp.setOnClickListener(v -> transitionFromLoginToSignUp());

        textViewForgotPasswordLogIn = view.findViewById(R.id.forgotPasswordLogIn);
        textViewForgotPasswordLogIn.setOnClickListener(v -> transitionFromLoginToReset());
    }

    public void transitionFromLoginToSignUp() {
        /*SignUpFragment signUpFragment = new SignUpFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_Activity, signUpFragment, "Fragment 2");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();*/

        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new SignUpFragment());
    }

    public void transitionFromLoginToReset() {
        /*PasswordReset passwordReset = new PasswordReset();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_Activity,passwordReset,"Fragment 3");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();*/

        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new PasswordReset());
    }
}