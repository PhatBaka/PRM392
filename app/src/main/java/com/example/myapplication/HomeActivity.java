package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView viewUsername;
    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Get date from LoginActivity
        if (getIntent() != null) {
            String txtUsername = getIntent().getStringExtra("USERNAME");
            ((TextView) findViewById(R.id.lblUsername)).setText(txtUsername);
        }

        btnClose = (Button) findViewById(R.id.btnClose);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}