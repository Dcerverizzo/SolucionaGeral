package br.com.solucionageral.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Curso extends GenericDomain {
	@Column(length = 30, nullable = false)
	private String nomeCurso;

	@Column(length = 5, nullable = false)
	private String cargaHoraria;

	@Column(length = 30, nullable = false)
	private String local;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Freelancer freelancer;

	@ManyToOne
	@JoinColumn(nullable = false)
	private TipoCurso tipoCurso;

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public TipoCurso getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TipoCurso tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	
}
