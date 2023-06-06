package com.dekamilk.api.repository;



	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.dekamilk.api.model.Raca;

	



	@Repository
	public interface RacaRepository extends JpaRepository <Raca,Long> {

		Raca findById(long id_raca);
		
	}
