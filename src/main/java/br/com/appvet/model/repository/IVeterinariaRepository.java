package br.com.appvet.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.appvet.model.negocio.Veterinaria;

public interface IVeterinariaRepository extends CrudRepository<Veterinaria, Integer> {

}