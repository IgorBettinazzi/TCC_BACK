package com.tcc.projeto.controller;


import com.tcc.projeto.model.Gpu;
import com.tcc.projeto.service.ComputadorService;
import com.tcc.projeto.service.PlacaDeVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tcc.projeto.model.Computador;

import java.util.List;

@RequestMapping("/placaDeVideo")
@RestController
public class PlacaDeVideoController{

    @Autowired
    PlacaDeVideoService placaDeVideoService = new PlacaDeVideoService();
    @GetMapping("/")
    public ResponseEntity<List<Gpu>> buscaTodosOsComputadores(){
        List<Gpu> todos = placaDeVideoService.buscarTodasPlacasDeVideo();
        return ResponseEntity.ok(todos);
    }

}