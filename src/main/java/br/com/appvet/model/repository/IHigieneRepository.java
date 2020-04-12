package br.com.appvet.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.appvet.model.negocio.Higiene;

public interface IHigieneRepository extends CrudRepository<Higiene, Integer> {

}