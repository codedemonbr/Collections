package com.codedemonbr.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdernacaoPessoas {

    List<Pessoa> listaPessoas;

    public OrdernacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    void adicionarPessoas(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaPessoas);
        if (!listaPessoas.isEmpty()) {
            Collections.sort(pessoaPorIdade);
            return pessoaPorIdade;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        if (!listaPessoas.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }


}
