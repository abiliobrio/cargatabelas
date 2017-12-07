package br.edu.infnet.posjava.tcc.cargatabelas.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDao<T> implements Dao<T> {

	protected EntityManager em;
	private Class clazz;

	@SuppressWarnings("rawtypes")
	public JpaDao(Class clazz) {
		super();
		this.clazz = clazz;
		EntityManagerFactory fac = Persistence
				.createEntityManagerFactory("infnet_poseng");
		em = fac.createEntityManager();
	}

	public void salvar(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	public void atualizar(T entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
	}

	public T getById(Integer id) {
		return  (T) em.find(clazz, id);
	}

}