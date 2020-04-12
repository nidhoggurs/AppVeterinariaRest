package br.com.appvet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appvet.model.negocio.Higiene;
import br.com.appvet.model.repository.IHigieneRepository;

@Service
public class HigieneService {
	
	@Autowired
	private IHigieneRepository repository;

	public List<Higiene> obterLista(){
		return (List<Higiene>)repository.findAll();
	}
	
	public Optional<Higiene> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Higiene higiene) {
		repository.save(higiene);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IHigieneRepository getRepository() {
		return repository;
	}
	public void setRepository(IHigieneRepository repository) {
		this.repository = repository;
	}
}