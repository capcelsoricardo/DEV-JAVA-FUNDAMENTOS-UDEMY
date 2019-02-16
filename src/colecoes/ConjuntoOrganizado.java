package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {

	public static void main(String[] args) {
		
		Set<String> conjunto = new TreeSet<String>();
		
		conjunto.add("Celso");
		conjunto.add("Ana");
		conjunto.add("Maria");
		conjunto.add("Julieta");
		conjunto.add("Ricardo");
		conjunto.add("Danielle");
		
		for (String nomes : conjunto) {
			System.out.println(nomes);
			
		}	

	}

}
