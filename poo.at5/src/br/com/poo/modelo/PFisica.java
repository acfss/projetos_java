package br.com.poo.modelo;

public class PFisica extends Contribuinte {
	protected String cpf;
	protected double imposto;

	public PFisica() {
	}

	public PFisica(String nome, double rendaBrt, String cpf) {
	}

	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(cpf);
		return dados.toString();
	}

	@Override
		public double calcImposto() {
			if (getRendaBrt() <= 1400.00) {
				System.out.println("Isento de Imposto de Renda");
			}
			else if (getRendaBrt() >= 1400.01 && getRendaBrt() <= 2100.00) {
				imposto = (getRendaBrt() * 0.10) - 100;
				System.out.println("o Valor do Imposto é: " +imposto);
			}
			else if (getRendaBrt() >= 2100.01 && getRendaBrt() <= 2800.00) {
				imposto = (getRendaBrt() * 0.15) - 270;
				System.out.println("o Valor do Imposto é: " +imposto);
				}
			else if (getRendaBrt() >= 2800.01 && getRendaBrt() <= 3600.00) {
				imposto = (getRendaBrt() * 0.25) - 500;
				System.out.println("o Valor do Imposto é: " +imposto);
		}
			else if (getRendaBrt() >= 3600.01) {
				imposto = (getRendaBrt() * 0.30) - 700;
				System.out.println("o Valor do Imposto é: " +imposto);
			}
	return 0;	
	}
}
