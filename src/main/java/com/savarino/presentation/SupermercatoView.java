package com.savarino.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class SupermercatoView {
	
	@GetMapping("/visualizzaClienti")
	public String showClienti() {
		return "index";
	}
	@GetMapping("/nuoviClienti")
	public String mostraNuovoCliente() {
	   return "aggiungiCliente";
	}
	@GetMapping("/nuoviProdotti")
	public String mostraNuovoProdotto() {
	   return "aggiungiProdotto";
	}
	@GetMapping("/nuoviAcquisti")
	public String mostranuovoAcquisto() {
		return "aggiungiAcquisto";
	}


}

