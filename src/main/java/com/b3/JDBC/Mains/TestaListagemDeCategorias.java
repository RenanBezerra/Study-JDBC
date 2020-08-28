package com.b3.JDBC.Mains;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.b3.JDBC.DAO.CategoriaDAO;
import com.b3.JDBC.connection.ConnectionFactory;
import com.b3.JDBC.model.Categoria;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategorias = categoriaDAO.listar();
			listaDeCategorias.stream().forEach(ct -> System.out.println(ct.getNome()));
		}
		
		
	}
}
