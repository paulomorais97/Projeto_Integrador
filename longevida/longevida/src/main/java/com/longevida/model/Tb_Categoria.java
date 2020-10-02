package com.longevida.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Tb_Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id_categoria;
	
	@Column
	private String categoria_nome;

	
	public long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getCategoria_nome() {
		return categoria_nome;
	}

	public void setCategoria_nome(String categoria_nome) {
		this.categoria_nome = categoria_nome;
	}
	

	
	
	
	
	
	
}
