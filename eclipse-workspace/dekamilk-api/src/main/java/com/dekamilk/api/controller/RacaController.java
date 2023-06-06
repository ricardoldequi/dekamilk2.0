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

import com.dekamilk.api.model.Raca;

import com.dekamilk.api.repository.RacaRepository;





	@RestController
	@RequestMapping("/racas")
	public class RacaController {
		@Autowired
		RacaRepository racaRepository;
		@GetMapping
		public List<Raca> listarTudo(){
			return racaRepository.findAll();
			
		}
		@GetMapping("/{id_raca}")
		public Raca listaRacaUnico(@PathVariable(value = "id_raca") long id_raca){
			
			return racaRepository.findById(id_raca);
			
		}
		@PostMapping
		public Raca salvaRaca(@RequestBody Raca raca) {
			return racaRepository.save(raca);
			
		}
		@DeleteMapping
		public void deletaRaca (@RequestBody Raca raca) {
			racaRepository.delete(raca);
			
		}
		@PutMapping("/{id_raca}")
		public Raca alteraRaca (@RequestBody Raca raca) {
			return racaRepository.save(raca);
		}
		}