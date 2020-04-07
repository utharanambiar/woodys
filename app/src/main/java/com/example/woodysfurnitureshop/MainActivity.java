package com.example.woodysfurnitureshop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imgClick1;
    ImageView imgClick2;
    ImageView cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgClick1=(ImageView) findViewById(R.id.imageView1);
        imgClick2=(ImageView) findViewById(R.id.imageView2);
        cart=(ImageView)findViewById(R.id.cart);
        imgClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this,"You clicked on ImageView",Toast.LENGTH_LONG).show();
                Intent in1=new Intent(MainActivity.this,Lamp.class);
                startActivity(in1);
            }
        });
        imgClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this,"You clicked on ImageView",Toast.LENGTH_LONG).show();
                Intent in2=new Intent(MainActivity.this,Bed.class);
                startActivity(in2);
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this,"You clicked on ImageView",Toast.LENGTH_LONG).show();
                Intent in3=new Intent(MainActivity.this,Cart1.class);
                startActivity(in3);
            }
        });

    }


}
