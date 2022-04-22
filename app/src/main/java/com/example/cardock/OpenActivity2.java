package com.example.cardock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpenActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open1);

        Button btnProcess = (Button) findViewById(R.id.btnProcess);

        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();

            }
        });
    }
    public void openRegisterActivity(){
        Intent intent = new Intent(OpenActivity2.this,RegisterActivity.class);
        startActivity(intent);
    }
    }

