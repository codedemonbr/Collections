package com.codedemonbr.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    int calcularSoma() {
        int acumulador = 0;
        if (!numeros.isEmpty()) {
            for (int num : numeros) {
                acumulador += num;
            }
            return acumulador;
        } else {
            throw new RuntimeException("Array vazio");
        }
    }

    int encontrarMaiorNumero() {
        int maior = numeros.getFirst();
        if (!numeros.isEmpty()) {
            for (Integer num : numeros) {
                if (num > maior) {
                    maior = num;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("Array vazio");
        }
    }

    int encontrarMenorNumero() {
        int menor = numeros.getFirst();
        if (!numeros.isEmpty()) {

            for (Integer num : numeros) {
                if (num < menor) {
                    menor = num;
                }
            }
            return menor;
        } else {
            throw new RuntimeException("Array vazio");
        }
    }

    void exibirNumeros() {
        System.out.println(numeros);
    }
}
