package br.com.dekamilk.backdekamilk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastrofornecedor")
public class CadastroFornecedorController {
	
	@RequestMapping("/mensagem")
	public String exibirmensagem() {
		
		return "ola mundo!";
	}
	

}
