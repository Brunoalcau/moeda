package br.com.moeda.sourcer;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import br.com.model.entity.Account;
import br.com.moeda.utils.Connection;

public class CsvReader implements IReader{

    private static final String SEPARATOR = ";";
    private List<Account> accountList;
    
    public CsvReader(Connection con) throws Exception{
    	if(con == null){
    		throw new Exception("");
    	}
    	accountList = con.getCon().lines().map(mapToAccount).collect(Collectors.toList());
    }
    
	public Account findByCoin(String coin) throws Exception{
		Optional<Account> account = accountList.stream().filter(x->x.getCoin().equals(coin)).findFirst();
		account.orElseThrow(() -> new Exception("Not Found: "+coin));
		return account.get();
	}
	
	private static Function<String, Account> mapToAccount = (line) -> {
		String[] c = line.split(SEPARATOR);
		Double purchaseRate = Double.parseDouble(c[4].replace(",", "."));
		return new Account(c[1],c[2], c[3], purchaseRate);
	};
}
