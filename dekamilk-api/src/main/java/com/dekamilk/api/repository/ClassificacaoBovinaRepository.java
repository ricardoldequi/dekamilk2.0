package com.dekamilk.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dekamilk.api.model.ClassificacaoBovina;




	@Repository
	public interface ClassificacaoBovinaRepository extends JpaRepository <ClassificacaoBovina,Long> {

		ClassificacaoBovina findById(long id_classificacao);
		
	}
