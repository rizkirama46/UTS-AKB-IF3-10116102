package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//Tanggal Pengerjaaan = 21-mei-2019
//10116102
//Mohammad Rizki Ramadhan/
//IF-3

public class Main2Activity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> mhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton btnTambah = findViewById(R.id.btn_tambah);
        ImageButton btnHapus = findViewById(R.id.btn_hapus);

        mhs = new ArrayList<>();
        mhs.add(new Model("10116102", "Rizki", "IF-3", "+6282295037972",
                "rizkirama46@gmail.com", "rizki.gg"));
        mhs.add(new Model("10116110", "Ibnu", "IF-3", "+6281312923780",
                "ibnutriyouno23@gmail.com", "ibnutriyuono23"));
        mhs.add(new Model("10116132", "Rafli", "IF-3", "+628112004240",
                "rafli060395@gmail.com", "rafli_rach"));
        mhs.add(new Model("10116109", "Ryan", "IF-3", "+628981772819",
                "ryanyusupp15gmail.com", "ryanyusup12"));
        mhs.add(new Model("10116125", "Adit", "IF-3", "+628523121455",
                "adityakr29@gmail.com", "kraditya"));
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String Nim = bundle.getString("nim");
            String Nama = bundle.getString("nama");
            String Kelas = bundle.getString("kelas");
            String Telepon = bundle.getString("telepon");
            String Email = bundle.getString("email");
            String Instagram = bundle.getString("instagram");
            mhs.add(new Model(Nim, Nama, Kelas, Telepon, Email, Instagram));
        }


        adapter = new Adapter(mhs, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(50, 0, 130, 0);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, TambahActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mhs.size() > 0) {
                    mhs.remove(viewPager.getCurrentItem());
                    viewPager.setAdapter(adapter);
                }
            }
        });

    }

}