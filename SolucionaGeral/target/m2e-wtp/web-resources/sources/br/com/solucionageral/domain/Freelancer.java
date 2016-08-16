package br.com.solucionageral.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Freelancer extends GenericDomain{
	
	@Column(length = 50, nullable = false)
	public String nomeFreelancer;
	
	@Column(length = 15, nullable = false)
	public String cpfFreelancer;

	@Column(length = 30, nullable = false)
	public String loginFreelancer;
	
	@Column(length = 20, nullable = false)
	public String senhaFreelancer;
	
	@Column(length = 50, nullable = false)
	public String siteFreelancer;

	@ManyToOne
	@JoinColumn(nullable = false)
	public Contato contato;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	public Endereco endereco;

	public String getNomeFreelancer() {
		return nomeFreelancer;
	}

	public void setNomeFreelancer(String nomeFreelancer) {
		this.nomeFreelancer = nomeFreelancer;
	}

	public String getCpfFreelancer() {
		return cpfFreelancer;
	}

	public void setCpfFreelancer(String cpfFreelancer) {
		this.cpfFreelancer = cpfFreelancer;
	}

	public String getLoginFreelancer() {
		return loginFreelancer;
	}

	public void setLoginFreelancer(String loginFreelancer) {
		this.loginFreelancer = loginFreelancer;
	}

	public String getSenhaFreelancer() {
		return senhaFreelancer;
	}

	public void setSenhaFreelancer(String senhaFreelancer) {
		this.senhaFreelancer = senhaFreelancer;
	}

	public String getSiteFreelancer() {
		return siteFreelancer;
	}

	public void setSiteFreelancer(String siteFreelancer) {
		this.siteFreelancer = siteFreelancer;
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
