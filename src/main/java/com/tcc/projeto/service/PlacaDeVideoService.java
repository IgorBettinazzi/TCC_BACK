package com.tcc.projeto.service;

import com.tcc.projeto.model.Computador;
import com.tcc.projeto.model.Gpu;
import com.tcc.projeto.repository.ComputadorRepository;
import com.tcc.projeto.repository.PlacaDeVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacaDeVideoService {

    @Autowired
    private PlacaDeVideoRepository placaDeVideoRepository;


    public List<Gpu> buscarTodasPlacasDeVideo(){
        return placaDeVideoRepository.findAll();

    }




}