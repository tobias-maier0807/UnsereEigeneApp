package com.example.unsereeigeneapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ZweiteActivity_SpielVerlassen extends AppCompatActivity {
    Button buttonFolie2wiederöffnen;
    Button buttonSpielschließen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folie2_spiel_verlassen);


        buttonFolie2wiederöffnen = (Button) findViewById(R.id.button_Folie2_Spiel_verlassen_Nein);
        buttonFolie2wiederöffnen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFolie2wiederActivity();
            }
        });

        buttonSpielschließen = (Button) findViewById(R.id.button_Folie2_Spiel_verlassen_Ja);
        buttonSpielschließen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpielschließenActivity();
            }
        });

    }



    public void openFolie2wiederActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);





    }
    public void openSpielschließenActivity(){
        //Intent intent = new Intent(this, ZweiteActivity.class);
        //startActivity(intent);
        finish();
    }}