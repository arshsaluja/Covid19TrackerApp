package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    //create 4 widgets
     EditText username;
     EditText password;
     Button Login;
    DBHelper DB;
    //private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        username = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);

        Login = (Button) findViewById(R.id.login);

        DB = new DBHelper(this);

       // Info.setText("Number of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                validate(Name.getText().toString(),Password.getText().toString());
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("") || pass.equals("")) {
                    Toast.makeText(Activity3.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if (checkuserpass == true) {
                        Toast.makeText(Activity3.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Activity4.class);
                         startActivity(intent);
                    } else {
                        Toast.makeText(Activity3.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}
//    private void validate(String userName,String userPaaword)
//    {
//        if((userName.equals("Arsh"))&&(userPaaword.equals("1234")))
//        {
//            Intent intent =new Intent(this,Activity4.class);
//            startActivity(intent);
//        }
//        else
//        {
//            counter--;
//            Info.setText("Number of attempts remaining: "+ String.valueOf(counter));
//            if(counter==0) {
//                Login.setEnabled(false);
//                Intent intent =new Intent(this,Activity5.class);
//                startActivity(intent);
//            }
//        }
//    }
