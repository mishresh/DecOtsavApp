package com.example.decotsav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.decotsav.activity.Sign_Up_Activity;
import com.example.decotsav.activity.Signin_Activity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button login, signup;
    TextView skip;

//    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btnLogin);
        signup = findViewById(R.id.btnSignUp);


        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this , Signin_Activity.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "SignIn has been clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this , Sign_Up_Activity.class);
                startActivity(intent);
            }
        });

        skip=(TextView)findViewById(R.id.skipBtn);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dashboard_Activity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Dashboard", Toast.LENGTH_LONG).show();            }
        });

//        binding=ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        binding.bottomNavigationView
    }



}