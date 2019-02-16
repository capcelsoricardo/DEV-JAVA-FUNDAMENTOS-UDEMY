package estruturadados;

public class DoWhile {

	public static void main(String[] args) {

		int i = 0;

		System.out.println("Imprimindo de forma crescente:\n");
		do {
			System.out.println("Número " + i);
			i++;

		} while (i < 10);

		i = 9;

		System.out.println("\nImprimindo de forma decrescente:\n");
		do {
			System.out.println("Número " + i);
			i--;

		} while (i >= 0);
	}
}
