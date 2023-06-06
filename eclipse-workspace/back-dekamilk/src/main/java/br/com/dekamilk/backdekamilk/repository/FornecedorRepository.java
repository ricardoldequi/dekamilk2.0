package br.com.dekamilk.backdekamilk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dekamilk.backdekamilk.model.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	
	Fornecedor findById_fornecedor(Long id_fornecedor);
}
