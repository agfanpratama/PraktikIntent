package com.example.praktekintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView ff = (TextView)findViewById(R.id.buka_profile);
        Bundle bundle = getIntent().getBundleExtra("Profile");
        String name = bundle.getString("name");
        String email = bundle.getString("email");
        int age = bundle.getInt("age");
        String text = "Name : " + name +"\n" + "Email : " +email+"\n" + "Age : "  +age;
        ff.setText(text);
    }

}