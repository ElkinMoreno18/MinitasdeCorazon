package com.keycode.minitasdecorazon.service;

import com.keycode.minitasdecorazon.jpa.entity.DesminadoProcess;

import java.util.List;

public interface DesminadoService {

    Iterable<DesminadoProcess> listarProcesosDesminado();

    List<DesminadoProcess> listarProcesosDesminadoPorRegion(String region);

    DesminadoProcess agregarProcesoDesminado(DesminadoProcess procesoDesminado);

    DesminadoProcess actualizarProcesoDesminado(Long id, DesminadoProcess procesoDesminado);

    void eliminarProcesoDesminado(Long id);

}
