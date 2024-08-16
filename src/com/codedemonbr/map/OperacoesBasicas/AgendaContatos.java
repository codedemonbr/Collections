package com.codedemonbr.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private final Map<String, Integer> agendaContatoMap;


    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia");
        }
    }

    void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("A agenda de contatos está vazia");
        }
    }

    Integer pesquisarPorNome(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            Integer numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda.");
            }
            return numeroPorNome;
        } else {
            System.out.println("A agenda de contatos está vazia");
            return null;
        }
    }

}
