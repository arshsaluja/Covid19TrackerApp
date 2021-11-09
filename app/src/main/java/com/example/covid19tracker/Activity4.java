package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {
    private Button show;
    private Button daily;
    private Button covid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        show=(Button)findViewById(R.id.show);
        show .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        daily=(Button)findViewById(R.id.daily);
        daily .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        covid=(Button)findViewById(R.id.covid);
        covid .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent =new Intent(this, Activity6.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent =new Intent(this, Activity7.class);
        startActivity(intent);
    }
    public void openActivity4()
    {
        Intent intent =new Intent(this, Activity8.class);
        startActivity(intent);
    }
}