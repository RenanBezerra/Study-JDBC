package com.b3.JDBC.model;

import lombok.Data;

@Data
public class Categoria {

	private Integer id;
	private String nome;
	
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	
}
