package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TextView txtsaludo = (TextView) findViewById(R.id.txtSaludo);
        String nombre = getIntent().getExtras().getString("nombre");
        String apellidos = getIntent().getExtras().getString("apellidos");
        txtsaludo.setText("BIENVENIDO AL MENU PRINCIPAL: "+nombre+' '+apellidos);
    }

    public void logout(View view) {
        Intent salir = new Intent(this,MainActivity.class);
        startActivity(salir);
    }
}