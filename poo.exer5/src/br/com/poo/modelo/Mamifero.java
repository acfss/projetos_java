package br.com.poo.modelo;

public class Mamifero {
	private String alimento;
	private int numPatas;

	public Mamifero(String nome, float comp, String cor, String ambiente, float velocmedia, String alimento,
			int numPatas) {
		this.alimento = alimento;
		this.numPatas = numPatas;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\n");
		dados.append(alimento);
		dados.append("\n");
		dados.append(numPatas);

		return dados.toString();

	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

}
