package br.com.poo;

import br.com.poo.modelo.*;

public class AppMain {

	public static void main(String[] args) {
		Contribuinte.listaContr()[1].calcImposto();
		Contribuinte.listaContr()[3].calcImposto();
		Contribuinte.listaContr()[5].calcImposto();
	}

}
