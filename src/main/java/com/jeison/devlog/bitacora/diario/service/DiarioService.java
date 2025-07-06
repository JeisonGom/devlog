package com.jeison.devlog.bitacora.diario.service;

import com.jeison.devlog.bitacora.diario.model.DiarioEntry;

import java.util.List;

public interface DiarioService {
    void guardarAnotacion(DiarioEntry anotacion);
    void borrarAnotacion(Long id);
    List<DiarioEntry> listarAnotacionesOrdenadasPorFecha();
}