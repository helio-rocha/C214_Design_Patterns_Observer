package com.observer.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContadorPalavras {

    String frase;
    String[] palavras;

    public ContadorPalavras(String frase) {
        this.frase = frase.trim();
        this.palavras = this.frase.split(" ");
    }

    public int CalcularPalavras() {
        return this.palavras.length;
    }

    public int CalcularPalavrasCaracteresPares() {
        Pattern pattern = Pattern.compile("\\b(\\w\\w)+\\b");
        int count = 0;
        for (String palavra : this.palavras) {
            Matcher matcher = pattern.matcher(palavra);
            if (matcher.find()) {
                count++;
            }
        }
        return count;
    }

    public int CalcularPalavrasPrimeiraLetraMaiuscula() {
        Pattern pattern = Pattern.compile("[A-Z]+");
        int count = 0;
        for (String palavra : this.palavras) {
            Matcher matcher = pattern.matcher(palavra);
            if (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}
