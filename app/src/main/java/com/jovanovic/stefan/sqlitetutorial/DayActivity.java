package com.jovanovic.stefan.sqlitetutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.jovanovic.stefan.sqlitetutorial.friday.feidaystagw;
import com.jovanovic.stefan.sqlitetutorial.monday.Mondaystage;
import com.jovanovic.stefan.sqlitetutorial.saturday.saturdaystage;
import com.jovanovic.stefan.sqlitetutorial.sunday.Sundaystage1;
import com.jovanovic.stefan.sqlitetutorial.thursday.Thuersdaystage;
import com.jovanovic.stefan.sqlitetutorial.tuesday.Tuesdaystage;
import com.jovanovic.stefan.sqlitetutorial.wednesday.Wednesdaystage;


public class DayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        Button button = (Button) findViewById(R.id.buttonSun);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStageActivity();
            }
        });

        Button button2 = (Button) findViewById(R.id.buttonMon);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMondaystage();
            }
        });

        Button button3 = (Button) findViewById(R.id.buttonTue);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentuesdaystage();
            }
        });


        Button button4 = (Button) findViewById(R.id.buttonWed);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwednesdaystage();
            }
        });

        Button button5 = (Button) findViewById(R.id.buttonThu);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthursdaystage();
            }
        });

        Button button6 = (Button) findViewById(R.id.buttonFri);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfeidaystagw();
            }
        });


        Button button7 = (Button) findViewById(R.id.buttonSat);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensaturdaystage();
            }
        });




    }

    public void openStageActivity() {
        Intent intent = new Intent (this, Sundaystage1.class);
        startActivity(intent);
    }

    public void openMondaystage() {
        Intent intent = new Intent (this, Mondaystage.class);
        startActivity(intent);
    }

    public void opentuesdaystage() {
        Intent intent = new Intent (this, Tuesdaystage.class);
        startActivity(intent);
    }

    public void openwednesdaystage() {
        Intent intent = new Intent (this, Wednesdaystage.class);
        startActivity(intent);
    }

    public void openthursdaystage() {
        Intent intent = new Intent (this, Thuersdaystage.class);
        startActivity(intent);
    }
    public void openfeidaystagw() {
        Intent intent = new Intent (this, feidaystagw.class);
        startActivity(intent);
    }
    public void opensaturdaystage() {
        Intent intent = new Intent (this, saturdaystage.class);
        startActivity(intent);
    }




}