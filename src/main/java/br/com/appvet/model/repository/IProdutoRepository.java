package br.com.appvet.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.appvet.model.negocio.Produto;

public interface IProdutoRepository extends CrudRepository<Produto, Integer> {

}