package com.codedemonbr.list.OperacoesBasicas;

public class CarrinhoTeste {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("vara de pesca", 2, 2);
        carrinhoDeCompras.adicionarItem("computador", 2, 3);
        carrinhoDeCompras.adicionarItem("sanduiche", 5, 1);


        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("computador");

        carrinhoDeCompras.exibirItens();
        
    }
}
