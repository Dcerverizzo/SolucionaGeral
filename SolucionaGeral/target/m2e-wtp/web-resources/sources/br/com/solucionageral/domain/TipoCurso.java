package br.com.solucionageral.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class TipoCurso extends GenericDomain {
	
	@Column(length=30, nullable = false)
	private String tipoCurso;

	public String getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
}
