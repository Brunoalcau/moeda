package br.com.moeda.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import br.com.moeda.date.IDate;
import br.com.moeda.properties.PropertiesLoaderImpl;

public class Connection {
	private String path = PropertiesLoaderImpl.getItem("moeda.url");	
	private String url; 
	
	public Connection (IDate date) throws Exception{			
		url = String.format("%s%s.csv", path, date.getDayUtils());
	}
	
	public BufferedReader getCon() throws Exception{
		 URL csvUrl = new URL(url);
		 InputStream source = csvUrl.openStream();
		 InputStreamReader is = new InputStreamReader(source);
		return  new BufferedReader(is);
	}
	
}
