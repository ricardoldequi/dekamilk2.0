
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
	@Table(name = "Operacao")
	public class Operacao {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id_operacao;
		
		@Column(nullable = false)
		private String descricao;
		
	    @Column
	    private  String tipo;
	    
		
		
	}


