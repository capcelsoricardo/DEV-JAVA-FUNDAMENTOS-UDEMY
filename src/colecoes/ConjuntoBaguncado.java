package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		
		conjunto.add('a');
		conjunto.add("Olá esse é um texto");
		conjunto.add(123);
		conjunto.add(false);
		conjunto.add(33.4);
		System.out.println(conjunto.add(123));
		System.out.println("Size....." + conjunto.size());
		
		System.out.println("Remove...");
		System.out.println(conjunto.remove("a"));
		System.out.println(conjunto.remove('a'));
		
		System.out.println("Contains...");
		System.out.println(conjunto.contains('a'));		
		System.out.println(conjunto.contains(12));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto.addAll(nums));
		
		System.out.println("Tamanho...");
		System.out.println(nums.size());
		System.out.println(nums.add(0));
		System.out.println(nums.size());
		
		conjunto.clear();		
		System.out.println(conjunto.isEmpty());		
	}
}
