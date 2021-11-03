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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et_correo, et_contraseña;
    private Button btn_iniciar_sesion;

    private ArrayList<Cliente> listaCliente;
    private Cliente objCliente;
    private boolean ClienteEncontrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ini();
    }
    public void ini (){

        et_correo = (EditText) findViewById(R.id.et_correo);
        et_contraseña = (EditText) findViewById(R.id.et_contraseña);
        btn_iniciar_sesion = (Button) findViewById(R.id.btn_iniciar_sesion);
        btn_iniciar_sesion.setOnClickListener((View.OnClickListener) this);

    }
    private void llenarClientes() {

        listaCliente = new ArrayList<Cliente>();
        listaCliente.add(new Cliente("Monica", "Robles", "monica@gmail.com",  "123456"));
        listaCliente.add(new Cliente("jzo", "Robles", "jzo@gmail.com", "1234"));
    }

    private void iniciarSesion() {

        llenarClientes();
        String correo = et_correo.getText().toString();
        String contraseña = et_contraseña.getText().toString();
        boolean ClienteEncontrado = false;
        for (int i=0; i<listaCliente.size(); i++){

            if (correo.equals(listaCliente.get(i).getCorreo()) && (contraseña.equals(listaCliente.get(i).getContraseña())))
            {
                Toast.makeText(this, "PROYECTO" + listaCliente.get(i).getNombre(), Toast.LENGTH_SHORT).show();
                ClienteEncontrado = true;
                Intent inicio = new Intent(this, Principal.class);
                inicio.putExtra("nombre",listaCliente.get(i).getNombre());
                inicio.putExtra("apellidos",listaCliente.get(i).getApellidos());
                startActivity(inicio);
            }
            else if(correo.isEmpty() || contraseña.isEmpty());{
                Toast.makeText(this, "Rellenar los campos", Toast.LENGTH_SHORT).show();
            }

        }
        if (!ClienteEncontrado) {
            Toast.makeText(this, "correo o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
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