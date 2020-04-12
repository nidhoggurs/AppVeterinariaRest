package br.com.appvet.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.appvet.model.negocio.Medicina
;
public interface IMedicinaRepository extends CrudRepository<Medicina, Integer> {

}