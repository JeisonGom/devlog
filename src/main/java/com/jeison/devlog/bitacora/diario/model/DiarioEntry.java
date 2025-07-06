package com.jeison.devlog.bitacora.diario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Data
@Entity

public class DiarioEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private String queAprendi;
    private String queMeCosto;
    private String queQuieroAprender;
    private String estadoEmocional;

    public DiarioEntry(Long id, LocalDate fecha, String queAprendi, String queMeCosto, String queQuieroAprender, String estadoEmocional) {
        this.id = id;
        this.fecha = fecha;
        this.queAprendi = queAprendi;
        this.queMeCosto = queMeCosto;
        this.queQuieroAprender = queQuieroAprender;
        this.estadoEmocional = estadoEmocional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getQueAprendi() {
        return queAprendi;
    }

    public void setQueAprendi(String queAprendi) {
        this.queAprendi = queAprendi;
    }

    public String getQueMeCosto() {
        return queMeCosto;
    }

    public void setQueMeCosto(String queMeCosto) {
        this.queMeCosto = queMeCosto;
    }

    public String getQueQuieroAprender() {
        return queQuieroAprender;
    }

    public void setQueQuieroAprender(String queQuieroAprender) {
        this.queQuieroAprender = queQuieroAprender;
    }

    public String getEstadoEmocional() {
        return estadoEmocional;
    }

    public void setEstadoEmocional(String estadoEmocional) {
        this.estadoEmocional = estadoEmocional;
    }
}
