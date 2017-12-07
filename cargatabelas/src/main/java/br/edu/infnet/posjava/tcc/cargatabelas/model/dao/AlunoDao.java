package br.edu.infnet.posjava.tcc.cargatabelas.model.dao;

import br.edu.infnet.posjava.tcc.cargatabelas.model.domain.Aluno;

public class AlunoDao extends JpaDao<Aluno> {

	public AlunoDao() {
		super(Aluno.class);
	}
	

}
