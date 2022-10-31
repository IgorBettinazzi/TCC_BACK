package com.tcc.projeto.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "computadores")
public class Computador {

	@Id
	@Column(name = "idcomputadores")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Column(name = "nome_pc")
	private String nomeDoComputador;

	@NotNull
	@JoinColumn(name = "idprocessadores ")
	private String processador;

	@NotNull
	@JoinColumn(name = "idmemoria_ram")
	private String ram;

	@NotNull
	@JoinColumn(name = "idwater_cooler")
	private String waterCooler;

	@NotNull
	@JoinColumn(name = "idfontes")
	private String fonte;

	@NotNull
	@JoinColumn(name = "idgpu")
	private String placaDeVideo;

	@NotNull
	@JoinColumn(name = "idplaca_mae")
	private String placaMae;

	@NotNull
	@JoinColumn(name = "idhd")
	private String hd;

	@NotNull
	@JoinColumn(name = "idssd")
	private String ssd;

	@NotNull
	@JoinColumn(name = "idgabinete")
	private String gabinete;

	@NotNull
	@Column(name = "preco")
	private int valor;

	@NotNull
	@Column(name = "pontos")
	private int pontos;

	
	

	
}
