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
@Table(name = "Fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_fornecedor;
	
	@Column(nullable = false)
	private String nome;
	
	@Column
	private String cpf;

	@Column
	private String cep;

	@Column
	private String cnpj;

	@Column
	private String endereco;

	@Column
	private String cidade;

	@Column
	private String bairro;

	@Column
	private String uf;

	@Column
	private String telefone;

	@Column
	private String telefone_fixo;
	
	@Column
	private String email;

	
	
}
