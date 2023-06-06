package com.dekamilk.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dekamilk.api.model.Fornecedor;
import com.dekamilk.api.repository.FornecedorRepository;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

	
	@Autowired
	FornecedorRepository fornecedorRepository;
	@GetMapping
	public List<Fornecedor> listarTudo(){
		return fornecedorRepository.findAll();
		
	}
	@GetMapping("/{id_fornecedor}")
	public Fornecedor listaFornecedorUnico(@PathVariable(value = "id_fornecedor") long id_fornecedor){
		
		return fornecedorRepository.findById(id_fornecedor);
		
	}
	@PostMapping
	public Fornecedor salvaFornecedor (@RequestBody Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
		
	}
	@DeleteMapping
	public void DeletaFornecedor (@RequestBody Fornecedor fornecedor) {
		 fornecedorRepository.delete(fornecedor);
		
	}
	@PutMapping("/{id_fornecedor}")
	public Fornecedor alteraFornecedor (@RequestBody Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
		
	}
	

}
