package com.example.decotsav.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.decotsav.R;

public class Signin_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        getSupportActionBar().setTitle("Sign In");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView loginText=(TextView)findViewById(R.id.registerText);
        String text="Don't have an account ? Register";
        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(Signin_Activity.this, Sign_Up_Activity.class);
                startActivity(intent);

                Toast.makeText(Signin_Activity.this, "Register", Toast.LENGTH_LONG).show();
            }
        };
        ss.setSpan(clickableSpan, 24,32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        loginText.setText(ss);
        loginText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public boolean onSupportNavigateUp() {
        //This method is called when the up button is pressed. Just the pop back stack.
        getSupportFragmentManager().popBackStack();
        return true;
    }

    public boolean onSupportNavigationUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}