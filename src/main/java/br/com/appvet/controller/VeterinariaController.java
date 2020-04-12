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

import br.com.appvet.model.negocio.Veterinaria;
import br.com.appvet.model.service.VeterinariaService;

@RestController
@RequestMapping("/api/veterinaria")
public class VeterinariaController {

	@Autowired
	private VeterinariaService service;
	
	@RequestMapping
	public List<Veterinaria> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Veterinaria> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Veterinaria veterinaria) {
		service.incluir(veterinaria);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public VeterinariaService getService() {
		return service;
	}
	public void setService(VeterinariaService service) {
		this.service = service;
	}
}