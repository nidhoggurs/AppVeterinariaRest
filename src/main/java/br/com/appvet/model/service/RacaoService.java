package br.com.appvet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appvet.model.negocio.Racao;
import br.com.appvet.model.repository.IRacaoRepository;

@Service
public class RacaoService {
	
	@Autowired
	private IRacaoRepository repository;

	public List<Racao> obterLista(){
		return (List<Racao>)repository.findAll();
	}
	
	public Optional<Racao> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Racao racao) {
		repository.save(racao);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IRacaoRepository getRepository() {
		return repository;
	}
	public void setRepository(IRacaoRepository repository) {
		this.repository = repository;
	}
}