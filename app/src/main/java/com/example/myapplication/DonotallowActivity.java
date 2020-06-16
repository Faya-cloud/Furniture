package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DonotallowActivity extends AppCompatActivity {




    public static final String EXTRA_MESSAGE ="com.example.mashrooua";



    public void  message6
            ( View view) {

        Intent intent = new Intent( DonotallowActivity.this, ScanCameraActivity.class);
        Button Button20 = (Button ) findViewById(R.id.button115);


        Intent intent15 = getIntent();
        String message = intent15.getStringExtra( ScanCameraActivity.EXTRA_MESSAGE);



        Button20.setText(message);
        startActivity ( intent );}








    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_donotallow );
    }
}
