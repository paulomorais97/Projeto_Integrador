package com.longevida.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

	@Id
	@Column(name = "id_produto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name_produto")
	@NotNull
	private String nameProduto;

	@Column(name = "quantidade_produto")
	private int quantidadeProduto;

	@Column(name = "descricao_produto")
	@Size(min = 5, max = 500)
	private String descricaoProduto;

	@Column(name = "preco_produto")
	private double precoProduto;

	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameProduto() {
		return nameProduto;
	}

	public void setNameProduto(String nameProduto) {
		this.nameProduto = nameProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
