package br.com.moeda.utils;

public class PropertiesLoaderImpl {
	private static PropertiesLoader propertiesLoader = new PropertiesLoader();
	public static String getItem(String key){
		return propertiesLoader.getValor(key);
	}
}
