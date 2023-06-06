package com.dekamilk.api.model;

import java.math.BigDecimal;
import java.sql.Date;

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
	@Table(name = "preco_unitario_litro")
	public class PrecoUnitarioLitro {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id_preco_unitario;
		
		@Column(nullable = false)
		private BigDecimal valor_unitario;
		
	    @Column(nullable = false)
		private Date data_recebida;
		

		@ManyToOne (optional = false)
		@JoinColumn(name = "cliente", referencedColumnName ="id_cliente")
		private Cliente cliente;
	}



