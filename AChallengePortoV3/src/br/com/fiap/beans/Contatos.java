package br.com.fiap.beans;

public class Contatos {
	// variáveis
	private String telefoneResidencial;
	private String celular;
	private String contratoPrincipal;
	private String email;
	// vazio
	public Contatos() {
		super();
	}
	// cheio
	public Contatos(String telefoneResidencial, String celular, String contratoPrincipal, String email) {
		super();
		this.telefoneResidencial = telefoneResidencial;
		this.celular = celular;
		this.contratoPrincipal = contratoPrincipal;
		this.email = email;
	}
	// setters and getters
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getContratoPrincipal() {
		return contratoPrincipal;
	}
	public void setContratoPrincipal(String contratoPrincipal) {
		this.contratoPrincipal = contratoPrincipal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
