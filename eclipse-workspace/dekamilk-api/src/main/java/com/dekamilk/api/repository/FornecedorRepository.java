package com.dekamilk.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dekamilk.api.model.Fornecedor;


@Repository
public interface FornecedorRepository extends JpaRepository <Fornecedor,Long> {

	Fornecedor findById(long id_fornecedor);
	
}
