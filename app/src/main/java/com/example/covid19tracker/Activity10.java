package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity10 extends AppCompatActivity {

    CheckBox fever,cough,diff,loss,vomit,head,sore;
String result;
int c=0;
Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        fever=findViewById(R.id.fever);
        cough=findViewById(R.id.cough);
        diff=findViewById(R.id.diff);
        loss=findViewById(R.id.loss);
        vomit=findViewById(R.id.vomit);
        head=findViewById(R.id.head);
        sore=findViewById(R.id.sore);
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fever.isChecked() || cough.isChecked() ||diff.isChecked()||loss.isChecked()||vomit.isChecked() ||head.isChecked()||sore.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), rest.class);
                    startActivity(intent);
                }
            }
        });


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity11.class);
                startActivity(intent);
            }
        });
    }
}