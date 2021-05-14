package br.com.poo.modelo;

public class Animal {
	private String nome;
	private float comp;
	private String cor;
	private String ambiente;
	private float velocmedia;
	
	public Animal (String nome, float comp, String cor, String ambiente, float velocmedia) {
		this.nome = nome;
		this.comp = comp;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocmedia = velocmedia;
				}

	@Override
	public String toString() {
		StringBuilder dados =  new StringBuilder();
		dados.append(nome);
		dados.append("\n");
		dados.append(comp);
		dados.append("\n");
		dados.append(cor);
		dados.append("\n");
		dados.append(ambiente);
		dados.append("\n");
		dados.append(velocmedia);
		dados.append("\n");
		return dados.toString();
		}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComp() {
		return comp;
	}

	public void setComp(float comp) {
		this.comp = comp;
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

	public float getVelocmedia() {
		return velocmedia;
	}

	public void setVelocmedia(float velocmedia) {
		this.velocmedia = velocmedia;
	}
	
}	
	
	

