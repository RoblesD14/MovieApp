package com.example.movieapp;

public class Pelicula {
    private int id;
    private String titulo;
    private String descripcion;
    private int anho;
    private int poster;

    public Pelicula(int id,String titulo, String descripcion, int anho, int poster) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anho = anho;
        this.poster = poster;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
