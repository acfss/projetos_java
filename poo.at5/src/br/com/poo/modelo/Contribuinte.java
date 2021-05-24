package br.com.poo.modelo;

public abstract class Contribuinte {
	protected String nome;
	protected double rendaBrt;

	public Contribuinte() {

	}

	public Contribuinte(String nome, double rendaBrt) {
		this.nome = nome;
		this.rendaBrt = rendaBrt;
	}

	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(nome);
		dados.append("\n");
		dados.append(rendaBrt);
		dados.append("\n");
		return dados.toString();
	}

	public static Contribuinte[] listaContr() {
		Contribuinte[] lst = new Contribuinte[6];

		lst[0] = new PFisica("Joao Santos", 3000.00, "11111");
		lst[1] = new PJuridica("Lojas AA", 150000.00, "10055");
		lst[2] = new PFisica("Maria Soares", 5000.00, "22222");
		lst[3] = new PJuridica("Supermercados B", 2000000.00, "10066");
		lst[4] = new PFisica("Carla Maia", 1500.00, "33333");
		lst[5] = new PJuridica("Posto XX", 500000.00, "10077");
		
		return lst;
	}

	public abstract double calcImposto();		

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaBrt() {
		return rendaBrt;
	}

	public void setRendaBrt(double rendaBrt) {
		this.rendaBrt = rendaBrt;
	}

}
