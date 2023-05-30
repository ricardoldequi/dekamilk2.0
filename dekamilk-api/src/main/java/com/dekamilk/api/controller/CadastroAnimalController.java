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

import com.dekamilk.api.model.CadastroAnimal;
import com.dekamilk.api.repository.CadastroAnimalRepository;


	@RestController
	@RequestMapping("/animais")
	public class CadastroAnimalController {
		@Autowired
		CadastroAnimalRepository animalRepository;
		@GetMapping
		public List<CadastroAnimal> listarTudo(){
			return animalRepository.findAll();
			
		}
		@GetMapping("/{id_animal}")
		public CadastroAnimal listaAnimalUnico(@PathVariable(value = "id_animal") long id_animal){
			
			return animalRepository.findById(id_animal);
			
		}
		@PostMapping
		public CadastroAnimal salvaAnimal (@RequestBody CadastroAnimal animal) {
			return animalRepository.save(animal);
			
		}
		@DeleteMapping
		public void deletaAnimal (@RequestBody CadastroAnimal animal) {
			animalRepository.delete(animal);
			
		}
		@PutMapping("/{id_animal}")
		public CadastroAnimal alteraAnimal (@RequestBody CadastroAnimal animal) {
			return animalRepository.save(animal);
		}
		}