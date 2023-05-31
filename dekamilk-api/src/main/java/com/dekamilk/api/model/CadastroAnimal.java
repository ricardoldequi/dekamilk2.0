package com.dekamilk.api.model;





	import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
	import lombok.Data;

	@Entity
	@Data
	@Table(name = "cadastro_animal")
	public class CadastroAnimal {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_animal;
		
		@ManyToOne (optional = false)
		@JoinColumn(name = "id_classificacao", referencedColumnName =  "id_classificacao")
		private ClassificacaoBovina id_classificacao;
		
	    @ManyToOne (optional = false)
		@JoinColumn(name = "id_raca", referencedColumnName =  "id_raca")
		private Raca id_raca;
		
		@Column(nullable = false)
		private int numero_brinco;
		
		@Column(nullable = false)
		private String nome;

		@Column
		private String nome_pai;

		@Column
		private String nome_mae;

		@Column
		private boolean inseminada;

		@Column
		private String lactante;

		@Column
		private int numero_crias;

		@Column
		private BigDecimal peso;

		@Column
		private String sexo;

		@Column
		private Date data_cria;

	
		
	

}
