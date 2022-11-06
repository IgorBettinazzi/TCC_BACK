package com.tcc.projeto.controller;

import com.tcc.projeto.model.Computador;
import com.tcc.projeto.model.Questionario;
import com.tcc.projeto.service.PerguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.projeto.model.Resposta;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("/perguntas")
@RestController
public class PerguntasController {

    @Autowired
    PerguntasService perguntasService = new PerguntasService();


    @GetMapping("/")
    public ResponseEntity<List<Questionario>> buscaTodasPerguntasDosPcs(){
        List<Questionario> todos = perguntasService.buscarTodasPerguntas();
        return ResponseEntity.ok(todos);
    }

    //    @GetMapping("/listagem")
//	public Resposta listaPerguntas() {
//        Resposta resposta1 = new Resposta();
//        resposta1.setMedia(10);
//        resposta1.setNome_usuario("Igor");
//        resposta1.setSoma(100);
//        return resposta1;
//
//
//
//    }

}