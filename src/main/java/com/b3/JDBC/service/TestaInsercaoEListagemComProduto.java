package com.b3.JDBC.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.b3.JDBC.DAO.ProdutoDAO;
import com.b3.JDBC.connection.ConnectionFactory;
import com.b3.JDBC.model.Produto;

public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {
		Produto comoda = new Produto("Comoda", "Comoda Vertical");

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(connection);

			produtoDAO.salvar(comoda);
			List<Produto> listaDeProdutos = produtoDAO.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
		System.out.println(comoda);
	}

}
