package com.keycode.minitasdecorazon.controller;

import com.keycode.minitasdecorazon.jpa.entity.DesminadoProcess;
import com.keycode.minitasdecorazon.service.DesminadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/agente")
public class AgentController {

    @Autowired
    private DesminadoService desminadoService;


    @GetMapping("/")
    public List<DesminadoProcess> listarProcesosDesminadoPorRegion(@RequestParam("region") String region) {
        return desminadoService.listarProcesosDesminadoPorRegion("Region1");
    }

}
