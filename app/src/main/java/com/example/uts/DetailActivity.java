package com.example.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

//Tanggal Pengerjaaan = 21-mei-2019
//10116102
//Mohammad Rizki Ramadhan/
//IF-3

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        EditText editText = findViewById(R.id.editText);
        editText.setText(getIntent().getStringExtra("param"));
    }
}