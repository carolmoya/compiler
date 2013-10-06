package br.org.pucsp;
import java.util.HashMap;
import java.util.Map;


public class TokenRepository {
	
	private Map<String, String> dictionary;
	
	public TokenRepository() {
		dictionary = new HashMap<String, String>();
	}
	
	public void InsertToken(String k, String v) {
		dictionary.put(k, v);
	}
	
	public String getValue(String k) {
		return dictionary.get(k);
	}
	
	public boolean contains (String k) {
		return ((dictionary.get(k) == null) ? false : true);
	}
	
}
