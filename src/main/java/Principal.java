import java.io.IOException;
import java.util.List;
import java.util.Optional;

import utils.Account;
import utils.Source;

public class Principal {
	public static void main(String[] args) {
		
		try {
			Source s = new Source("20170502");
			Account a = s.findByCoin("AFN");
			System.out.println(a.getCoin());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static Function<String, Account> mapToAccount = (line) -> {
//	  String[] c = line.split(";");
//	  return new Account(c[1],c[2], c[3], c[4], c[5], c[6]);
//	};
}
