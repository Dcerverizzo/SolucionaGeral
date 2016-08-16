package br.com.solucionageral.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.solucionageral.domain.Categoria;

public class CategoriaDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Categoria categoria = new Categoria();
		categoria.setNomeCategoria("Limpeza de Pele");
		categoria.setDescricaoCategoria("Cera");

		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.salvar(categoria);
	}

	@Test
	public void listar() {
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		List<Categoria> resultado = categoriaDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Categoria categoria : resultado) {
			System.out.println(categoria.getCodigo() + " - " + categoria.getNomeCategoria() + " - " + categoria.getDescricaoCategoria());
		}
	}
}
