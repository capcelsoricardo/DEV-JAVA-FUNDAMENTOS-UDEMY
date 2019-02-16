package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.push("Estou colocando um elemento na pilha.");
		pilha.push("O Monge e o Executivo.");
		pilha.push("O Homem mais Rico da Babilonia");
		
		
		System.out.println("Peek...");
		System.out.println(pilha.peek());
		
//		
//		System.out.println("Pop...");
//		System.out.println(pilha.pop());
//		System.out.println(pilha.pop());
//		System.out.println(pilha.pop());
//		System.out.println(pilha.poll());
		
				
		System.out.println("For Each");
		for (String string : pilha) {
			System.out.println(string);
		}
		
	}
}
