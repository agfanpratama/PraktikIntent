package com.example.praktekintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView ff = (TextView)findViewById(R.id.buka_biodata);
        Bundle bundle = getIntent().getBundleExtra("Profile");
        String namadepan = bundle.getString("namadepan");
        String namabelakang = bundle.getString("namabelakang");
        String tanggallahir = bundle.getString("tanggallahir");
        String alamat = bundle.getString("alamat");
        String hobi = bundle.getString("hobi");
        String telfon = bundle.getString("telfon");
        String tugas = "Firstname : " + namadepan +"\n" + "Surname : " +namabelakang+"\n" + "Date Birth : "  +tanggallahir  + "\n" + "Address : " + alamat +"\n" + "Phone : " + telfon + "\n" + "Hobbies : " + hobi;

        ff.setText(tugas);
    }

}