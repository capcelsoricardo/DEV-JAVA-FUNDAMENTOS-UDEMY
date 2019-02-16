package oo.encapsulamento.casa2;

import javax.swing.GroupLayout.SequentialGroup;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra{
	
	String segredoDeCasal = "Meu Esposo me Ama";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem.." + euMesma.segredoDeCasal);
		
//		Genro meuAmor = new Genro();
//		System.out.println(meuAmor.segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);						
		
	}

}
