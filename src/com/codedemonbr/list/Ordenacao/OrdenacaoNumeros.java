package com.codedemonbr.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    void adicionarNumeros(int numero) {
        numeros.add(numero);
    }

    List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
