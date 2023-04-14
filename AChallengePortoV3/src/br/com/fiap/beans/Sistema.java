package br.com.fiap.beans;

public class Sistema {

	// variáveis
	private Cliente cliente;
	private Endereço endereço;
	private Documentos documentos;
	private Contatos contatos;
	private Modalidade modalidade;
	private Bicicleta bicicleta;
	private Seguros seguros;
	// construtor vazio
	public Sistema() {
		super();
	}
	// construtor cheio
	public Sistema(Cliente cliente, Endereço endereço, Documentos documentos, Contatos contatos, Modalidade modalidade,
			Bicicleta bicicleta, Seguros seguros) {
		super();
		this.cliente = cliente;
		this.endereço = endereço;
		this.documentos = documentos;
		this.contatos = contatos;
		this.modalidade = modalidade;
		this.bicicleta = bicicleta;
		this.seguros = seguros;
	}
	// setters and getters
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Endereço getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	public Documentos getDocumentos() {
		return documentos;
	}
	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}
	public Contatos getContatos() {
		return contatos;
	}
	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public Bicicleta getBicicleta() {
		return bicicleta;
	}
	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	public Seguros getSeguros() {
		return seguros;
	}
	public void setSeguros(Seguros seguros) {
		this.seguros = seguros;
	}
	
}
