package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    TextView txtUsername;
    TextView txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Bind layout
        setContentView(R.layout.activity_login);

        //Bind view
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtUsername = (TextView) findViewById(R.id.txtUsername);
        txtPassword = (TextView) findViewById(R.id.txtPassword);

        //Set event on click for button
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (txtUsername.getText().toString().equals("admin")
                        && txtPassword.getText().toString().equals("123456")) {
                    Toast.makeText(LoginActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();

                    //Pass data to HomeActivity
                    Intent homeActivity = new Intent(LoginActivity.this, HomeActivity.class);
                    homeActivity.putExtra("USERNAME", txtUsername.getText().toString());
                    startActivity(homeActivity);
                } else {
                    Toast.makeText(LoginActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!txtUsername.getText().toString().equals("")
                && !txtPassword.getText().toString().equals("")) {
            txtUsername.setText("");
            txtPassword.setText("");
        }

    }
}