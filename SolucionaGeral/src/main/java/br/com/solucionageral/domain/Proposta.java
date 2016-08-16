package br.com.solucionageral.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Proposta extends GenericDomain {
	
	@Column(length = 100, nullable = false)
	public String descricaoProposta;

	@Column(nullable = false, precision = 10, scale = 2)
	public Double valorProposta;
	
	@Column(nullable= false)
	@Temporal(TemporalType.DATE)
	public Date duracaoProposta;
	
	@ManyToOne
	@JoinColumn(nullable= false)
	public Freelancer freelancer;
	
	@ManyToOne
	@JoinColumn(nullable= false)
	public Projeto projeto;

	public String getDescricaoProposta() {
		return descricaoProposta;
	}

	public void setDescricaoProposta(String descricaoProposta) {
		this.descricaoProposta = descricaoProposta;
	}

	public Double getValorProposta() {
		return valorProposta;
	}

	public void setValorProposta(Double valorProposta) {
		this.valorProposta = valorProposta;
	}

	public Date getDuracaoProposta() {
		return duracaoProposta;
	}

	public void setDuracaoProposta(Date duracaoProposta) {
		this.duracaoProposta = duracaoProposta;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
}
