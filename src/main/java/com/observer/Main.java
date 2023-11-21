package com.observer;

import com.observer.impl.Observador;
import com.observer.impl.Observavel;


public class Main {
    public static void main(String[] args) {
        String frase = "Frase de Teste";

        Observador observador1 = new Observador(1);
        Observador observador2 = new Observador(2);
        Observador observador3 = new Observador(3);

        Observavel observavel = new Observavel();

        observavel.registraObservador(observador1);
        observavel.registraObservador(observador2);
        observavel.registraObservador(observador3);

        System.out.println("Criação da frase com update aos observadores");
        observavel.SetNovaFrase(frase);

        observavel.removeObservador(observador3);

        System.out.println("Notificação dos observadores, sem o observador 3");
        observavel.notificaObservadores();

    }
}