package com.example.nineleaps.study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Layout1 extends AppCompatActivity {
    String item[] = new String[]{"Sem1", "Sem2", "Sem3","Sem4","Sem5","Sem6"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);
        ListView COURSE = findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        COURSE.setAdapter(adapter);
        COURSE.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent v = new Intent(Layout1.this,Layout2.class);
                    startActivity(v);
                }else if (position == 1) {
                    //B.Com....
//                Intent v = new Intent(com.ourapps.scribefinder.StudyMaterial.this,NotesBA.class);
//                startActivity(v);
                }
            }
        });
    }

    public void goBackToPreviousActivity(View view) {
        finish();
        //startActivity(new Intent(StudyMaterial.this, NeedyMainPage.class));
    }

    @Override
    public void onBackPressed() {
        finish();
        //startActivity(new Intent(StudyMaterial.this, NeedyMainPage.class));
    }
    }

