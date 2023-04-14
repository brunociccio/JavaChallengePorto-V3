package br.com.fiap.main;

import br.com.fiap.beans.Bicicleta;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Contatos;
import br.com.fiap.beans.Documentos;
import br.com.fiap.beans.Endereço;
import br.com.fiap.beans.Modalidade;
import br.com.fiap.beans.Seguros;
import br.com.fiap.beans.Sistema;

public class TesteSistema {

	public static void main(String[] args) {
		// instanciar
		Sistema objSistema = new Sistema();
		// Cliente(String nome, int idade, String sexo, String estadoCivil, String nacionalidade)
		Cliente objCliente = new Cliente();
		// Endereço(String cep, String logradouro, int número, String bairro, String cidade, String estado)
		Endereço objEndereço = new Endereço();
		// Documentos(String rg, String cpf, String cnh)
		Documentos objDocumentos = new Documentos();
		// Contatos(String telefoneResidencial, String celular, String contratoPrincipal, String email)
		Contatos objContatos = new Contatos();
		// Modalidade(String mountainBike, String performance, String urbana)
		Modalidade objModalidade = new Modalidade();
		// Bicicleta(String marca, String modelo, float valor, String cor, int ano, String notaFiscal)
		Bicicleta objBicicleta = new Bicicleta();
		// Seguros(String pedalEssencial, String pedalLeve, String pedalElite)
		Seguros objSeguros = new Seguros();
		
		objSistema.setCliente(objCliente);
		objSistema.setEndereço(objEndereço);
		objSistema.setDocumentos(objDocumentos);
		objSistema.setContatos(objContatos);
		objSistema.setModalidade(objModalidade);
		objSistema.setBicicleta(objBicicleta);
		objSistema.setSeguros(objSeguros);
		
		System.out.println();

	}

}
