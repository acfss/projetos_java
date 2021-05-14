package br.com.poo.modelo;

public class Peixe extends Animal {
	private String caracteristica;
	
	public Peixe (String nome, float comp, String cor, String ambiente, float velocmedia, String caracteristica) {
		super(nome, comp, cor, ambiente, velocmedia);
		this.setCaracteristica(caracteristica);
		}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\n");
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
