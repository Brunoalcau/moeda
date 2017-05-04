package br.com.moeda.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
	private Properties prop;
	private String nameProperties = "config.properties";
	
	protected PropertiesLoader() {
		prop = new Properties();
		InputStream in  = this.getClass().getClassLoader().getResourceAsStream(nameProperties);
		try {
			prop.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getValor(String key){
		return (String)prop.getProperty(key);
	}
}
