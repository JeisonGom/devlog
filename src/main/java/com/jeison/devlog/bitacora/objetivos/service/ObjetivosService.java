package com.jeison.devlog.bitacora.objetivos.service;

import com.jeison.devlog.bitacora.objetivos.model.ObjetivosEntry;
import java.util.List;

public interface ObjetivosService {
    void guardarObjetivo(ObjetivosEntry objetivo);
    void borrarObjetivo(Long id);
    List<ObjetivosEntry> listarObjetivos();
}
