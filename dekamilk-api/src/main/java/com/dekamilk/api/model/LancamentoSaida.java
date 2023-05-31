package com.dekamilk.api.model;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "lancamento_saida")
public class LancamentoSaida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_saida;
	
	@ManyToOne (optional = false,fetch = FetchType.EAGER)
	@JoinColumn(name = "operacao_saida", referencedColumnName =  "id_operacao")
	private Operacao operacao_saida;
	
	@ManyToOne (optional = false,fetch = FetchType.EAGER)
	@JoinColumn(name = "fornecedor", referencedColumnName ="id_fornecedor")
	private Fornecedor fornecedor;
	
	@Column(nullable = false)
	private double valor_gasto;
	
	@Column(nullable = false)
    private String descricao_saida;
	
	@Column(nullable = false)
    private Date data_saida;
    
    
	
	
}
