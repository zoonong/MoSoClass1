package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setBackgroundColor(Color.GREEN);

        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Intent goNaver = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(goNaver);
            }
        } );

        button2 = (Button) findViewById(R.id.button2);
        button2.setBackgroundColor(Color.RED);
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Intent makeCall = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
                startActivity(makeCall);
            }
        } );

        button3 = (Button) findViewById(R.id.button3);
        button3.setBackgroundColor(Color.WHITE);
        button3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Intent gallery = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(gallery);
            }
        } );


        button4 = (Button) findViewById(R.id.button4);
        button4.setBackgroundColor(Color.LTGRAY);
        button4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                finish();
            }
        } );

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.unicorn);
    }
}