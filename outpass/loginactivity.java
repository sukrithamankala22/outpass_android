package com.example.outpass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity implements View.OnClickListener {
    TextView register;
    EditText rollnumber;
    EditText password;
    Button login;
    boolean isEmpty
            (EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void checkDataEntered() {
        if (isEmpty(rollnumber)) {
            Toast t = Toast.makeText(this, "You must enter your Roll Number!", Toast.LENGTH_SHORT);
            t.show();
        }
        if (isEmpty(password)) {
            password.setError("Password is required!");
        }
        else {
            opendashboardfn();
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        login=(Button)findViewById(R.id.btn_login);
        register=(TextView) findViewById(R.id.registerview) ;
        rollnumber=(EditText)findViewById(R.id.Roll_No);
        password=(EditText)findViewById(R.id.password) ;
        login.setOnClickListener(this);
        register.setOnClickListener(this);

    }
    public void onClick(View v) {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkDataEntered();
                //opendashboardfn();

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openregisteractivityfn();

            }
        });
    }

    public void opendashboardfn() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void openregisteractivityfn(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
    }