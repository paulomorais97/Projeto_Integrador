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
import javax.validation.constraints.Size;

@Entity
@Table
public class Tb_Usuario {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id_usuario;
	
	@Column
	@NotNull
	private String nome_usuario;
	
	@Column
	@NotNull
	private String email_usuario;
	
	@Column
	@NotNull
	@Size(min =1, max =20)
	private String sexo_usuario;
	
	@Column
	@NotNull
	@Size(min =1, max =20)
	private String telefone_usuario;
	
	@Column
	@NotNull
	@Size(min =1, max =11)
	private long cpf_usuario;
	
	@Column
	@NotNull
	@Size(min =5, max =110)
	private String login_usuario;
	
	@Column
	@NotNull
	@Size(min =8)
	private String senha_usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_usuario = new java.sql.Date(System.currentTimeMillis());

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getSexo_usuario() {
		return sexo_usuario;
	}

	public void setSexo_usuario(String sexo_usuario) {
		this.sexo_usuario = sexo_usuario;
	}

	public String getTelefone_usuario() {
		return telefone_usuario;
	}

	public void setTelefone_usuario(String telefone_usuario) {
		this.telefone_usuario = telefone_usuario;
	}

	public long getCpf_usuario() {
		return cpf_usuario;
	}

	public void setCpf_usuario(long cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}

	public Date getData_usuario() {
		return data_usuario;
	}

	public void setData_usuario(Date data_usuario) {
		this.data_usuario = data_usuario;
	}

	public String getLogin_usuario() {
		return login_usuario;
	}

	public void setLogin_usuario(String login_usuario) {
		this.login_usuario = login_usuario;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	
	
}

