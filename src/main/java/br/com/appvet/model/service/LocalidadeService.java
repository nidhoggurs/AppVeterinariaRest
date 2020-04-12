package br.com.appvet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appvet.model.negocio.Localidade;
import br.com.appvet.model.repository.ILocalidadeRepository;

@Service
public class LocalidadeService {
	
	@Autowired
	private ILocalidadeRepository repository;

	public List<Localidade> obterLista(){
		return (List<Localidade>)repository.findAll();
	}
	
	public Optional<Localidade> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Localidade localidade) {
		repository.save(localidade);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public ILocalidadeRepository getRepository() {
		return repository;
	}
	public void setRepository(ILocalidadeRepository repository) {
		this.repository = repository;
	}
}