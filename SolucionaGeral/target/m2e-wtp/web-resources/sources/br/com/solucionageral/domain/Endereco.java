package br.com.solucionageral.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Endereco extends GenericDomain{

	@Column(length=100, nullable= false)
	public String endereco;
	
	@Column(length=5, nullable= false)
	public Integer numero;
	
	@Column(length=50, nullable= false)
	public String bairro;
	
	@Column(length=50, nullable= false)
	public String cidade;
	
	@Column(length=10, nullable= false)
	public String cep;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
