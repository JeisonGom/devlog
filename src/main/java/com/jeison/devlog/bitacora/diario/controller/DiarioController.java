package com.jeison.devlog.bitacora.diario.controller;

import com.jeison.devlog.bitacora.diario.model.DiarioEntry;
import com.jeison.devlog.bitacora.diario.service.DiarioService;
import com.jeison.devlog.bitacora.diario.service.DiarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
@RequestMapping("/api/diario")
public class DiarioController {
    private final DiarioService diarioService;

    @Autowired
    public DiarioController(DiarioService diarioService) {
        this.diarioService = diarioService;
    }

    @PostMapping
    public void guardarAnotacion(@RequestBody DiarioEntry anotacion) {
        diarioService.guardarAnotacion(anotacion);
    }

    @DeleteMapping("/{id}")
    public void borrarAnotacion(@PathVariable Long id) {
        diarioService.borrarAnotacion(id);
    }

    @GetMapping
    public List<DiarioEntry> listarAnotaciones() {
        return diarioService.listarAnotacionesOrdenadasPorFecha();
    }
}


