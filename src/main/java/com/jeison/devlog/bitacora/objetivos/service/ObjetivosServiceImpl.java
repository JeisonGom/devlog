package com.jeison.devlog.bitacora.objetivos.service;

import com.jeison.devlog.bitacora.diario.model.DiarioEntry;
import com.jeison.devlog.bitacora.objetivos.model.ObjetivosEntry;
import com.jeison.devlog.bitacora.objetivos.repository.ObjetivosRepository;
import com.jeison.devlog.bitacora.objetivos.service.ObjetivosService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ObjetivosServiceImpl implements ObjetivosService {

    private final ObjetivosRepository objetivosRepository;

    public ObjetivosServiceImpl(ObjetivosRepository objetivosRepository) {
        this.objetivosRepository = objetivosRepository;
    }

    @Override
    public void guardarObjetivo(ObjetivosEntry objetivoPropuesto) {
        Optional<ObjetivosEntry> objetivoExistente = objetivosRepository.findByTitulo(objetivoPropuesto.getTitulo());

        if (objetivoExistente.isPresent()) {
            ObjetivosEntry existente = objetivoExistente.get();
            existente.setDescripcion(objetivoPropuesto.getDescripcion());
            objetivosRepository.save(existente);
        } else {
            objetivosRepository.save(objetivoPropuesto);
        }
    }

    @Override
    public void borrarObjetivo(Long id) {
        Optional<ObjetivosEntry> existente = objetivosRepository.findById(id);
        if(existente.isPresent()) {
            objetivosRepository.deleteById(id);
        } else {
            System.out.println("Este objetivo no se ha encontrado");
        }
    }
}
