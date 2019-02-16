package estruturadados;

public class Break {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 10; i++) {
			System.out.println("Esse é o Externo:" + i);
			for (int j = 0; j < 10; j++) {
				if (j == 2)
					break externo;
				System.out.println("Esse é o Interno: " + j);
			}

		}

	}
}