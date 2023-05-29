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
@RequestMapping("/entrada")
public class LancamentoEntradaController {
	@Autowired
	LancamentoEntradaRepository lancEntradaRepository;
	@GetMapping("/lancEntrada")
	public List<LancamentoEntrada> listarTudo(){
		return lancEntradaRepository.findAll();
		
	}
	@GetMapping("/lancamento_entrada/{id_entrada}")
	public LancamentoEntrada listaLancEntrada(@PathVariable(value = "id_entrada") long id_entrada){
		
		return lancEntradaRepository.findById(id_entrada);
		
	}
	@PostMapping("/lancamento_entrada")
	public LancamentoEntrada salvalancEntrada (@RequestBody LancamentoEntrada entrada) {
		return lancEntradaRepository.save(entrada);
		
	}
	@DeleteMapping("/lancamento_entrada")
	public void DeletalancEntrada (@RequestBody LancamentoEntrada entrada) {
		lancEntradaRepository.delete(entrada);
		
	}
	@PutMapping("/lancamento_entrada")
	public LancamentoEntrada alteralancEntrada (@RequestBody LancamentoEntrada entrada) {
		return lancEntradaRepository.save(entrada);
		
	}
}
