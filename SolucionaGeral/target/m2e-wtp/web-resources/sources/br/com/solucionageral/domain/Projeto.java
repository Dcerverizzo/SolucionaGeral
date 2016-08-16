package br.com.solucionageral.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Projeto extends GenericDomain {

	@Column(length = 50, nullable = false)
	private String nomeProjeto;

	@Column(length = 100, nullable = false)
	private String descricaoProjeto;

	@Column(nullable = false, precision = 10, scale = 2)
	private Double valorProjeto;

	@Column(length = 10, nullable = false)
	private String statusProjeto;

	@Column(length = 2)
	private Integer avCliente;

	@Column(length = 2)
	private Integer avFreelancer;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Categoria categoria;

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getDescricaoProjeto() {
		return descricaoProjeto;
	}

	public void setDescricaoProjeto(String descricaoProjeto) {
		this.descricaoProjeto = descricaoProjeto;
	}

	public Double getValorProjeto() {
		return valorProjeto;
	}

	public void setValorProjeto(Double valorProjeto) {
		this.valorProjeto = valorProjeto;
	}

	public String getStatusProjeto() {
		return statusProjeto;
	}

	public void setStatusProjeto(String statusProjeto) {
		this.statusProjeto = statusProjeto;
	}

	public Integer getAvCliente() {
		return avCliente;
	}

	public void setAvCliente(Integer avCliente) {
		this.avCliente = avCliente;
	}

	public Integer getAvFreelancer() {
		return avFreelancer;
	}

	public void setAvFreelancer(Integer avFreelancer) {
		this.avFreelancer = avFreelancer;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
