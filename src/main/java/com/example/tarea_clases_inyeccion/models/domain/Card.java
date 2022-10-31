package com.example.tarea_clases_inyeccion.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Card {

    @Value("${card.titulo}")
    private String titulo;
    @Value("${card.empresa}")
    private String empresa;
    @Value("${card.correoEmpresa}")
    private String correoEmpresa;

    @Value("${card.direccion}")
    private String direccion;

    @Autowired
    private List<Empleado> empleado;

    @Autowired
    private List<Ciudad> ciudad;

    @Autowired
    private List<Sucursal> sucursal;

    public List<Ciudad> getCiudad() {
        return ciudad;
    }

    public void setCiudad(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
    }

    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(List<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
