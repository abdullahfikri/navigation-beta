package com.example.navigationapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navigationapp.R;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_menu);

        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

    }

    public void loginClick(View view) {

        if (username.getText().toString().toLowerCase().equals("admin") && password.getText().toString().toLowerCase().equals("admin")){
            loginSukses();
        } else {
            Toast.makeText(getApplicationContext(), "Password yang anda masukkan salah", Toast.LENGTH_SHORT).show();
        }
    }

    private void loginSukses(){
        try {
            String userLogin = username.getText().toString();

            Intent i = new Intent(this, MainActivity.class);
            i.putExtra("user", userLogin);
            startActivity(i);
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Password yang ", Toast.LENGTH_SHORT).show();

        }

    }
}
