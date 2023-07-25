package com.keycode.minitasdecorazon.controller;

import com.keycode.minitasdecorazon.jpa.entity.DesminadoProcess;
import com.keycode.minitasdecorazon.service.DesminadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/analista")
public class AnalystController {

    @Autowired
    private DesminadoService desminadoService;

    @PostMapping("/")
    public DesminadoProcess agregarProcesoDesminado(@RequestBody DesminadoProcess procesoDesminado) {
        return desminadoService.agregarProcesoDesminado(procesoDesminado);
    }

    @PutMapping("/{id}")
    public DesminadoProcess actualizarProcesoDesminado(@PathVariable("id") Long id, @RequestBody DesminadoProcess procesoDesminado) {
        return desminadoService.actualizarProcesoDesminado(id, procesoDesminado);
    }

    @DeleteMapping("/{id}")
    public void eliminarProcesoDesminado(@PathVariable("id") Long id) {
        desminadoService.eliminarProcesoDesminado(id);
    }
}
