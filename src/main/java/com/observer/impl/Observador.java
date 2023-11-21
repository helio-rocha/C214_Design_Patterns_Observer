package com.observer.impl;

import com.observer.interfaces.IObservador;

public class Observador implements IObservador{
    int id;

	public Observador(int id) {
		this.id = id;
	}

	@Override
	public void update(Observavel observavel) {
		System.out.println("Observador: " + this.id);
		System.out.println("Palavras: " + observavel.getContadorPalavras().CalcularPalavras());
		System.out.println("Palavras com caracteres pares: " + observavel.getContadorPalavras().CalcularPalavrasCaracteresPares());
		System.out.println("Palvras com a primeira letra maiúscula: " + observavel.getContadorPalavras().CalcularPalavrasPrimeiraLetraMaiuscula());
		System.out.println("");
	}
}
