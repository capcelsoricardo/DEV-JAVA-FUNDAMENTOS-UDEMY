package estruturadados;

public class Switch {
	public static void main(String[] args) {

		String faixa = "amarela";

		switch (faixa.toLowerCase()) {

		case "preta":
			System.out.println("Golpes All");
			break;
		case "laranja":
			System.out.println("Golpes de Perna e Braço");
			break;
		case "azul":
			System.out.println("Golpes de Perna");
			break;
		case "amarela":
			System.out.println("Golpes Intermediários");
			break;
		case "branca":
			System.out.println("Golpes de Braço");
			break;

		default:
			System.out.println("Default");

		}
	}
}
