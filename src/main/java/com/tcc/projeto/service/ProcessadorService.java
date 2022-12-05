package com.tcc.projeto.service;

import com.tcc.projeto.model.Computador;
import com.tcc.projeto.model.Gpu;
import com.tcc.projeto.model.Processador;
import com.tcc.projeto.repository.ComputadorRepository;
import com.tcc.projeto.repository.PlacaDeVideoRepository;
import com.tcc.projeto.repository.ProcessadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessadorService {

    @Autowired
    private ProcessadorRepository processadorRepository;


    public List<Processador> buscarTodosProcessadores(){
        return processadorRepository.findAll();

    }




}