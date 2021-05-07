package br.com.poo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Evento {
private String nomeevento;
private int diaevento;
private int mesevento;
private int horaevento;
private String artista;
private Local local;
private int valoringresso;
private int ingressodisp;
private int quantidadeingresso;
private int valortotal;


public Evento() {
	
}

public Evento (String nomeevento, int diaevento, int mesevento, int horaevento, String artista, Local local, int valoringresso) {
	this.nomeevento = nomeevento;
	this.diaevento = diaevento;
	this.mesevento = mesevento;
	this.horaevento = horaevento;
	this.artista = artista;
	this.local = local; 
	this.valoringresso = valoringresso;
	this.ingressodisp = local.getCapacidade();
}

@Override
public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(nomeevento);
		dados.append(" ");
		dados.append(diaevento);
		dados.append(" ");
		dados.append(mesevento);
		dados.append(" ");
		dados.append(horaevento);
		dados.append(" ");
		dados.append(artista);
		dados.append(" ");
		dados.append(local.getEndereco());
		dados.append(" ");
		dados.append(valoringresso);
		dados.append(" ");
		dados.append(ingressodisp);
		return dados.toString();
}

private List<Evento> listaevento = new ArrayList<Evento>();

public void addEvento(String nomeevento, int diaevento, int mesevento, int horaevento, String artista, Local local, int valoringresso) {
	listaevento.add(new Evento(nomeevento, diaevento, mesevento, horaevento, artista, local, valoringresso));
}

public void consultValor(String nomeevento) {
	Evento evento = consultEvento(nomeevento);
	if (evento.getNomeevento().equals(nomeevento)) {
		System.out.println("O Valor do Evento é: R$" +evento.getValoringresso());
}
}

public Evento consultEvento(String nomeevento) {
	for (Evento evento : listaevento) {
		if (evento.getNomeevento().equals(nomeevento)) {
			return evento;
		}
	}
	return null;
}
public Evento consultEventodisp() {
	for (Evento evento : listaevento) {
		if (evento.getIngressodisp() > 0) {
			System.out.println(evento.getNomeevento());
		}
	}
	return null;
}
public void listarEvento() {
	for (Evento evento : listaevento) {
		System.out.println(evento);
	}
}
public void imprimirBusca(String nomeevento) {
	Evento evento = consultEvento(nomeevento);
		System.out.println(evento);
	}
	

public void comprarIngresso (String nomeevento, int quantidadeingresso) {
	Evento evento = consultEvento(nomeevento);
	if (evento.getIngressodisp() == 0) {
		System.out.println("Ingressos Esgotados");
		}
	else if (quantidadeingresso > evento.getIngressodisp()) {
		System.out.println("Quantidade de ingresso maior que o Disponivel");
		}
	else {
		evento.ingressodisp = evento.ingressodisp - quantidadeingresso;
		valortotal = (quantidadeingresso * evento.valoringresso);
		System.out.println("O valor total e: R$" + getValortotal());
	}
}

public void ingressoDisp(String nomeevento) {
	Evento evento = consultEvento(nomeevento);
		System.out.println("A quantidade de ingressos disponiveis é: " +evento.getIngressodisp());
	}
	
	
public String getNomeevento() {
	return nomeevento;
}

public void setNomeevento(String nomeevento) {
	this.nomeevento = nomeevento;
}

public int getDiaevento() {
	return diaevento;
}

public void setDiaevento(int diaevento) {
	this.diaevento = diaevento;
}

public int getMesevento() {
	return mesevento;
}

public void setMesevento(int mesevento) {
	this.mesevento = mesevento;
}

public int getHoraevento() {
	return horaevento;
}

public void setHoraevento(int horaevento) {
	this.horaevento = horaevento;
}

public String getArtista() {
	return artista;
}

public void setArtista(String artista) {
	this.artista = artista;
}

public Local getLocal() {
	return local;
}

public void setLocal(Local local) {
	this.local = local;
}

public int getValoringresso() {
	return valoringresso;
}

public void setValoringresso(int valoringresso) {
	this.valoringresso = valoringresso;
}

public int getIngressodisp() {
	return ingressodisp;
}

public void setIngressodisp(int ingressodisp) {
	this.ingressodisp = ingressodisp;
}

public int getQuantidadeingresso() {
	return quantidadeingresso;
}

public void setQuantidadeingresso(int quantidadeingresso) {
	this.quantidadeingresso = quantidadeingresso;
}

public int getValortotal() {
	return valortotal;
}

public void setValortotal(int valortotal) {
	this.valortotal = valortotal;
}




}
