package com.jeison.devlog.bitacora.objetivos.controller;

import com.jeison.devlog.bitacora.objetivos.model.ObjetivosEntry;
import com.jeison.devlog.bitacora.objetivos.service.ObjetivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/objetivos")
public class ObjetivosController {

	private final ObjetivosService objetivosService;

	@Autowired
	public ObjetivosController(ObjetivosService objetivosService) {
		this.objetivosService = objetivosService;
	}

	@PostMapping
	public void guardarObjetivo(@RequestBody ObjetivosEntry objetivo) {
		objetivosService.guardarObjetivo(objetivo);
	}

	@DeleteMapping("/{id}")
	public void borrarObjetivo(@PathVariable Long id) {
		objetivosService.borrarObjetivo(id);
	}

	@GetMapping
	public List<ObjetivosEntry> listarObjetivos() {
		return objetivosService.listarObjetivos();
	}
}
