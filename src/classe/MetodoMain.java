package classe;

public class MetodoMain {

	public static void main(String[] args) {
		
		int idade = 19;

		if (idade < 12) {
			System.out.println("É uma criança");
		} else {
			if (idade <= 18) {
				System.out.println("É um adolescente");
			} else {
				System.out.println("É um adulto");
			}
		}

	}

}
