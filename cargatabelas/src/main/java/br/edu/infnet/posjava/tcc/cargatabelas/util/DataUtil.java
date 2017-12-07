package br.edu.infnet.posjava.tcc.cargatabelas.util;

import java.sql.Date;
import java.util.Calendar;

public abstract class DataUtil {

	public static Date toDateSql(int dia, int mes, int ano) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes - 1);
		calendar.set(Calendar.YEAR, ano);

		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		return new java.sql.Date(calendar.getTime().getTime());
	}

}
