package br.com.appvet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appvet.model.negocio.Medicina;
import br.com.appvet.model.repository.IMedicinaRepository;

@Service
public class MedicinaService {
	
	@Autowired
	private IMedicinaRepository repository;

	public List<Medicina> obterLista(){
		return (List<Medicina>)repository.findAll();
	}
	
	public Optional<Medicina> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Medicina medicina) {
		repository.save(medicina);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IMedicinaRepository getRepository() {
		return repository;
	}
	public void setRepository(IMedicinaRepository repository) {
		this.repository = repository;
	}
}