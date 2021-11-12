package com.example.movieapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Contenido_Inicio  extends AppCompatActivity {


    private RecyclerView.Adapter contenido_Inicio;

    public Contenido_Inicio(List<Pelicula> peliculas, Contenido_Inicio contenido_inicio) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        List<Pelicula> peliculas = new ArrayList();
        /*peliculas.add(new Pelicula("la pelicula", "Cuando la amenaza conocida como el Joker causa estragos y el caos en Gotham City, Batman debe aceptar una de las mayores pruebas psicológicas y físicas para luchar contra la injusticia.", 2008, R.drawable.poster1));
        peliculas.add(new Pelicula("la pelicula: El retorno del rey", "Gandalf y Aragorn lideran el mundo de los hombres contra la armada de Sauron para distraer su atención de Frodo y Sam, quienes se aproximan al Monte del Destino con el Anillo Único.", 2003, R.drawable.poster2));
        peliculas.add(new Pelicula("la pelicula: Endgame", "Después de que Thanos haya aniquilado a la mitad del universo, los Vengadores supervivientes deben hacer todo lo posible por deshacer tal atrocidad.", 2019, R.drawable.poster3));
        peliculas.add(new Pelicula("la pelicula: El Soldado de Invierno", "A Steve Rogers le cuesta acostumbrarse al mundo moderno. Forma equipo con la Viuda Negra para luchar contra una nueva amenaza histórica: un asesino conocido como el Soldado de Invierno.", 2014, R.drawable.poster4));
        peliculas.add(new Pelicula("la pelicula", "Armado con una licencia para matar, el agente secreto James Bond parte en su primera misión como 007, y debe derrotar al banquero de unos terroristas en una partida de póquer de alto riesgo en Casino Royale; pero las cosas no son lo que parecen.", 2006, R.drawable.poster5));*/

        Contenido_Inicio adapter = new Contenido_Inicio(peliculas, this);
        RecyclerView miRecycler = findViewById(R.id.myRecycler);
        miRecycler.setLayoutManager(new LinearLayoutManager(this));
        miRecycler.setAdapter(contenido_Inicio);
    }

}

