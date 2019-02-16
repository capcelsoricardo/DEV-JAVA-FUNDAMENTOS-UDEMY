package oo.heranca2;

public class Humano {
	
	public String nome;
	public String RG;
	public String idioma;
	
	public void caminhar() {
		System.out.println("Caminhando..");
	}
	
	public void comer() {
		System.out.println("Comendo..");
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

}
