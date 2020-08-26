package com.b3.JDBC.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws Exception {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", ".53524893Renan");

		Statement stm =connection.createStatement();
		
		stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		ResultSet rst = stm.getResultSet();
		
		while (rst.next()) {

			Integer id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			System.out.println(id);
			System.out.println(nome);
			System.out.println(descricao);
			
		}
		
		
	}

}
