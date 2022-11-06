package com.tcc.projeto.controller;


import com.tcc.projeto.service.ComputadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tcc.projeto.model.Computador;

import java.util.List;

@RequestMapping("/computadores")
@RestController
public class ComputerController{

	@Autowired
	ComputadorService computadorService = new ComputadorService();
	@GetMapping("/")
	public ResponseEntity<List<Computador>> buscaTodosOsComputadores(){
		List<Computador> todos = computadorService.buscarTodosComputadores();
		return ResponseEntity.ok(todos);
	}




//		Computador pc1 = new Computador();
//
//		pc1.setId(1);
//		pc1.setProcessador("I7 10700");
//		pc1.setRam("16GB ddr4 3200mhz(2x8)");
//		pc1.setCooler(null);
//		pc1.setFonte("reddragon 700Wats 80 plus gold");
//		pc1.setPlacaDeVideo("rx 6700xt");
//		pc1.setPlacaMae("h410 biostar");
//		pc1.setHdSsd("SSD 500GB");
//		pc1.setGabinete("Gabinete Legend");
//		pc1.setValor(7000);
//		pc1.setDescricao("PC Para jogar e trabalhar com qualquer coisa no mais auto nivel.");
//
//		System.out.println("Setado todos itens");
//		return pc1;


}
