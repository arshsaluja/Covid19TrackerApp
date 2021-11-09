package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity9 extends AppCompatActivity {
    private Button yes;
    private Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);
        yes=(Button)findViewById(R.id.yes);
        yes .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        no=(Button)findViewById(R.id.no);
        no .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this, Activity10.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent =new Intent(this, Activity4.class);
        startActivity(intent);
    }
}