package br.com.fiap.beans;

public class Bicicleta {
	// variáveis
	private String marca;
	private String modelo;
	private float valor;
	private String cor;
	private int ano;
	private String notaFiscal;
	// vazio
	public Bicicleta() {
		super();
	}
	// cheio
	public Bicicleta(String marca, String modelo, float valor, String cor, int ano, String notaFiscal) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.cor = cor;
		this.ano = ano;
		this.notaFiscal = notaFiscal;
	}
	// setters and getters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

}
