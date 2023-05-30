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
	@Table(name = "raca")
	public class Raca {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id_raca;
		
		@Column(nullable = false)
		private String nome;
		
		
	}