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

import com.dekamilk.api.model.LancamentoSaida;
import com.dekamilk.api.repository.LancamentoSaidaRepository;


@RestController
@RequestMapping("/saida")
public class LancamentoSaidaController {
	
	@Autowired
	LancamentoSaidaRepository lancSaidaRepository;
	@GetMapping("/lancamentosSaida")
	public List<LancamentoSaida> listarTudo(){
		return lancSaidaRepository.findAll();
		
	}
	@GetMapping("/lancamento_saida/{id_saida}")
	public LancamentoSaida listalancSaidaUnico(@PathVariable(value = "id_entrada") long id_saida){
		
		return lancSaidaRepository.findById(id_saida);
		
	}
	@PostMapping("/lancamento_saida")
	public LancamentoSaida salvalancSaida (@RequestBody LancamentoSaida saida) {
		return lancSaidaRepository.save(saida);
		
	}
	@DeleteMapping("/lancamento_saida")
	public void DeletalancSaida (@RequestBody LancamentoSaida saida) {
		lancSaidaRepository.delete(saida);
		
	}
	@PutMapping("/lancamento_saida")
	public LancamentoSaida alteralancSaida (@RequestBody LancamentoSaida saida) {
		return lancSaidaRepository.save(saida);
		
	}
}