package com.codedemonbr.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class DIcionario {
    private final Map<String, String> dicionario;

    public DIcionario() {
        this.dicionario = new HashMap<>();
    }

    void adicionar(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("O dicionario está vazio");
        }
    }

    String pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Palavra não encontrada no dicionário";
    }

    void exibirPalavras() {
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("O dicionario está vazio");
        }
    }

}
