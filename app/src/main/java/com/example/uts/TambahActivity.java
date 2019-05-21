package com.example.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//Tanggal Pengerjaaan = 21-mei-2019
//10116102
//Mohammad Rizki Ramadhan/
//IF-3

public class TambahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);
    }


    public void btn_kirim(View view) {
        EditText nim = findViewById(R.id.nim);
        EditText nama = findViewById(R.id.nama);
        EditText kelas = findViewById(R.id.kelas);
        EditText telp = findViewById(R.id.telp);
        EditText email = findViewById(R.id.email);
        EditText ig = findViewById(R.id.ig);

        Intent intent = new Intent(TambahActivity.this, Main2Activity.class);

        intent.putExtra("nim",nim.getText().toString());
        intent.putExtra("nama",nama.getText().toString());
        intent.putExtra("telepon",telp.getText().toString());
        intent.putExtra("kelas",kelas.getText().toString());
        intent.putExtra("email",email.getText().toString());
        intent.putExtra("instagram",ig.getText().toString());
        startActivity(intent);
        finish();
    }
}
