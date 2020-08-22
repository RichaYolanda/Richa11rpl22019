package com.example.richa11rpl22019;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    EditText username;
    EditText password;
    Button btnlogin;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pref = getSharedPreferences("login",MODE_PRIVATE);
        username =(EditText) findViewById(R.id.username);
        password =(EditText) findViewById(R.id.password);
        btnlogin =(Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equalsIgnoreCase("nadia") && password.getText().toString().equalsIgnoreCase("000")){
//                    saving ke Sp
                    editor = pref.edit();
                    editor.putString("username", username.getText().toString());
                    editor.putString("status", "login");
                    editor.apply();
//                    menuju mainmenu
                    startActivity(new Intent(getApplicationContext(), Mainmenu.class));
                    finish();
                }
            }
        });
        }
    }
