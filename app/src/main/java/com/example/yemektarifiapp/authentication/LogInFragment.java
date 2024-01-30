package com.example.yemektarifiapp.authentication;

import static android.content.Context.MODE_PRIVATE;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yemektarifiapp.databinding.FragmentLogInBinding;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.category.CategoryFragment;

public class LogInFragment extends Fragment {

    private FragmentLogInBinding binding;

    private SharedPreferences sharedPreferences;
    private static final String USER_INFO_KEY = "userInfoKey";
    private static final String USERNAME_KEY = "usernameKey";

    //private static final String PASSWORD_KEY = "passwordKey";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLogInBinding.inflate(inflater, container, false);
        checkUserInfo();
        onClick();
        return binding.getRoot();
    }

    public void onClick() {
        binding.buttonSignUp.setOnClickListener(v -> transitionFromLoginToSignUp());
        binding.buttonLogIn.setOnClickListener(v -> transitionFromLogInToCategories());
        binding.tvForgotPasswordLogIn.setOnClickListener(v -> transitionFromLoginToReset());
    }

    private void checkUserInfo() {
        sharedPreferences = requireContext().getSharedPreferences(USER_INFO_KEY, MODE_PRIVATE);

        String savedUsername = sharedPreferences.getString(USERNAME_KEY, null);
        if (!TextUtils.isEmpty(savedUsername)) {
            binding.etLogInName.setText(savedUsername);
        } else {
            Toast.makeText(requireContext(), "Kayıt Yok.", Toast.LENGTH_SHORT).show();
        }


        /*if(savedUsername == username) {
            Toast.makeText(requireContext(), "Kayıtlı Kullanıcı",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(requireContext(), "Kullanıcı Kayıtı Bulunamadı.",Toast.LENGTH_LONG).show();
        }*/

        //////

        /*if(password == savedPassword) {
            Toast.makeText(requireContext(), "Kayıt Yapıldı.",Toast.LENGTH_LONG).show();
        } else if(password != savedPassword){
            Toast.makeText(requireContext(), "Kullanıcı Kayıtı Bulunamadı.",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(requireContext(), "Bu Alan Boş Bırakılamaz.",Toast.LENGTH_LONG).show();
        }*/

        /////

        /*AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        if(savedUsername.equals("Kayıt Yok")){
            builder.setMessage("Önce Kayıt Yapınız");
        }else{
            builder.setMessage("Kayıtlı İsim : " + savedUsername + "\nKayıtlı Parola : " + savedPassword);
        }*/
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
        changeFragment.change(new CategoryFragment());
    }
}