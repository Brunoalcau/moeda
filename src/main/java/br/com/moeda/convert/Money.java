package br.com.moeda.convert;
import java.math.BigDecimal;

import br.com.model.entity.Account;
import br.com.moeda.date.DateImpl;
import br.com.moeda.sourcer.CsvReader;
import br.com.moeda.sourcer.IReader;
import br.com.moeda.utils.Connection;

public class Money {
	
	public BigDecimal currencyQuotation(String from, String to, Double value, String date) throws Exception{	
		if(value < 0){
			throw new Exception("Value less than zero");
		}
		IReader read = this.init(date);
		Account f = null, t = null;
		try {
			f = read.findByCoin(from);
			t = read.findByCoin(to);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return calc(f.getPurchaseRate(), t.getPurchaseRate(), value);
	}
	
	public IReader init(String date) throws Exception{
		Connection c;
		IReader r = null;
		c = new Connection(new DateImpl(date));
		r = new CsvReader(c);
		return r;
	}
	
	private BigDecimal calc(Double from,Double to, Double value) throws Exception{
		Double x = (value * from) / to;
		return new BigDecimal(x).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
}
