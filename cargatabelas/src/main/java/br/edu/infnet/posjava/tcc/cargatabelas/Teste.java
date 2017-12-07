package br.edu.infnet.posjava.tcc.cargatabelas;

import java.text.SimpleDateFormat;

import br.edu.infnet.posjava.tcc.cargatabelas.util.DataUtil;

public class Teste {

	public static void main(String[] args) {

		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(f.format(DataUtil.toDateSql(28,2,2017)));
		
	}

}
