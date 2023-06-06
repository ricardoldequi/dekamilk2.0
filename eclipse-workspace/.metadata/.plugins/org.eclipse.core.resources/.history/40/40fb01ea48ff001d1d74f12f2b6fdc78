package com.dekamilk.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



	@Entity
	@Data
	@Table(name = "funcao")
	public class Funcao {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id_funcao;
		
		@Column(nullable = false)
		private String nome;	
		
	}
