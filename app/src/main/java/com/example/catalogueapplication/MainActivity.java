package com.example.catalogueapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing and declaring UI with their respective elements
        ImageView asus = findViewById(R.id.asus);
        ImageView hp = findViewById(R.id.hp);
        ImageView lenovo = findViewById(R.id.lenovo);
        ImageView microsoft = findViewById(R.id.microsoft);


        asus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            // Start asusActivity when the asus laptop is clicked
            startActivity(new Intent(MainActivity.this, asusActivity.class));
    }
    });

        hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            // Start hpActivity when the hp laptop is clicked
            startActivity(new Intent(MainActivity.this, hpActivity.class));
    }
    });

        lenovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            // Start lenovoActivity when the lenovo laptop is clicked
            startActivity(new Intent(MainActivity.this, lenovoActivity.class));
    }
    });

        microsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            // Start microsoftActivity when the microsoft laptop is clicked
            startActivity(new Intent(MainActivity.this, microsoftActivity.class));
    }
    });
    }
}



