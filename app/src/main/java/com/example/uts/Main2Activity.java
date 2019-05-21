package com.example.uts;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> mhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mhs = new ArrayList<>();
        mhs.add(new Model("10116102", "Rizki", "IF-3","+6282295037972","rizkirama46@gmail.com","rizki.gg"));
        mhs.add(new Model("10116110", "Ibnu", "IF-3","+6281312923780","ibnutriyouno23@gmail.com","ibnutriyuono23"));
        mhs.add(new Model("10116132", "Rafli", "IF-3","+628112004240","rafli060395@gmail.com","rafli_rach"));

        adapter = new Adapter(mhs, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(50, 0, 130, 0);

    }
}