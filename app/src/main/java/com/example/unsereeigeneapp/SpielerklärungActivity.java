package com.example.unsereeigeneapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SpielerklärungActivity extends AppCompatActivity {
    Button buttonZurückzuFolie3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.folie3_spielerklaerung);



        buttonZurückzuFolie3 = (Button) findViewById(R.id.button_Folie3_Erklärung_Zurück);
        buttonZurückzuFolie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpielerklärungzurückActivity();
            }
        });
    }
    public void openSpielerklärungzurückActivity(){
        Intent intent = new Intent(this, DritteActivity.class);
        startActivity(intent);
    }
}
