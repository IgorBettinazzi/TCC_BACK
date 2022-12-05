package com.tcc.projeto.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "computador")
public class Computador {

	@Id
	@Column(name = "idcomputador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Column(name = "nome_pc")
	private String nomeDoComputador;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idprocessador")
	private Processador processador;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idmemoria_ram")
	private MemoriaRam ram;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idwater_cooler")
	private WaterCooler waterCooler;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idgabinete")
	private Gabinete gabinete;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idgpu")
	private Gpu placaDeVideo;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idplaca_mae")
	private PlacaMae placaMae;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idhd")
	private Hd hd;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idssd")
	private Ssd ssd;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "idfonte")
	private Fonte fonte;

	@NotNull
	@Column(name = "preco")
	private int valor;

	@NotNull
	@Column(name = "pontos")
	private int ponto;

	
	

	
}
