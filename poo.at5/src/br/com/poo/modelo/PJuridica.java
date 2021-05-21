package br.com.poo.modelo;

public class PJuridica extends Contribuinte {
	protected String cnpj;
	
	public PJuridica (String nome, double rendaBrt, String cnpj) {
		super(nome, rendaBrt);
		this.setCnpj(cnpj);
	}
	public String toString () {
	StringBuilder dados = new StringBuilder();
	dados.append(super.toString());
	dados.append(cnpj);
	return dados.toString();
	}
	
	public double calcImposto(String nome) {
		for (PJuridica pjuridica : nome) {
			if (pjuridica.getNome().equals(nome)) {
				double imposto = pjuridica.getRendaBrt() * 10/100;
				System.out.println("O Valor do Imposto é: " + imposto);
			}
		}
		
			}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
