package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Brands2Activity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE ="com.example.mashrooua";
    public static final String EXTRA_MESSAGE1 ="com.example.mashrooua";



    public void  message6
            ( View view) {

        Intent intent = new Intent(Brands2Activity.this, MainActivity.class);
        Button Button20 = (Button ) findViewById(R.id.back20);


        Intent intent15 = getIntent();
        String message = intent15.getStringExtra( MainActivity.EXTRA_MESSAGE);



        Button20.setText(message);
        startActivity ( intent );







    }


    public void  message7
            ( View view) {

        Intent intent = new Intent(Brands2Activity.this, PersonalizeActivity.class);
        Button Button20 = (Button ) findViewById(R.id.next20);


        Intent intent15 = getIntent();
        String message = intent15.getStringExtra( PersonalizeActivity.EXTRA_MESSAGE);



        Button20.setText(message);
        startActivity ( intent );}








    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_brands2 );
    }
}
