package fundamentos;

public class Excecao {
	public static void main(String[] args) {
		
		String texto = null;

		try {
			System.out.println(texto.toUpperCase());

		} catch (Exception e) {
			
			System.out.println("ENTROU NA EXCEÇÃO: ");
		}

	}

}
