package com.example.movieapp;

public class Pelicula {

    private String titulo;
    private String descripcion;
    private int anho;
    private int poster;

    public Pelicula(String titulo, String descripcion, int anho, int poster) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anho = anho;
        this.poster = poster;
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
