package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class PersonalizeActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE ="com.example.mashrooua";


    public void  message6
            ( View view) {

        Intent intent = new Intent( PersonalizeActivity.this, saveideasActivity.class);
        Button Button20 = (Button ) findViewById(R.id.button250);


        Intent intent15 = getIntent();
        String message = intent15.getStringExtra( saveideasActivity.EXTRA_MESSAGE);



        Button20.setText(message);
        startActivity ( intent );}



    public void  message7
            ( View view) {

        Intent intent = new Intent( PersonalizeActivity.this, Brands2Activity.class);
        Button Button20 = (Button ) findViewById(R.id.button251);


        Intent intent15 = getIntent();
        String message = intent15.getStringExtra( Brands2Activity.EXTRA_MESSAGE);



        Button20.setText(message);
        startActivity ( intent );}








    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_personalize );
    }
}
