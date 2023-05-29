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

import com.dekamilk.api.model.Operacao;
import com.dekamilk.api.repository.OperacaoRepository;

@RestController
@RequestMapping("/operacao")
public class OperacaoController {
	@Autowired
	OperacaoRepository operacaoRepository;
	@GetMapping("/operacoes")
	public List<Operacao> listarTudo(){
		return operacaoRepository.findAll();
		
	}
	@GetMapping("/operacao/{id_operacao}")
	public Operacao listaOperacaoUnica(@PathVariable(value = "id_operacao") long id_operacao){
		
		return operacaoRepository.findById(id_operacao);
		
	}
	@PostMapping("/operacao")
	public Operacao salvaOperacao (@RequestBody Operacao operacao) {
		return operacaoRepository.save(operacao);
		
	}
	@DeleteMapping("/operacao")
	public void deletaOperacao (@RequestBody Operacao operacao) {
		operacaoRepository.delete(operacao);
		
	}
	@PutMapping("/operacao")
	public Operacao alteraOperacao (@RequestBody Operacao operacao) {
		return operacaoRepository.save(operacao);
		
	}
}
