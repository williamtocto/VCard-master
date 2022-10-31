package com.example.tarea_clases_inyeccion.models.domain;

import org.springframework.stereotype.Component;


public class Ciudad {

    //@Value("${ciudad.codigo}")
    private int codigo_ciudad;
   // @Value("${ciudad.nombre}")
    private String nombre_ciudad;

    public Ciudad(int codigo_ciudad, String nombre_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
        this.nombre_ciudad = nombre_ciudad;
    }

    public int getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(int codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
}
