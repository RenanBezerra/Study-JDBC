package com.b3.JDBC.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Service;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Service
public class ConnectionFactory {

	public DataSource dataSource;

	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword(".53524893Renan");

		comboPooledDataSource.setMaxPoolSize(30);
		this.dataSource = comboPooledDataSource;
	}

	public Connection recuperarConexao() throws SQLException {
		return this.dataSource.getConnection();
	}
}
