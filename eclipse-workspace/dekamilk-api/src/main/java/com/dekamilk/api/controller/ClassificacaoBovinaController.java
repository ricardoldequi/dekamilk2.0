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

import com.dekamilk.api.model.ClassificacaoBovina;
import com.dekamilk.api.repository.ClassificacaoBovinaRepository;



@RestController
@RequestMapping("/classificacoes")
public class ClassificacaoBovinaController {

	
	@Autowired
	ClassificacaoBovinaRepository classificacaoRepository;
	@GetMapping
	public List<ClassificacaoBovina> listarTudo(){
		return classificacaoRepository.findAll();
		
	}
	@GetMapping("/{id_classificacao}")
	public ClassificacaoBovina listaClassificacaoUnica(@PathVariable(value = "id_classificacao") long id_classificacao){
		
		return classificacaoRepository.findById(id_classificacao);
		
	}
	@PostMapping
	public ClassificacaoBovina salvaClassificacao (@RequestBody ClassificacaoBovina classificacao) {
		return classificacaoRepository.save(classificacao);
		
	}
	@DeleteMapping
	public void DeletaClassificacao (@RequestBody ClassificacaoBovina classificacao) {
		classificacaoRepository.delete(classificacao);
		
	}
	@PutMapping("/{id_classificacao}")
	public ClassificacaoBovina alteraClassificacaor (@RequestBody ClassificacaoBovina classificacao) {
		return classificacaoRepository.save(classificacao);
		
	}
	


}
