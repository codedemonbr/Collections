package com.codedemonbr.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    void exibirItens() {
        for (Item item : carrinho) {
            System.out.println(item.toString());
        }
    }

    double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : carrinho) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    void removerItem(String nome) {
        List<Item> listaTemporaria = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    listaTemporaria.add(item);
                }
            }
            carrinho.removeAll(listaTemporaria);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
