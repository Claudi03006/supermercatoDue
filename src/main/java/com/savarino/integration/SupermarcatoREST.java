package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Acquisto;
import com.savarino.entities.Cliente;
import com.savarino.entities.Prodotto;
import com.savarino.services.SupermercatoService;

@RestController
@RequestMapping("api")
public class SupermarcatoREST {
	
	@Autowired
	private SupermercatoService supermercatoService;
	
	@GetMapping("clienti")
	public List<Cliente>getAllClienti(){
		return supermercatoService.getClienti();
	}
	@GetMapping("prodotti")
	public List<Prodotto>getAllProdotti(){
		return supermercatoService.getProdotti();	}
	@GetMapping("acquisti")
	public List<Acquisto>getAllAcquisti(){
		return supermercatoService.getAcquisti();
	}
	@PostMapping(value = "addCliente",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>addCliente(@ModelAttribute Cliente cliente){
		supermercatoService.addCliente(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body("cliente aggiunto con successo");
	}
	@PostMapping(value = "addProdotto",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>addProdotto(@ModelAttribute Prodotto prodotto){
		supermercatoService.addProdotto(prodotto);
		return ResponseEntity.status(HttpStatus.CREATED).body("prodotto aggiunto con successo");
	}
	@PostMapping(value = "addAcquisto",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>addAcquisto(@ModelAttribute Acquisto acquisto){
		supermercatoService.addAcquisto(acquisto);
		return ResponseEntity.status(HttpStatus.CREATED).body("acquisto aggiunto con successo");
	}
	
}
