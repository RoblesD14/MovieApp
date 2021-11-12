package com.example.movieapp;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String dni;
    private String nombres;
    private String apellidos;
    private String correo;
    private String contrasena;
    private String numero_tarjeta;
    private String fecha_vence;
    private String codigo_seguridad;

    public Cliente(){}

    public Cliente(String dni,String nombres, String apellidos, String correo, String contrasena,
            String numero_tarjeta,String fecha_vence, String codigo_seguridad) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.numero_tarjeta = numero_tarjeta;
        this.fecha_vence = fecha_vence;
        this.codigo_seguridad = codigo_seguridad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNumeroTarjeta() {
        return numero_tarjeta;
    }

    public void setNumeroTarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getFechaVence() {
        return fecha_vence;
    }

    public void setFechaVence(String fecha_vence) {
        this.fecha_vence = fecha_vence;
    }

    public String getCodigoSeguridad() {
        return codigo_seguridad;
    }

    public void setCodigoSeguridad(String codigo_seguridad) {
        this.codigo_seguridad = codigo_seguridad;
    }
}
