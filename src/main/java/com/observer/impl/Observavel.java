package com.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.observer.interfaces.IObservavel;

public class Observavel implements IObservavel{
    
    private ContadorPalavras contadorPalavras;
	private List<Observador> clientes;

	public Observavel() {
		clientes = new ArrayList<Observador>();
	}
	
	@Override
	public void registraObservador(Observador obs) {
		clientes.add(obs);
	}

	@Override
	public void removeObservador(Observador obs) {
		if(clientes.contains(obs))
			clientes.remove(obs);
	}

	@Override
	public void notificaObservadores() {
		for (Observador observador : clientes) {
			observador.update(this);
		}
	}
	
	private void novasMedidas() {
		notificaObservadores();
	}
	
	public void SetNovaFrase(String frase) {
		this.contadorPalavras = new ContadorPalavras(frase);
		novasMedidas();
	}

	public ContadorPalavras getContadorPalavras() {
		return this.contadorPalavras;
	}

	public void setContadorPalavras(ContadorPalavras contadorPalavras) {
		this.contadorPalavras = contadorPalavras;
	}

	public void setClientes(List<Observador> clientes) {
		this.clientes = clientes;
	}

	public List<Observador> getClientes() {
		return clientes;
	}
}
