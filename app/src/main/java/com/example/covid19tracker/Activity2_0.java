package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2_0 extends AppCompatActivity {
    EditText username;
    EditText password;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_0);

        username = (EditText) findViewById(R.id.usernamee);
        password = (EditText) findViewById(R.id.passwordd);

        Login = (Button) findViewById(R.id.logiin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(username.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String userName,String userPassword)
    {
        if((userName.equals("Madam"))&&(userPassword.equals("1234")))
        {
            Toast.makeText(Activity2_0.this, "Admin Login Successful!!", Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(this,Activity2.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(Activity2_0.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        }
    }
