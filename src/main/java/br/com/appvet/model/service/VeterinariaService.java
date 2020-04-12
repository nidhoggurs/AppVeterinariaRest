package br.com.appvet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appvet.model.negocio.Veterinaria;
import br.com.appvet.model.repository.IVeterinariaRepository;

@Service
public class VeterinariaService {
	
	@Autowired
	private IVeterinariaRepository repository;

	public List<Veterinaria> obterLista(){
		return (List<Veterinaria>)repository.findAll();
	}
	
	public Optional<Veterinaria> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Veterinaria veterinaria) {
		repository.save(veterinaria);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IVeterinariaRepository getRepository() {
		return repository;
	}
	public void setRepository(IVeterinariaRepository repository) {
		this.repository = repository;
	}
}