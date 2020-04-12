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

import br.com.appvet.model.negocio.Medicina;
import br.com.appvet.model.service.MedicinaService;

@RestController
@RequestMapping("/api/medicina")
public class MedicinaController {

	@Autowired
	private MedicinaService service;
	
	@RequestMapping
	public List<Medicina> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Medicina> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Medicina medicina) {
		service.incluir(medicina);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public MedicinaService getService() {
		return service;
	}
	public void setService(MedicinaService service) {
		this.service = service;
	}
}