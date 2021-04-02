package com.example.screenflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.screenflow.constants.Constants;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void launchPasswordActivity(View view) {
        Intent intent = new Intent(this, PasswordActivity.class);
        intent.putExtra(Constants.EMAIL, getIntent().getExtras().getString((Constants.FIRST_NAME)));
        startActivity(intent);
    }
}