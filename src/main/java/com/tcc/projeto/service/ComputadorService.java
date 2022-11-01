package com.tcc.projeto.service;

import com.tcc.projeto.model.Computador;
import com.tcc.projeto.repository.ComputadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputadorService {

    @Autowired
    private ComputadorRepository computadorRepository;


    public List<Computador> buscarTodosComputadores(){
        return computadorRepository.findAll();

    }




}
