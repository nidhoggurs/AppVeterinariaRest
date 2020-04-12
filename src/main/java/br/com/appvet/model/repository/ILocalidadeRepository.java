package br.com.appvet.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.appvet.model.negocio.Localidade;

public interface ILocalidadeRepository extends CrudRepository<Localidade, Integer> {

}