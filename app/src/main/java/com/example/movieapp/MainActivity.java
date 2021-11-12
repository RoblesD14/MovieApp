package com.example.movieapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private FirebaseDatabase database;
    private DatabaseReference clienteRef;

    private EditText et_correo, et_contraseña;
    private Button btn_iniciar_sesion;

    private ArrayList<Cliente> listaCliente;
    private Cliente objCliente;
    private boolean ClienteEncontrado;
    private String nombres;
    private  String apellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ini();
        ClienteEncontrado = false;
        database = FirebaseDatabase.getInstance();
        clienteRef = database.getReference("movie_app/clientes");
    }
    public void ini (){

        et_correo = (EditText) findViewById(R.id.et_correo);
        et_contraseña = (EditText) findViewById(R.id.et_contraseña);
        btn_iniciar_sesion = (Button) findViewById(R.id.btn_iniciar_sesion);
        btn_iniciar_sesion.setOnClickListener((View.OnClickListener) this);

    }
    private void llenarClientes() {

        /*listaCliente = new ArrayList<Cliente>();
        listaCliente.add(new Cliente("Monica", "Robles", "monica@gmail.com",  "123456"));
        listaCliente.add(new Cliente("jzo", "Robles", "jzo@gmail.com", "1234"));*/
    }

    private void iniciarSesion() {
        String correo = et_correo.getText().toString();
        String contraseña = et_contraseña.getText().toString();
        DatabaseReference newRef = clienteRef.child(correo);

        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String corre_nuevo = dataSnapshot.child("dni").getValue(String.class);
                String clave_nueva = dataSnapshot.child("contrasena").getValue(String.class);

                if(correo.equals(corre_nuevo) && contraseña.equals(clave_nueva))
                {
                    ClienteEncontrado = true;
                    nombres = dataSnapshot.child("nombre").getValue(String.class);
                    apellidos = dataSnapshot.child("apellidos").getValue(String.class);
                    Toast.makeText(MainActivity.this, "PROYECTO " + nombres, Toast.LENGTH_SHORT).show();
                }

                if(ClienteEncontrado)
                {
                    Intent inicio = new Intent(MainActivity.this, Principal.class);
                    inicio.putExtra("nombres",nombres);
                    inicio.putExtra("apellidos",apellidos);
                    startActivity(inicio);
                }
                if(!ClienteEncontrado)
                {
                    Toast.makeText(MainActivity.this, "correo o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) { }
        };

        newRef.addListenerForSingleValueEvent(valueEventListener);
    }
      @Override
      public void onClick(View v) {
        if (v.getId() == R.id.btn_iniciar_sesion){
            iniciarSesion();
        }
    }

    public void registrarse(View view) {
            Intent iregistro  = new Intent(this,Registro.class);
            startActivity(iregistro);
    }

}