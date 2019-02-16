package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {

		// Tipo primitivo Boolean
		boolean bo1 = true;
		boolean bo2 = false;
		System.out.printf("%b %b \n", bo1, bo2).toString().toUpperCase();

		// Tipo primitivo caracter
		char c1 = 'a';
		char c2 = '\u0050';
		System.out.printf("%c %c \n", c1, c1);

		// Tipos primitivos inteiros
		byte b = 126;
		short c = 1235;
		int i = 2_34_90;
		long l = 9_981_098L;
		System.out.printf("%d %d %d %d \n", b, c, i, l);
		System.out.println(Integer.toBinaryString(b));

		// Tipos primitivos reais
		float f = 3.236f;
		double d = 2.45;
		System.out.println(f);
		System.out.println(d);
	}
}
