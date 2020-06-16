package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class ScanCameraActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="com.example.mashrooua";

    public void  message6
            ( View view) {

        Intent intent = new Intent( ScanCameraActivity.this, activity_scancamera4Activity.class);

        ImageView imageView = ( ImageView ) findViewById(R.id.imageView15);

        Intent intent15 = getIntent();
        String message = intent15.getStringExtra( MainActivity.EXTRA_MESSAGE);



        imageView.setSelected ( Boolean.parseBoolean ( message ) );
        startActivity ( intent );







    }













    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_scancamera2 );
    }
}
