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

import com.dekamilk.api.model.Usuario;
import com.dekamilk.api.repository.UsuarioRepository;



	@RestController
	@RequestMapping("/usuarios")
	public class UsuarioController {
		@Autowired
		UsuarioRepository usuarioRepository;
		@GetMapping
		public List<Usuario> listarTudo(){
			return usuarioRepository.findAll();
			
		}
		@GetMapping("/{id_usuario}")
		public Usuario listaUsuarioUnico(@PathVariable(value = "id_usuario") long id_usuario){
			
			return usuarioRepository.findById(id_usuario);
			
		}
		@PostMapping
		public Usuario salvaUsuario (@RequestBody Usuario usuario) {
			return usuarioRepository.save(usuario);
			
		}
		@DeleteMapping
		public void deletaUsuario (@RequestBody Usuario usuario) {
			usuarioRepository.delete(usuario);
			
		}
		@PutMapping("/{id_usuario}")
		public Usuario alteraUsuario (@RequestBody Usuario usuario) {
			return usuarioRepository.save(usuario);
		}
		}