package br.com.poo.modelo;

public class PJuridica extends Contribuinte{
	protected String cnpj;
	
	
	public PJuridica() {
	}
	public PJuridica(String nome, double rendaBrt, String cnpj) {
	super (nome, rendaBrt);
	this.cnpj = cnpj;
	}
	
	@Override
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(cnpj);
		return dados.toString();
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public double calcImposto() {
		double imposto = this.getRendaBrt() * 0.10;
		System.out.println("valor do imposto:" +imposto);
		return imposto;
	}
	
}
	