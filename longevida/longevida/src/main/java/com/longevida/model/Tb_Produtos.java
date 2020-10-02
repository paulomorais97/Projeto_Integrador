package com.longevida.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table
public class Tb_Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id_produto;
	
	@Column
	private String nome_produto;
	
	@Column
	private int quantidade_produto;

	@Column
	@Size(min=5,max=500)
	private String descricao_produto;

	@Column
	private double preco_produto;
	
	//FAZER FK ID_CATEGORIA 

	public long getId_produto() {
		return id_produto;
	}

	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public double getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(double preco_produto) {
		this.preco_produto = preco_produto;
	}
	
	


}
