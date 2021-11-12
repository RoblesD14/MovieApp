package com.example.movieapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    private FirebaseDatabase database;
    private DatabaseReference peliculaRef;
    private ListView lista;
    private ArrayList<String> lsPelicula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TextView txtsaludo = (TextView) findViewById(R.id.txtSaludo);
        String nombre = getIntent().getExtras().getString("nombres");
        String apellidos = getIntent().getExtras().getString("apellidos");
        txtsaludo.setText("BIENVENIDO AL MENU PRINCIPAL: "+nombre+' '+apellidos);

        database = FirebaseDatabase.getInstance();
        peliculaRef = database.getReference("movie_app/peliculas");


        /*lsPelicula = new ArrayList<String>();
        final ArrayAdapter<String> adpater = new ArrayAdapter<String>(Principal.this,R.layout.activity_principal,lsPelicula);

        lista = (ListView) findViewById(R.id.lvwPeliculas);
        lista.setAdapter(adpater);*/

        /*peliculaRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                lsPelicula.add(snapshot.getValue(String.class));
                adpater.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                //adpater.notifyDataSetChanged();
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {
                lsPelicula.remove(snapshot.getValue(String.class));
                adpater.notifyDataSetChanged();
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/

    }

    public void logout(View view) {
        Intent salir = new Intent(this,MainActivity.class);
        startActivity(salir);
    }
}