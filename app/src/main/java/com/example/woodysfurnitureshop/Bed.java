package com.example.woodysfurnitureshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bed extends AppCompatActivity {

    Button bed1;
    Button bed2;
    Button bed3;
    Button bed4;
    Button bed5;
    //BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed);
        bed1 = (Button) findViewById(R.id.bed1);
        bed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bed.this, "Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });
        bed2 = (Button) findViewById(R.id.bed2);
        bed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bed.this, "Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });
        bed3 = (Button) findViewById(R.id.bed3);
        bed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bed.this, "Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });
        bed4 = (Button) findViewById(R.id.bed4);
        bed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bed.this, "Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });
        bed5 = (Button) findViewById(R.id.bed5);
        bed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bed.this, "Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
