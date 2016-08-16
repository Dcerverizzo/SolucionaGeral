package br.com.solucionageral.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Administrador extends GenericDomain {
	
	@Column(length = 50, nullable = false)
	public String nomeAdministrador;
	
	@Column(length = 15, nullable = false)
	public String cpfAdministrador;

	@Column(length = 30, nullable = false)
	public String loginAdministrador;
	
	@Column(length = 20, nullable = false)
	public String senhaAdministrador;

	@ManyToOne
	@JoinColumn(nullable = false)
	public Contato contato;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	public Endereco endereco;

	public String getNomeAdministrador() {
		return nomeAdministrador;
	}

	public void setNomeAdministrador(String nomeAdministrador) {
		this.nomeAdministrador = nomeAdministrador;
	}

	public String getCpfAdministrador() {
		return cpfAdministrador;
	}

	public void setCpfAdministrador(String cpfAdministrador) {
		this.cpfAdministrador = cpfAdministrador;
	}

	public String getLoginAdministrador() {
		return loginAdministrador;
	}

	public void setLoginAdministrador(String loginAdministrador) {
		this.loginAdministrador = loginAdministrador;
	}

	public String getSenhaAdministrador() {
		return senhaAdministrador;
	}

	public void setSenhaAdministrador(String senhaAdministrador) {
		this.senhaAdministrador = senhaAdministrador;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
