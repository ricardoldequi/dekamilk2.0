package com.dekamilk.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dekamilk.api.model.Fornecedor;
import com.dekamilk.api.repository.FornecedorRepository;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

	
	@Autowired
	FornecedorRepository fornecedorRepository;
	@GetMapping("/fornecedores")
	public List<Fornecedor> listarTudo(){
		
		return fornecedorRepository.findAll();
		
	}
	
}
