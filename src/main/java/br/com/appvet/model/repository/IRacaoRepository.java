package br.com.appvet.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.appvet.model.negocio.Racao;

public interface IRacaoRepository extends CrudRepository<Racao, Integer> {

}