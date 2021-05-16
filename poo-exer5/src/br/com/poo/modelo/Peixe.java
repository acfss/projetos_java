package br.com.poo.modelo;

public class Peixe extends Animal {
	private String caracteristica;
	
	public Peixe (String nome, float comprimento, String cor, String ambiente, float velocMed, String caracteristica) {
		super(nome, comprimento, cor, ambiente, velocMed);
		this.setCaracteristica(caracteristica);
		
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(" ");
		dados.append(caracteristica);
		return dados.toString();
		}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
}