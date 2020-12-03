package com.longevida.model;

import java.util.Date;

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
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome_usuario")
	@NotNull
	private String nome;

	@Column(name = "email_usuario")
	@NotNull
	private String email;

	@Column(name = "sexo_usuario")
	@NotNull
	@Size(min = 1, max = 20)
	private String sexo;

	@Column(name = "telefone_usuario")
	@NotNull
	@Size(min = 1, max = 20)
	private String telefone;

	@Column(name = "cpf_usuario")
	@NotNull
	private Long cpf;

	@Column(name = "login_usuario")
	@NotNull
	@Size(min = 5, max = 110)
	private String usuario;

	@Column(name = "senha_usuario")
	@NotNull
	@Size(min = 8)
	private String senha;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data_usuario = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getData_usuario() {
		return data_usuario;
	}

	public void setData_usuario(Date data_usuario) {
		this.data_usuario = data_usuario;
	}

}