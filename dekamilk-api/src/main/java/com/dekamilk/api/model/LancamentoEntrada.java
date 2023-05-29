package com.dekamilk.api.model;


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
@Table(name = "LancamentoEntrada")
public class LancamentoEntrada {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_entrada;
	
	@ManyToOne (optional = false)
	@JoinColumn(name = "operacao_entrada", referencedColumnName =  "id_operacao")
	private Operacao operacao_entrada;
	
	@ManyToOne (optional = false)
	@JoinColumn(name = "cleinte_entrada", referencedColumnName ="id_cliente")
	private Cliente cleinte_entrada;
	
	@Column(nullable = false)
	private double valor_recebido;
	
	@Column(nullable = false)
    private String descricao_entrada;
    

	@Column(nullable = false)
    private Date data_entrada;
	
}

