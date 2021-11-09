package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity7 extends AppCompatActivity {
    private Button accept;
    private Button decline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        accept=(Button)findViewById(R.id.accept);
        accept .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        decline=(Button)findViewById(R.id.decline);
        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this, Activity9.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent =new Intent(this, Activity4.class);
        startActivity(intent);
    }
}