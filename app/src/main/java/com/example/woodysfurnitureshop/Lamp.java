package com.example.woodysfurnitureshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Lamp extends AppCompatActivity {

    Button lamp1;
    Button lamp2;
    Button lamp3;
    Button lamp4;
    Button lamp5;
    //BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamp);
        lamp1=(Button)findViewById(R.id.lamp1);
        lamp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Lamp.this,"Item added to cart!", Toast.LENGTH_LONG).show();
                Intent in2=new Intent(Lamp.this,Cart1.class);
                startActivity(in2);
            }
        });
        lamp2=(Button)findViewById(R.id.lamp2);
        lamp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Lamp.this,"Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });
        lamp3=(Button)findViewById(R.id.lamp3);
        lamp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Lamp.this,"Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });
        lamp4=(Button)findViewById(R.id.lamp4);
        lamp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Lamp.this,"Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });
        lamp5=(Button)findViewById(R.id.lamp5);
        lamp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Lamp.this,"Item added to cart!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
