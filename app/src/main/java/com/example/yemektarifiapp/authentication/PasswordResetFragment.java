package com.example.yemektarifiapp.authentication;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.FragmentPasswordResetBinding;

public class PasswordResetFragment extends Fragment {

    private SharedPreferences sharedPreferences;
    private static final String USER_INFO_KEY = "userInfoKey";
    private static final String EMAIL_KEY = "emailKey";
    private FragmentPasswordResetBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPasswordResetBinding.inflate(inflater, container, false);
        checkUserInfo();
        return binding.getRoot();
    }

    private void checkUserInfo() {
        sharedPreferences = requireContext().getSharedPreferences(USER_INFO_KEY, MODE_PRIVATE);
        String savedEmail = sharedPreferences.getString(EMAIL_KEY, null);
        if (!TextUtils.isEmpty(savedEmail)) {
            binding.etResetPassword.setText(savedEmail);
        } else {
            Toast.makeText(requireContext(), "Kayıt Yok.", Toast.LENGTH_SHORT).show();
        }
    }

}