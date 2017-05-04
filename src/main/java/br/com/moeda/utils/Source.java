package br.com.moeda.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

public class Source {
	private String path = PropertiesLoaderImpl.getItem("moeda.url");	
	private List<Account> accounts; 
	public Source (String date) throws MalformedURLException, IOException{
		String url = String.format("%s%s.csv", path, date);
		InputStream source = new URL(url).openStream();
		accounts = CsvReader.get().readRecords(source);
	}
	
	public Account findByCoin(String coin) throws Exception{
		Optional<Account> account = accounts.stream().filter(x->x.getCoin().equals(coin)).findFirst();
		account.orElseThrow(() -> new Exception());
		return account.get();
	}
}
