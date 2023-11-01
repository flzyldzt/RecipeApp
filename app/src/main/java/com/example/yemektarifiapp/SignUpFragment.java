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
    TextView textView1, textView2, textView3;
    EditText editText1, editText2, editText3;
    CheckBox checkBox;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        defineSignUpViews();

        return view;
    }

    public void defineSignUpViews() {
        textView1 = view.findViewById(R.id.textViewSignUp);
        textView2 = view.findViewById(R.id.checkBoxText);
        editText1 = view.findViewById(R.id.editTextSignUpName);
        editText2 = view.findViewById(R.id.editTextSignUpEmail);
        editText3 = view.findViewById(R.id.editTextSignUpPassword);
        checkBox = view.findViewById(R.id.checkBoxSignUp);
        button = view.findViewById(R.id.buttonSignUp);

        textView3 = view.findViewById(R.id.forgotPasswordSignUp);
        textView3.setOnClickListener(v -> transitionFromSignUpToReset());
    }

    public void transitionFromSignUpToReset() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new PasswordReset());
    }
}