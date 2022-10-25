package com.tcc.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.projeto.model.Resposta;

@RequestMapping("/perguntas")
@RestController
public class PerguntasController {

    @GetMapping("/listagem")
	public Resposta listaPerguntas() {
        Resposta resposta1 = new Resposta();
        resposta1.setMedia(10);
        resposta1.setNome_usuario("Igor");
        resposta1.setSoma(100);
        return resposta1;
    
    

    }
		
}