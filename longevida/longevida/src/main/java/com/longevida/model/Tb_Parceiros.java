package com.longevida.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Tb_Parceiros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id_parceiros;
	
	@Column
	@NotNull
	private String nome_usuario;
	
	@Column
	@NotNull
	private long cnpj_parceiro;
	
	@Column
	@NotNull
	private String dados_bancarios;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_parceiro = new java.sql.Date(System.currentTimeMillis());
}
