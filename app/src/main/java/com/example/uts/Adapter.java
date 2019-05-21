package com.example.uts;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;

//Tanggal Pengerjaaan = 21-mei-2019
//10116102
//Mohammad Rizki Ramadhan/
//IF-3

public class Adapter extends PagerAdapter {

    private List<Model> mhs;
    private LayoutInflater layoutInflater;
    private Context context;

    public Adapter(List<Model> models, Context context) {
        this.mhs = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mhs.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container, false);

        EditText nim, nama, kelas, telp, email, ig;

        nim = view.findViewById(R.id.nim);
        nama = view.findViewById(R.id.nama);
        kelas = view.findViewById(R.id.kelas);
        telp = view.findViewById(R.id.telp);
        email = view.findViewById(R.id.email);
        ig = view.findViewById(R.id.ig);

        nim.setText(mhs.get(position).getNim());
        nama.setText(mhs.get(position).getNama());
        kelas.setText(mhs.get(position).getKelas());
        telp.setText(mhs.get(position).getTelp());
        email.setText(mhs.get(position).getEmail());
        ig.setText(mhs.get(position).getIg());

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("param", mhs.get(position).getNama());
//                context.startActivity(intent);
//                //finish();
//            }
//        });

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
