package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {
    private Button exit;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        exit=(Button)findViewById(R.id.exit);
        exit .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        back=(Button)findViewById(R.id.back);
        back .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent =new Intent(this, Activity3.class);
        startActivity(intent);
    }
}