package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> aprovados = new HashMap<>();
		
		aprovados.put(1, "Dani e Ricardo <3");
		aprovados.put(2, "Dani e Ricardo 2");
		aprovados.put(3, "Dani e Ricardo 3");
		
		System.out.println(aprovados.keySet());
		System.out.println(aprovados.values());
		System.out.println(aprovados.get(1));
		
		System.out.println(aprovados.entrySet());
		
		for (Integer chave : aprovados.keySet()) {
			System.out.println(chave);
		}
	
		for (String valores : aprovados.values()) {
			System.out.println(valores);
		}
	
		for (Entry<Integer, String> registro : aprovados.entrySet()) {
			System.out.println(registro);			
		}
		
	}
}
