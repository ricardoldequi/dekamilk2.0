package com.dekamilk.api.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	
import com.dekamilk.api.model.Usuario;


	@Repository
	public interface UsuarioRepository extends JpaRepository <Usuario,Long> {

		Usuario findById(long id_usuario);
		
	}
