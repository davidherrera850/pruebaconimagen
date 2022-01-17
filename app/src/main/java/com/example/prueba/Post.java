package com.example.prueba;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Post {
    private String id;
    private String nombre;
    private String apodo;
    private String imagen;

    public Post(String id, String nombre, String apodo, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
