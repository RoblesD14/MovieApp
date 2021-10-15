package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etValiCo, etValiPass;
    String correo, pass;
    Button btInicioSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValiCo=findViewById(R.id.etValiCo);
        etValiPass=findViewById(R.id.etValiPass);
        btInicioSesion = findViewById(R.id.btInicioSesion);
    }

}