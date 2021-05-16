package com.jovanovic.stefan.sqlitetutorial.monday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jovanovic.stefan.sqlitetutorial.R;
import com.jovanovic.stefan.sqlitetutorial.monday.mondaystage1.MainActivitym1;
import com.jovanovic.stefan.sqlitetutorial.monday.mondaystage2.MainActivitym2;


public class Mondaystage extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sundaystage1);

        button = findViewById(R.id.buttonSatg1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }

        });
        button = findViewById(R.id.buttonSatg2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivitys2();
            }

        });





    }
    public void openMainActivity(){
        Intent intent = new Intent (this, MainActivitym1.class);
        startActivity(intent);

    }
    public void openMainActivitys2(){
        Intent intent = new Intent (this, MainActivitym2.class);
        startActivity(intent);

    }






}