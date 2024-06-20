package com.example.lab920215421.Beans;

import java.util.Date;

public class Licencia {
    private int idLiciencia;
    private String categoria;
    private Date fechaEmision;
    private Date fechaCaducidad;
    private Pais pais;

    public int getIdLiciencia() {
        return idLiciencia;
    }

    public void setIdLiciencia(int idLiciencia) {
        this.idLiciencia = idLiciencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
