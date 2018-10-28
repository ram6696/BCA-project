package com.example.nineleaps.study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Layout1(View view) {
         Intent intent = new Intent(this,Layout1.class);
         startActivity(intent);
    }

    public void Layout2(View view) {
        Intent intent = new Intent(this,UploadNotes.class);
        startActivity(intent);
    }

    public void ViewUpload(View view) {
        Intent intent = new Intent(this,ViewUploadsActivity.class);
        startActivity(intent);
    }
}
