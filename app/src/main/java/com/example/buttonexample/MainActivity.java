package com.example.buttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.buttonmagic);
        text= findViewById(R.id.textViewMAGIC);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   button.setVisibility(view.INVISIBLE);
              //  text.setVisibility(view.INVISIBLE);
                Toast.makeText(getApplicationContext(),"this button is invisible so this is magic-"
                        ,Toast.LENGTH_LONG ).show();

            }
        });
    }
}