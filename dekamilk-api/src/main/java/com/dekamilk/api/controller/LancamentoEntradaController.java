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

import com.dekamilk.api.model.LancamentoEntrada;
import com.dekamilk.api.repository.LancamentoEntradaRepository;

@RestController
@RequestMapping("/entradas")
public class LancamentoEntradaController {
	@Autowired
	LancamentoEntradaRepository lancEntradaRepository;
	
	@GetMapping
	public List<LancamentoEntrada> listarTudo(){
		return lancEntradaRepository.findAll();
		
	
	}
	@GetMapping("/{id_entrada}")
	public LancamentoEntrada listaLancEntrada(@PathVariable(value = "id_entrada") long id_entrada){
		
		return lancEntradaRepository.findById(id_entrada);
		
	}
	@PostMapping
	public LancamentoEntrada salvalancEntrada (@RequestBody LancamentoEntrada entrada) {
		return lancEntradaRepository.save(entrada);
		
	}
	@DeleteMapping
	public void DeletalancEntrada (@RequestBody LancamentoEntrada entrada) {
		lancEntradaRepository.delete(entrada);
		
	}
	@PutMapping("/{id_entrada}")
	public LancamentoEntrada alteralancEntrada (@RequestBody LancamentoEntrada entrada) {
		return lancEntradaRepository.save(entrada);
		
	}
}
