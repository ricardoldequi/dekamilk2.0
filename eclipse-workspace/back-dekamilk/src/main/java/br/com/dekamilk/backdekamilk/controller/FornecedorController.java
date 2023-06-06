package br.com.dekamilk.backdekamilk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import br.com.dekamilk.backdekamilk.repository.FornecedorRepository;
import  br.com.dekamilk.backdekamilk.model.Fornecedor;


@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
	
	@Autowired
   FornecedorRepository fornecedorRepository;
	
@GetMapping("/listafornecedor")
	public List<Fornecedor> listar() {
	return fornecedorRepository.findAll();

	}

}
