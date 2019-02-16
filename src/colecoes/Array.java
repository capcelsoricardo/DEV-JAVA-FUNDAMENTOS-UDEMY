package colecoes;

public class Array {
	
	public static void main(String[] args) {
		double[] notasJoao = {10, 10, 10, 10, 10, 10}; 
		
		double[] notasPedro = new double[5];
		notasPedro[0] = 10;
		notasPedro[1] = 10;
		notasPedro[2] = 10;
		notasPedro[3] = 10;
		notasPedro[4] = 10;
		
		String[] candidatos = new String[5];
		double[] listaNotas = new double[4];
		
		
		
		double totalPedro = 0;
		for (int i = 0; i < notasPedro.length; i++) {
			totalPedro += notasPedro[i];			
		}
		
		for (String nome : candidatos) {
			System.out.println(nome);
		}
		
		double totalJoao = 0;
		for (double notas : notasJoao) {
			totalJoao += notas;
			
		}
		
//		for (int i = 0; i < notasJoao.length; i++) {
//			totalJoao += notasJoao[i];
//		}
		
		
		System.out.println("Aqui " + totalJoao / notasJoao.length);
		System.out.println(totalPedro/ notasPedro.length);
		System.out.println(totalJoao/ notasJoao.length);
		
	}

}
