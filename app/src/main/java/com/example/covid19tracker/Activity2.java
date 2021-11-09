package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
     Button sign;
     EditText username;
     EditText password;


    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        username = (EditText)findViewById(R.id.username);
        password =(EditText)findViewById(R.id.password);


        sign=(Button)findViewById(R.id.sign);

        DB=new DBHelper(this);
        sign .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(Activity2.this,"Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuser=DB.checkusername(user);
                    if(checkuser==false)
                    {
                        Boolean insert=DB.insertData(user,pass);
                        if(insert==true)
                        {
                            Toast.makeText(Activity2.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
//                            Intent intent =new Intent(getApplicationContext(), Activity2_1.class);
//                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(Activity2.this,"Registration Failed",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(Activity2.this,"User Already exists! please Login!",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }
//    public void openActivity2()
//    {
//        Intent intent =new Intent(getApplicationContext(), Activity2_1.class);
//        startActivity(intent);
//    }
}