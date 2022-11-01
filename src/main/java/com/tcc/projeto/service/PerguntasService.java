package com.tcc.projeto.service;

import com.tcc.projeto.model.Questionario;
import com.tcc.projeto.repository.PerguntasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerguntasService {

    @Autowired
    private PerguntasRepository perguntasRepository;



    public List<Questionario> buscarTodasPerguntas(){
        return perguntasRepository.findAll();
    }
}
