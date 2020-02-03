package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToAbout_us(View view){
        Intent intent = new Intent(this, About_us.class);
        startActivity(intent);
    }
    public void goToContacts(View view){
        Intent intent = new Intent(this, Contacts.class);
        startActivity(intent);
    }
}
