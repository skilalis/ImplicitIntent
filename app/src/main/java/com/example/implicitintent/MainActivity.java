package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button telButton, webButton, mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telButton = findViewById(R.id.telButtonId);
        webButton = findViewById(R.id.webButtonId);
        mapButton = findViewById(R.id.mapButtonId);

        telButton.setOnClickListener(this);
        webButton.setOnClickListener(this);
        mapButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.telButtonId) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+8801685885965"));
            startActivity(intent);
        }else if (v.getId() == R.id.webButtonId) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.skilalis.com"));
            startActivity(intent);
        }else if (v.getId() == R.id.mapButtonId) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:24.896837, 91.902739"));
            startActivity(intent);
        }
    }
}