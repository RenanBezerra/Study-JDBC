package com.b3.JDBC.Mains;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.b3.JDBC.DAO.CategoriaDAO;
import com.b3.JDBC.DAO.ProdutoDAO;
import com.b3.JDBC.connection.ConnectionFactory;
import com.b3.JDBC.model.Categoria;
import com.b3.JDBC.model.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategorias = categoriaDAO.listar();
			listaDeCategorias.stream().forEach(ct -> {
				System.out.println(ct.getNome());
				try {
					for (Produto produto : new ProdutoDAO(connection).buscar(ct)) {
						System.out.println(ct.getNome() + " - " + produto.getNome());
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
			});
		}

	}
}
