package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button admin;
    private Button user;
TextView upe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        admin=(Button)findViewById(R.id.admin);
        admin .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        user=(Button)findViewById(R.id.user);
        user .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        upe=(TextView)findViewById(R.id.upes);
        upe.setTextColor(Color.BLACK);

    }
    public void openActivity3()
    {
        Intent intent =new Intent(this, Activity3.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this, Activity2_0.class);
        startActivity(intent);
    }
}
