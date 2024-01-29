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

import com.example.yemektarifiapp.databinding.FragmentSignUpBinding;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.R;

public class SignUpFragment extends Fragment {

    private FragmentSignUpBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSignUpBinding.inflate(inflater, container, false);
        onClick();
        return binding.getRoot();
    }

    public void onClick() {
        binding.tvForgotPasswordSignUp.setOnClickListener(v -> transitionFromSignUpToReset());
    }

    public void transitionFromSignUpToReset() {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new PasswordResetFragment());
    }
}