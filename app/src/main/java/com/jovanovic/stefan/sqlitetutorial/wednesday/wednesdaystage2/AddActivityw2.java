package com.jovanovic.stefan.sqlitetutorial.wednesday.wednesdaystage2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jovanovic.stefan.sqlitetutorial.R;

public class AddActivityw2 extends AppCompatActivity {

    EditText title_input, author_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_input);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelperw2 myDB = new MyDatabaseHelperw2(AddActivityw2.this);
                myDB.addBook(title_input.getText().toString().trim(),
                        author_input.getText().toString().trim());
            }
        });
    }
}
