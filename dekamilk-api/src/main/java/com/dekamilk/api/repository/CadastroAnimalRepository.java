package com.dekamilk.api.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dekamilk.api.model.CadastroAnimal;





	@Repository
	public interface CadastroAnimalRepository extends JpaRepository <CadastroAnimal,Long> {

		CadastroAnimal findById(long id_animal);
		
	}
