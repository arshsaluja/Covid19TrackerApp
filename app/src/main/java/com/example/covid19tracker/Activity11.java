package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Activity11 extends AppCompatActivity {
    Button button;
    Button button2;
    CheckBox first,second,third,forth,fifth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);

        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        third=findViewById(R.id.third);
        forth=findViewById(R.id.forth);
        fifth=findViewById(R.id.fifth);

        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first.isChecked() || second.isChecked() ||third.isChecked()||forth.isChecked()||fifth.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), rest.class);
                    startActivity(intent);
                }
            }
        });


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pass.class);
                startActivity(intent);
            }
        });
    }
}