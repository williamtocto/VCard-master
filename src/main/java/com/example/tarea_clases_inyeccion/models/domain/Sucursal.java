package com.example.tarea_clases_inyeccion.models.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Sucursal {

    @Autowired
    private List<Ciudad> ciudades;

    private int codigo_sucursal;
    private String nombre_sucursal;

    public Sucursal(int codigo_sucursal, String nombre_sucursal) {
        this.codigo_sucursal = codigo_sucursal;
        this.nombre_sucursal = nombre_sucursal;
    }

    public int getCodigo_sucursal() {
        return codigo_sucursal;
    }

    public void setCodigo_sucursal(int codigo_sucursal) {
        this.codigo_sucursal = codigo_sucursal;
    }

    public String getNombre_sucursal() {
        return nombre_sucursal;
    }

    public void setNombre_sucursal(String nombre_sucursal) {
        this.nombre_sucursal = nombre_sucursal;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
