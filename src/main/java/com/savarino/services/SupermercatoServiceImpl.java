package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Acquisto;
import com.savarino.entities.Cliente;
import com.savarino.entities.Prodotto;
import com.savarino.repo.AcquistoDAO;
import com.savarino.repo.ClienteDAO;
import com.savarino.repo.ProdottoDAO;

@Service
public class SupermercatoServiceImpl implements SupermercatoService {
	@Autowired
	private AcquistoDAO acquistoDAO;
	@Autowired
	private ProdottoDAO prodottoDAO;
	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public List<Cliente> getClienti() {
		// TODO Auto-generated method stub
		return clienteDAO.findAll();
	}

	@Override
	public List<Acquisto> getAcquisti() {
		// TODO Auto-generated method stub
		return acquistoDAO.findAll();
	}

	@Override
	public List<Prodotto> getProdotti() {
		// TODO Auto-generated method stub
		return prodottoDAO.findAll();
	}

	@Override
	public void addCliente(Cliente c) {
		// TODO Auto-generated method stub
		clienteDAO.save(c);
	}

	@Override
	public void addAcquisto(Acquisto a) {
		// TODO Auto-generated method stub
		acquistoDAO.save(a);
	}

	@Override
	public void addProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		prodottoDAO.save(p);
		
	}

}
