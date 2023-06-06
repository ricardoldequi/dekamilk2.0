package br.com.dekamilk.backdekamilk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Fornecedor")
public class Fornecedor {

@Id
@GeneratedValue  (strategy = GenerationType.AUTO)
private Long id_fornecedor;

@Column (nullable = false)
private String nome;
@Column 
private String cpf;
@Column 
private String cnpj;
@Column 
private String endereco;

@Column (nullable = false)
private String cidade;

@Column (nullable = false)
private String bairro;

@Column (nullable = false)
private String uf;

@Column (nullable = false)
private String telefone;

@Column (nullable = false)
private String telefone_fixo;

@Column (nullable = false)
private String email;

public Long getId_fornecedor() {
	return id_fornecedor;
}

public void setId_fornecedor(Long id_fornecedor) {
	this.id_fornecedor = id_fornecedor;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

public String getUf() {
	return uf;
}

public void setUf(String uf) {
	this.uf = uf;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getTelefone_fixo() {
	return telefone_fixo;
}

public void setTelefone_fixo(String telefone_fixo) {
	this.telefone_fixo = telefone_fixo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}








	
}
