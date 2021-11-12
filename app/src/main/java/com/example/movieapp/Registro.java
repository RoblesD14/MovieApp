package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Registro extends AppCompatActivity {
    private FirebaseDatabase database;
    private DatabaseReference clienteRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        database = FirebaseDatabase.getInstance();
        clienteRef = database.getReference("movie_app/clientes");
    }

    public void retornarLogin(View view) {
        Intent login = new Intent(this,MainActivity.class);
        startActivity(login);
    }

    public void guardar(View view) {
        EditText txtDni = (EditText) findViewById(R.id.etDni);
        EditText txtNombres = (EditText) findViewById(R.id.etNombre);
        EditText txtApellidos = (EditText) findViewById(R.id.etApellido);
        EditText txtCorreo = (EditText) findViewById(R.id.etCorreo);
        EditText txtContrasena = (EditText) findViewById(R.id.et_contraseña);
        EditText txtNumTarjeta = (EditText) findViewById(R.id.etNumTarjeta);
        EditText txtVenceTarjeta = (EditText) findViewById(R.id.etFecha);
        EditText txtCodseguridad = (EditText) findViewById(R.id.etCodSeguridad);

        String dni = txtDni.getText().toString();
        String nombres  = txtNombres.getText().toString();
        String apellidos  = txtApellidos.getText().toString();
        String correo  = txtCorreo.getText().toString();
        String contrasena  = txtContrasena.getText().toString();
        String num_tarjeta  = txtNumTarjeta.getText().toString();
        String vence_tarjeta  = txtVenceTarjeta.getText().toString();
        String cod_seguridad  = txtCodseguridad.getText().toString();



        Cliente cli  = new Cliente(dni,nombres,apellidos,correo,contrasena,
                                    num_tarjeta,vence_tarjeta,cod_seguridad);

        clienteRef.child(dni).setValue(cli);

        Intent login = new Intent(this,MainActivity.class);
        startActivity(login);
    }
}