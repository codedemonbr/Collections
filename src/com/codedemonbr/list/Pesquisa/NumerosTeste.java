package com.codedemonbr.list.Pesquisa;

public class NumerosTeste {
    public static void main(String[] args) {
        SomaNumeros nums = new SomaNumeros();

        nums.adicionarNumero(8);
        nums.adicionarNumero(7);
        nums.adicionarNumero(2);
        nums.adicionarNumero(9);
        nums.adicionarNumero(14);

        System.out.println(nums.encontrarMaiorNumero());
        System.out.println(nums.encontrarMenorNumero());
        System.out.println(nums.calcularSoma());
        nums.exibirNumeros();

    }
}
