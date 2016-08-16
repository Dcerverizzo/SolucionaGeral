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
public class Anuncio extends GenericDomain{
	
	@Column(length=30, nullable = false)
	private String nomeAnuncio;
	
	@Column(length=200, nullable = false)
	private String descricaoAnuncio;
	
	@Column(length=20, nullable = false)
	private String contatoAnuncio;
	
	@Column(nullable= false)
	@Temporal(TemporalType.DATE)
	private Date duracaoAnuncio;
	
	@Column(length=200, nullable = false)
	private String imagemAnuncio;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Freelancer freelancer;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Categoria categoria;

	public String getNomeAnuncio() {
		return nomeAnuncio;
	}

	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}

	public String getDescricaoAnuncio() {
		return descricaoAnuncio;
	}

	public void setDescricaoAnuncio(String descricaoAnuncio) {
		this.descricaoAnuncio = descricaoAnuncio;
	}

	public String getContatoAnuncio() {
		return contatoAnuncio;
	}

	public void setContatoAnuncio(String contatoAnuncio) {
		this.contatoAnuncio = contatoAnuncio;
	}

	public Date getDuracaoAnuncio() {
		return duracaoAnuncio;
	}

	public void setDuracaoAnuncio(Date duracaoAnuncio) {
		this.duracaoAnuncio = duracaoAnuncio;
	}

	public String getImagemAnuncio() {
		return imagemAnuncio;
	}

	public void setImagemAnuncio(String imagemAnuncio) {
		this.imagemAnuncio = imagemAnuncio;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
