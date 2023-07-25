package com.keycode.minitasdecorazon.service.impl;


import com.keycode.minitasdecorazon.jpa.entity.DesminadoProcess;
import com.keycode.minitasdecorazon.jpa.repository.DesminadoProcessRepository;
import com.keycode.minitasdecorazon.service.DesminadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesminadoServiceImpl implements DesminadoService {

    @Autowired
    private DesminadoProcessRepository desminadoRepository;

    @Override
    public List<DesminadoProcess> listarProcesosDesminado() {
        return (List<DesminadoProcess>) desminadoRepository.findAll();
    }

    @Override
    public List<DesminadoProcess> listarProcesosDesminadoPorRegion(String region) {
        return desminadoRepository.findByRegion(region);
    }

    @Override
    public DesminadoProcess agregarProcesoDesminado(DesminadoProcess procesoDesminado) {
        return desminadoRepository.save(procesoDesminado);
    }

    @Override
    public DesminadoProcess actualizarProcesoDesminado(Long id, DesminadoProcess procesoDesminado) {
        // Verificar si el proceso existe
        DesminadoProcess procesoExistente = desminadoRepository.findById(id).orElse(null);
        if (procesoExistente != null) {
            procesoDesminado.setId(id); // Establecer el ID del proceso existente en el objeto actualizado
            return desminadoRepository.save(procesoDesminado);
        }
        return null; // El proceso no existe
    }

    @Override
    public void eliminarProcesoDesminado(Long id) {
        desminadoRepository.deleteById(id);
    }

}
