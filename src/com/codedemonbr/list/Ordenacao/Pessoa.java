package com.codedemonbr.list.Ordenacao;

public class Pessoa implements Comparable<Pessoa> {
    private final String nome;
    private final int idade;
    private final double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "\n{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

