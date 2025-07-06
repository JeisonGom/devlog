package com.jeison.devlog.bitacora.diario.service;

import com.jeison.devlog.bitacora.diario.model.DiarioEntry;
import com.jeison.devlog.bitacora.diario.repository.DiarioRepository;
import com.jeison.devlog.bitacora.diario.service.DiarioService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DiarioServiceImpl implements DiarioService {

    private DiarioRepository diarioRepository;

    public DiarioServiceImpl(DiarioRepository diarioRepository) {
        this.diarioRepository = diarioRepository;
    }

    @Override
    public void guardarAnotacion(DiarioEntry anotacion) {
        Optional<DiarioEntry> existente = diarioRepository.findByFecha(anotacion.getFecha());

        if (existente.isPresent()) {
            DiarioEntry anotacionExistente = existente.get();
            anotacionExistente.setQueAprendi(anotacion.getQueAprendi());
            anotacionExistente.setQueMeCosto(anotacion.getQueMeCosto());
            diarioRepository.save(anotacionExistente);
        } else {
            diarioRepository.save(anotacion);
        }
    }

    @Override
    public void borrarAnotacion(Long id) {
        Optional<DiarioEntry> existente = diarioRepository.findById(id);
        if (existente.isPresent()) {
            diarioRepository.deleteById(id);
        } else {
            System.out.println("Esta nota no se encuentra dentro de tu diario");
        }

    }

    @Override
    public List<DiarioEntry> listarAnotacionesOrdenadasPorFecha() {
        return diarioRepository.findAllByOrderByFechaDesc();
    }

}
