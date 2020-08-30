package com.b3.JDBC.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Categoria {

	private Integer id;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;

	}

	public void adicionar(Produto produto) {

		produtos.add(produto);
	}

}
