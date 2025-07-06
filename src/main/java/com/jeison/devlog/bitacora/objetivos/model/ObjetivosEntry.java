package com.jeison.devlog.bitacora.objetivos.model;

import jakarta.persistence.Entity;

@Entity
public class ObjetivosEntry {
    private String titulo;
    private String descripcion;
    private Long id;

    public ObjetivosEntry(String titulo, String descripcion, Long id) {
        this.titulo = titulo;
        this.descripcion = descripcion;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}