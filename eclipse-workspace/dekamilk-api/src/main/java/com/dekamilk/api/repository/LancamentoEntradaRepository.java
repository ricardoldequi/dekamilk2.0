package com.dekamilk.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dekamilk.api.model.LancamentoEntrada;


@Repository
public interface LancamentoEntradaRepository extends JpaRepository <LancamentoEntrada,Long> {

	LancamentoEntrada findById(long id_entrada);

	
	
}
