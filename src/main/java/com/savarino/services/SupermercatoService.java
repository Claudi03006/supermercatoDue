package com.savarino.services;

import java.util.List;

import com.savarino.entities.Acquisto;
import com.savarino.entities.Cliente;
import com.savarino.entities.Prodotto;

public interface SupermercatoService {
	
	 List<Cliente> getClienti();
	 List<Acquisto>getAcquisti();
	 List<Prodotto>getProdotti();
	 
	 void addCliente(Cliente c);
	 void addAcquisto(Acquisto a);
	 void addProdotto(Prodotto p);
	
	

}
