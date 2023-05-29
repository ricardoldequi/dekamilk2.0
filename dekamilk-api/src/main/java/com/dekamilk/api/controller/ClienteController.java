
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

import com.dekamilk.api.model.Cliente;
import com.dekamilk.api.repository.ClienteRepository;


	@RestController
	@RequestMapping("/cliente")
	public class ClienteController {
		
		@Autowired
		ClienteRepository clienteRepository;
		@GetMapping("/clientes")
		public List<Cliente> listarTudo(){
			return clienteRepository.findAll();

			
		}
		@GetMapping("/cliente/{id_cliente}")
		public Cliente listaClienteUnico(@PathVariable(value = "id_cliente") long id_cliente){
			
			return clienteRepository.findById(id_cliente);
			
		}
		@PostMapping("/cliente")
		public Cliente salvaCliente (@RequestBody Cliente cliente) {
			return clienteRepository.save(cliente);
			
		}
		@DeleteMapping("/cliente")
		public void deletaCliente (@RequestBody Cliente cliente) {
			 clienteRepository.delete(cliente);
			
		}
		@PutMapping("/cliente")
		public Cliente alteracliente (@RequestBody Cliente cliente) {
			return clienteRepository.save(cliente);
			
		}
		

	}


