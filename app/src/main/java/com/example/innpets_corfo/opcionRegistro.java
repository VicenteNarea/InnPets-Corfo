package com.example.innpets_corfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class opcionRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_registro);
    }

    public void goRegisMascota(View v ){
        Intent i = new Intent(this, registroMascota.class);
        startActivity(i);
    }
}