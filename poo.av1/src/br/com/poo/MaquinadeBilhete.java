package br.com.poo;

import br.com.poo.modelo.Evento;
import br.com.poo.modelo.Local;


public class MaquinadeBilhete {

	public static void main(String[] args) {
		Evento evento = new Evento();
		Local local = new Local ("Arena", 20);
		Local local1 = new Local ("Concha Acustica", 50);
		Local local2 = new Local ("Went Wild", 30);
		
		
		
		evento.addEvento("Festival de Rock", 10, 6, 2022, "Paralamas", local1, 50);
		evento.addEvento("Festival de Inverno", 15, 9, 2022, "Caetano Veloso", local2, 150);		
		evento.addEvento("Festival do Outono", 20, 10, 2022, "Harmonia do Samba", local, 70);
		
		
		evento.consultEvento("Festival do Outono");
		//evento.imprimirBusca("Festival do Outono");
		
		//evento.comprarIngresso("Festival de Inverno", 30);
		//evento.ingressoDisp("Festival de Inverno");
		//evento.consultEventodisp();
		//evento.comprarIngresso("Festival de Inverno", 15);
		//evento.ingressoDisp("Festival de Inverno");
		//evento.comprarIngresso("Festival de Inverno", 10);
		//evento.consultValor("Festival do Outono");
		//evento.listarEvento();
		//evento.eventoDisp();
	}
}