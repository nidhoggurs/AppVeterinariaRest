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

import br.com.appvet.model.negocio.Higiene;
import br.com.appvet.model.service.HigieneService;

@RestController
@RequestMapping("/api/higiene")
public class HigieneController {

	@Autowired
	private HigieneService service;
	
	@RequestMapping
	public List<Higiene> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Higiene> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Higiene higiene) {
		service.incluir(higiene);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public HigieneService getService() {
		return service;
	}
	public void setService(HigieneService service) {
		this.service = service;
	}
}