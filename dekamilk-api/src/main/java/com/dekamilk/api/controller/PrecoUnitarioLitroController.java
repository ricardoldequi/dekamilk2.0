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

import com.dekamilk.api.model.PrecoUnitarioLitro;
import com.dekamilk.api.repository.PrecoUnitarioLitroRepository;


	@RestController
	@RequestMapping("/preco")
	public class PrecoUnitarioLitroController {
		@Autowired
		PrecoUnitarioLitroRepository precoUnitRepository;
		@GetMapping("/precoUnitario")
		public List<PrecoUnitarioLitro> listarTudo(){
			return precoUnitRepository.findAll();
			
		}
		@GetMapping("/precoUnitario/{id_preco_unitario}")
		public PrecoUnitarioLitro listaOperacaoUnica(@PathVariable(value = "id_preco_unitario") long id_preco_unitario){
			
			return precoUnitRepository.findById(id_preco_unitario);
			
		}
		@PostMapping("/precoUnitario")
		public PrecoUnitarioLitro salvaOperacao (@RequestBody PrecoUnitarioLitro precoUnitario) {
			return precoUnitRepository.save(precoUnitario);
			
		}
		@DeleteMapping("/precoUnitario")
		public void deletaOperacao (@RequestBody PrecoUnitarioLitro precoUnitario) {
			precoUnitRepository.delete(precoUnitario);
			
		}
		@PutMapping("/precoUnitario")
		public PrecoUnitarioLitro alteraOperacao (@RequestBody PrecoUnitarioLitro precoUnitario) {
			return precoUnitRepository.save(precoUnitario);
			
		}
	}