package br.edu.infnet.posjava.tcc.cargatabelas.model.dao;

public interface Dao<T> {

	void salvar(T entity);

	void atualizar(T entity);

	T getById(Integer id);

}