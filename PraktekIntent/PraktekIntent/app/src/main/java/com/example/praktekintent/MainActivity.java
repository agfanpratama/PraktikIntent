package com.example.praktekintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_buka_baru:
                Intent bb = new Intent(MainActivity.this, HelloActivity.class);
                startActivity(bb);
                break;

            case R.id.btn_buka_profile:
                Intent pp = new Intent(MainActivity.this, ProfileActivity.class);  Bundle bd = new Bundle();
                bd.putString("name", "Agfan Herru Pratama Hendarsin");
                bd.putString("email", "agfanhph@gmail.com");
                bd.putInt("age", 20);
                pp.putExtra("Profile", bd);
                startActivity(pp);
                break;

            case R.id.btn_buka_biodata:
                Intent bi = new Intent(MainActivity.this, DetailActivity.class);  Bundle bu = new Bundle();
                bu.putString("namadepan", "Agfan Herru");
                bu.putString("namabelakang", "Pratama Hendarsin");
                bu.putString("tanggallahir", "1 Agustus 2003");
                bu.putString("alamat", "Jakarta Selatan");
                bu.putString("telfon", "082210774370");
                bu.putString("hobi", "Main Game");
                bi.putExtra("Profile", bu);
                startActivity(bi);
                break;

            case R.id.btn_buka_browser:
                Intent ss = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://accounts.google.com"));
                startActivity(ss);
                break;


        }
    }

    private Button buka_baru;
    private Button buka_profile;
    private Button buka_browser;
    private Button buka_biodata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buka_baru = (Button)findViewById(R.id.btn_buka_baru);
        buka_baru.setOnClickListener(this);

        buka_profile = (Button)findViewById(R.id.btn_buka_profile);
        buka_profile.setOnClickListener(this);

        buka_browser = (Button)findViewById(R.id.btn_buka_browser);
        buka_browser.setOnClickListener(this);

        buka_biodata = (Button)findViewById(R.id.btn_buka_biodata);
        buka_biodata.setOnClickListener(this);
    }
}