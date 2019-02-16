package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria");
		fila.offer("João");
		fila.add("Pedro");
		System.out.println("Peek/Element...");
		 
		// Olha quem é o primeiro elemento da fila e imprime
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		// Remove o primeiro elemento da fila
		System.out.println("Poll/Remove...");
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		fila.element();
		System.out.println(fila.poll());
		System.out.println(fila.poll());
						
	}
}
