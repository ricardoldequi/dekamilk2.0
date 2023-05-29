package com.dekamilk.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dekamilk.api.model.PrecoUnitarioLitro;




	@Repository
	public interface PrecoUnitarioLitroRepository extends JpaRepository <PrecoUnitarioLitro,Long> {

		PrecoUnitarioLitro findById(long id_preco_unitario);
		
	
	
}