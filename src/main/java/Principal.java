import java.math.BigDecimal;

import br.com.moeda.convert.Money;

public class Principal {
	public static void main(String[] args) {		
		try {
			Money m = new Money();
			BigDecimal x =  m.currencyQuotation("DKK", "SVC", 100.00, "04/05/2017");
			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
	