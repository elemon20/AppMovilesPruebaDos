package com.example.tarea;

import java.io.Serializable;


public class Tarea implements Serializable {
    private int id;
    private String titulo;
    private String descripcion;

    public String toString() {
        return "tarea :" + titulo + " descripción:" + descripcion;
    }


    //// constructores

    public Tarea(){}

    public Tarea(String titulo, String descripcion){
        setTitulo(titulo);
        setDescripcion(descripcion);
    }


    //// get y set

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String nuevaTitulo) {
        titulo = nuevaTitulo.toUpperCase();
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion.toUpperCase();
    }




}
