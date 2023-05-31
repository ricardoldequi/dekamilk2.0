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
	@Table(name = "classificacao_bovina")
	public class ClassificacaoBovina {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_classificacao;
		
		@Column(nullable = false)
		private String nome;
		
		@Column
		    private  String sexo;
	}
		