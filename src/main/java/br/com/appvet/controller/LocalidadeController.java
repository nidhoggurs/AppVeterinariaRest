package br.com.appvet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appvet.model.negocio.Localidade;
import br.com.appvet.model.service.LocalidadeService;

@RestController
@RequestMapping("/api/localidade")
public class LocalidadeController {

	@Autowired
	private LocalidadeService service;
	
	@RequestMapping
	public List<Localidade> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Localidade> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Localidade localidade) {
		service.incluir(localidade);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public LocalidadeService getService() {
		return service;
	}
	public void setService(LocalidadeService service) {
		this.service = service;
	}
}