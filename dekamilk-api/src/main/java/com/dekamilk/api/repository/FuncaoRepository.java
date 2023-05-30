package com.dekamilk.api.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.dekamilk.api.model.Funcao;



	@Repository
	public interface FuncaoRepository extends JpaRepository <Funcao,Long> {

		Funcao findById(long id_funcao);


	}
