package br.com.poo;

import br.com.poo.modelo.Animal;
import br.com.poo.modelo.Peixe;

public class TestaAnimais {

	public static void main(String[] args) {
		Animal camelo = new Animal ("camelo", 1.50f, "amarelo", "deserto", 2.0f);
		System.out.println(camelo);
		
		Peixe tubarao = new Peixe ("tubarao", 3.00f, "cinzento", "mar", 1.5f, "barbatanta e cauda");
		System.out.println(tubarao);
	}
	

}
