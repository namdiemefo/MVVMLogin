package com.example.mvvmlogin;

import android.support.annotation.Nullable;
import android.text.TextUtils;

public class LoginModel  {

    @Nullable
    private
    String email;
    private String password;

    public LoginModel() {
    }


    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password) && getPassword().length()>6;
    }
}
