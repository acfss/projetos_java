package br.com.poo.modelo;

public class Animal {
	protected String nome;
	protected float comprimento;
	protected String cor;
	protected String ambiente;
	protected float velocMed;
	
	public Animal(String nome, float comprimento, String cor, String ambiente, float velocMed) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocMed = velocMed;
		}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(nome);
		dados.append(" ");
		dados.append(comprimento);
		dados.append(" ");
		dados.append(cor);
		dados.append(" ");
		dados.append(ambiente);
		dados.append(" ");
		dados.append(velocMed);
	 return dados.toString();
	 }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocMed() {
		return velocMed;
	}
	public void setVelocMed(float velocMed) {
		this.velocMed = velocMed;
	}
	
}
