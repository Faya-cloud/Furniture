package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.myapplication.R;
import com.example.myapplication.ui.login.Login2Activity;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.mashrooua";



    public void  message6
            ( View view) {

        Intent intent = new Intent(MainActivity.this, Login2Activity.class);
        Button Button20 = (Button ) findViewById( R.id.button50);


        Intent intent15 = getIntent();
        String message = intent15.getStringExtra( Login2Activity.EXTRA_MESSAGE);



        Button20.setText(message);
        startActivity ( intent );}








    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
}

