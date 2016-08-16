package br.com.solucionageral.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.solucionageral.dao.CategoriaDAO;
import br.com.solucionageral.domain.Categoria;

@ManagedBean
@ViewScoped
public class CategoriaMB {

	private Categoria categoria;

	public void salvar() {
		try {
			CategoriaDAO categoriaDAO = new CategoriaDAO();
			categoriaDAO.salvar(categoria);
			Messages.addGlobalInfo("Cadastrado com sucesso");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar salvar a categoria");
			erro.printStackTrace();
		}
	}

	public Categoria getCategoria() {
		if (categoria == null) {
			categoria = new Categoria();
		}
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
