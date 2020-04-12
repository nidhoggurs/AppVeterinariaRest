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

import br.com.appvet.model.negocio.Racao;
import br.com.appvet.model.service.RacaoService;

@RestController
@RequestMapping("/api/racao")
public class RacaoController {

	@Autowired
	private RacaoService service;
	
	@RequestMapping
	public List<Racao> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Racao> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Racao racao) {
		service.incluir(racao);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public RacaoService getService() {
		return service;
	}
	public void setService(RacaoService service) {
		this.service = service;
	}
}