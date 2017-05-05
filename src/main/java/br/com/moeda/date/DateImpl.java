package br.com.moeda.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateImpl implements IDate{
	private static final String REG_DATE = "((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((1[6-9]|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((1[6-9]|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((1[6-9]|[2-9]\\d)\\d{2}))|(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00)))";
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private String date;
	
	public DateImpl(String date) throws Exception{
		if(date == null || !date.matches(REG_DATE)){
			throw new Exception("Date invalid");
		}
		this.date = date;
	}
	
	public String getDayUtils() throws Exception{
		LocalDate localDate = LocalDate.parse(this.date, formatter);
		
		if(DayOfWeek.SATURDAY == localDate.getDayOfWeek()){
			localDate = localDate.minusDays(1);
		}
		
		if(DayOfWeek.SUNDAY == localDate.getDayOfWeek()){
			localDate = localDate.minusDays(2);
		}
		return localDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	}
	
}
