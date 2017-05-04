import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import br.com.moeda.utils.Account;
import br.com.moeda.utils.Source;

public class Principal {
	public static void main(String[] args) {
		
		try {
			Source s = new Source("20170502");
			Account from = s.findByCoin("USD");
			Account to = s.findByCoin("EUR");
			Double x = (from.getParitySale()/to.getParitySale())*2;
			 
			System.out.println(new BigDecimal(x).setScale(2, BigDecimal.ROUND_HALF_UP).toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
//	public static Function<String, Account> mapToAccount = (line) -> {
//	  String[] c = line.split(";");
//	  return new Account(c[1],c[2], c[3], c[4], c[5], c[6]);
//	};
}
