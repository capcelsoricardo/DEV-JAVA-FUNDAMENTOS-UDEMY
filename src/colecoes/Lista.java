package colecoes;


import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> minhaLista = new ArrayList<>();
		
		System.out.println("Adicionando...");
		minhaLista.add("João");
		minhaLista.add("João");
		
		System.out.println(minhaLista.get(0));
		System.out.println(minhaLista.get(1));
		
		
		System.out.println("Removendo...");
		minhaLista.remove("João");
		System.out.println(minhaLista.get(0));
		
		System.out.println("Tamanho...");
		System.out.println(minhaLista.size());
				
		for (String string : minhaLista) {
			System.out.println("Impressão de For Each = " + string);
		}
	}

}
