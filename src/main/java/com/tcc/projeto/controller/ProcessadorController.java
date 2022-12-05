package com.tcc.projeto.controller;


import com.tcc.projeto.model.Gpu;
import com.tcc.projeto.model.Processador;
import com.tcc.projeto.service.ComputadorService;
import com.tcc.projeto.service.PlacaDeVideoService;
import com.tcc.projeto.service.ProcessadorService;
import org.apache.tomcat.jni.Proc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tcc.projeto.model.Computador;

import java.util.List;

@RequestMapping("/processador")
@RestController
public class ProcessadorController{

    @Autowired
    ProcessadorService processadorService = new ProcessadorService();
    @GetMapping("/")
    public ResponseEntity<List<Processador>> buscaTodosOsComputadores(){
        List<Processador> todos = processadorService.buscarTodosProcessadores();
        return ResponseEntity.ok(todos);
    }

}