package com.tcc.projeto.model;

public class Computador {

	private int id;
	private String processador;
	private String ram;
	private String cooler;
	private String fonte;
	private String placaDeVideo;
	private String placaMae;
	private String hdSsd;
	private String gabinete;
	private int valor;
	private String descricao;
	
	
	// getters e setters 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCooler() {
		return cooler;
	}
	public void setCooler(String cooler) {
		this.cooler = cooler;
	}
	public String getFonte() {
		return fonte;
	}
	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
	public String getPlacaDeVideo() {
		return placaDeVideo;
	}
	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}
	public String getPlacaMae() {
		return placaMae;
	}
	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}
	public String getHdSsd() {
		return hdSsd;
	}
	public void setHdSsd(String hdSsd) {
		this.hdSsd = hdSsd;
	}
	public String getGabinete() {
		return gabinete;
	}
	public void setGabinete(String gabinete) {
		this.gabinete = gabinete;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
