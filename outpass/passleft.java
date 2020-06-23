package com.example.outpass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;

public class passleft extends AppCompatActivity implements View.OnClickListener{
    Button savebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passleft);
        savebtn=(Button)findViewById(R.id.btn_save);
        savebtn.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                savebtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            backtodashboardfn();

                        }
            });
        }

    public void backtodashboardfn() {
        Intent intent = new Intent(this,loginactivity.class);
        startActivity(intent);
    }
}