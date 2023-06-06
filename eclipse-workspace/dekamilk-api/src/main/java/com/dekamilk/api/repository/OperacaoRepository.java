package com.dekamilk.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dekamilk.api.model.Operacao;


	@Repository
	public interface OperacaoRepository extends JpaRepository <Operacao,Long> {

		Operacao findById(long id_operacao);
		
	
	
}
