package com.example.unsereeigeneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button buttonspielverlassen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_Folie1_Spielen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDritteActivity();
            }
        });


        buttonspielverlassen = (Button) findViewById(R.id.button2_Folie1_Spiel_verlassen);
        buttonspielverlassen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVerlassenActivity();
            }
        });



    }
    public void openDritteActivity(){
        Intent intent = new Intent(this, DritteActivity.class);
        startActivity(intent);
    }

    public void openVerlassenActivity(){
        //Intent intent = new Intent(this, ZweiteActivity_SpielVerlassen.class);
        //startActivity(intent);
        finish();


    }
    }
