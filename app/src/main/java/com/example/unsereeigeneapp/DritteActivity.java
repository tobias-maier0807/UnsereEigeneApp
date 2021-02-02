package com.example.unsereeigeneapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DritteActivity extends AppCompatActivity {
    Button buttonSpielerklärung;
    Button zurueckFolie2;
    Button Spiel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_folie3);


        buttonSpielerklärung = (Button) findViewById(R.id.button_Folie3_Erklärung);
        buttonSpielerklärung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFolie3erklärungActivity();
            }
        });

        zurueckFolie2 = (Button) findViewById(R.id.button_Folie3_zurück);
        zurueckFolie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFolie1SVActivity();
            }
        });


        Spiel= (Button) findViewById(R.id.button2_Folie3_Spielen);
        Spiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpielActivity();
            }
        });
    }





    public void openFolie3erklärungActivity() {
        Intent intent = new Intent(this, SpielerklärungActivity.class);
        startActivity(intent);
    }


    public void openFolie1SVActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void openSpielActivity() {
        Intent intent = new Intent(this, SpielActivity.class);
        startActivity(intent);
    }
}
