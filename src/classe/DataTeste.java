package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data nascimento = new Data();
//		nascimento.dia = 19;
//		nascimento.mes = 11;
//		nascimento.ano = 1997;
		
		Data casamento = new Data(23,07,2018);
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
					
	}

}
