package br.com.poo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Local {
	private String endereco;
	private int capacidade;

	public Local() {
	}

	private List<Local> listalocal = new ArrayList<Local>();

	public void addLocal(String endereco, int capacidade) {
		listalocal.add(new Local(endereco, capacidade));
	}

	public Local(String endereco, int capacidade) {
		this.endereco = endereco;
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(endereco);
		dados.append(" ");
		dados.append(capacidade);
		dados.append(" ");
		return dados.toString();
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
