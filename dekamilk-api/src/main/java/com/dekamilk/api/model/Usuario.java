package com.dekamilk.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


	@Entity
	@Data
	@Table(name = "usuario")
	public class Usuario {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id_usuario;
		
		@Column(nullable = false)
		private String nome_usuario;
		
		@Column(nullable = false)
		private String senha_usuario;	
		
		@Column(nullable = false)
		private String cpf;	
		
		@Column(nullable = false)
		private String email;	
		
		@ManyToOne (optional = false)
		@JoinColumn(name = "funcao", referencedColumnName ="id_funcao")
		private Funcao funcao;
		
		@Column(nullable = false)
		private String telefone;	
	}