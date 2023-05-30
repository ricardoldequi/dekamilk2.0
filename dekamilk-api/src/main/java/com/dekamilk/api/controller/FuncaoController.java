
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

import com.dekamilk.api.model.Funcao;
import com.dekamilk.api.repository.FuncaoRepository;

	@RestController
	@RequestMapping("/funcoes")
	public class FuncaoController {
		@Autowired
		FuncaoRepository funcaoRepository;
		
		@GetMapping
		public List<Funcao> listarTudo(){
			return funcaoRepository.findAll();
			
		}
		@GetMapping("/{id_funcao}")
		public Funcao listaFuncaoUnica(@PathVariable(value = "id_funcao") long id_funcao){
			
			return funcaoRepository.findById(id_funcao);
			
		}
		@PostMapping
		public Funcao salvaFuncao (@RequestBody Funcao funcao) {
			return funcaoRepository.save(funcao);
			
		}
		@DeleteMapping
		public void deletaFuncao (@RequestBody Funcao funcao) {
			funcaoRepository.delete(funcao);
			
		}
		@PutMapping("/{id_funcao}")
		public Funcao alteralaFuncao (@RequestBody Funcao funcao) {
			return funcaoRepository.save(funcao);
			
		}
	}
