package br.com.dekamilk.dekamilk.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;


@Entity
public class ItemEstoque {
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Short id_item;
	
	@Column(length=60, nullable=false )
	private String nome;
	
	@Column(length=14, unique=true)
	private Double quantidade;
	// pode ser usado precision (total de digitos) e scale(digitos depois da virgula)
	
	@Column
	private LocalDateTime dt_saldo;
	
	@Column
	private String grupo_item;

	
	public Short getId_item() {
		return id_item;
	}


	public void setId_item(Short id_item) {
		this.id_item = id_item;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}


	public LocalDateTime getDt_saldo() {
		return dt_saldo;
	}


	public void setDt_saldo(LocalDateTime dt_saldo) {
		this.dt_saldo = dt_saldo;
	}


	public String getGrupo_item() {
		return grupo_item;
	}


	public void setGrupo_item(String grupo_item) {
		this.grupo_item = grupo_item;
	}


	public ItemEstoque(Short id_item, String nome, Double quantidade, LocalDateTime dt_saldo, String grupo_item) {
		super();
		this.id_item = id_item;
		this.nome = nome;
		this.quantidade = quantidade;
		this.dt_saldo = dt_saldo;
		this.grupo_item = grupo_item;
	}


	}
	



