package br.edu.infnet.posjava.tcc.cargatabelas;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.posjava.tcc.cargatabelas.model.dao.AlunoDao;
import br.edu.infnet.posjava.tcc.cargatabelas.model.dao.Dao;
import br.edu.infnet.posjava.tcc.cargatabelas.model.domain.Aluno;
import br.edu.infnet.posjava.tcc.cargatabelas.model.domain.Curso;
import br.edu.infnet.posjava.tcc.cargatabelas.model.domain.Modulo;
import br.edu.infnet.posjava.tcc.cargatabelas.model.domain.Professor;
import br.edu.infnet.posjava.tcc.cargatabelas.model.domain.TipoCurso;
import br.edu.infnet.posjava.tcc.cargatabelas.model.domain.Turma;
import br.edu.infnet.posjava.tcc.cargatabelas.util.DataUtil;

//import br.edu.infnet.posjava.tcc.cargatabelas.model.dao.AlunoDao;


public class AppCargaDb {

	public static void main(String[] args) {
		
		/*
		 * Incluir Alunos
		 */
		System.out.println("*** Inserindo Alunos ***");

		List<Aluno> alunos = new ArrayList<>();
		List<Turma> turmas = new ArrayList<>();
		List<Modulo> modulos = new ArrayList<>(); 
		List<Curso> cursos = new ArrayList<>(); 
		
		Aluno aluno = new Aluno();
		Turma turma = new Turma();
		Professor professor = new Professor();
		Modulo modulo = new Modulo();
		Curso curso = new Curso();
		TipoCurso tipoCurso = new TipoCurso();
		
		tipoCurso.setDescricao("MIT");
		
		curso.setNome("JAVA SERVICOS");
		curso.setTipoCurso(tipoCurso);
		cursos.add(curso);
		
		Dao dao = new AlunoDao();
		
		aluno.setNome("Abilio Bezerra do Rio");
		aluno.setMatricula(15383);
		aluno.setSexo("M");
		aluno.setEmail("abiliobrio@gmail.com");
		alunos.add(aluno);
	

		professor.setMatricula(1111);
		professor.setNome("Jose");

		turma.setAlunos(alunos);
		turma.setProfessor(professor);
		turma.setModulo(modulo);
		turma.setDataInicio(DataUtil.toDateSql(01,2,2017));
		turma.setDataFim(DataUtil.toDateSql(30,6,2017));
		
		turmas.add(turma);
		
		modulo.setNome("JAVA");
		modulo.setTurmas(turmas);

		professor.setTurmas(turmas);
		tipoCurso.setCursos(cursos);
	
		aluno.setTurma(turma);

		dao.salvar(aluno);

	}

}
