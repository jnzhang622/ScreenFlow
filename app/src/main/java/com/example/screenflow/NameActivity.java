package com.example.screenflow;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {

//    public static final String EXTRA_MESSAGE = "com.example.ScreenFlow.extra.MESSAGE";
//    private EditText firstNameTextEdit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
//        firstNameTextEdit = findViewById(R.id.first_name_input);
    }

    public void launchEmailActivity(View view) {
        Intent intent = new Intent(this, EmailActivity.class);
//        String message = firstNameTextEdit.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
