package br.com.fiap.beans;

public class Documentos {
	// variáveis
	private String rg;
	private String cpf;
	private String cnh;
	// vazio
	public Documentos() {
		super();
	}
	// cheio
	public Documentos(String rg, String cpf, String cnh) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.cnh = cnh;
	}
	// setters and getters
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
}
