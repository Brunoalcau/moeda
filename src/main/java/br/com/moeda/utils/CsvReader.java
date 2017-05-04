package br.com.moeda.utils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CsvReader {

    private static final String SEPARATOR = ";";
    private static CsvReader reader;
    
	public List<Account> readRecords(InputStream source){
		BufferedReader br = new BufferedReader(new InputStreamReader(source));
		return br.lines()
		.map(mapToAccount)
		.collect(Collectors.toList());
	}
	
	public static Function<String, Account> mapToAccount = (line) -> {
		String[] c = line.split(SEPARATOR);
		Double paritySale = Double.parseDouble(c[6].replace(",", "."));
		return new Account(c[1],c[2], c[3], c[4], c[5], paritySale);
	};
	
	public static CsvReader get(){
		if(reader == null){
			reader = new CsvReader();
		}
		return reader;
	}
}
