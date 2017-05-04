package utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

public class Source {
	private String config = PropertiesLoaderImpl.getItem("moeda.url");	
	private List<Account> accounts; 
	public Source (String date) throws MalformedURLException, IOException{
		String url = String.format("%s%s.csv", config, date);
		InputStream source = new URL(url).openStream();
		accounts = CsvReader.get().readRecords(source);
	}
	
	public Account findByCoin(String Coin){
		return accounts.stream().filter(x->x.getCoin() == Coin).findFirst().get();
	}
}
