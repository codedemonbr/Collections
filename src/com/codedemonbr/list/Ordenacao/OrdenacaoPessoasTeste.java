package com.codedemonbr.list.Ordenacao;

public class OrdenacaoPessoasTeste {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdernacaoPessoas ordenacaoPessoas = new OrdernacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoas("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoas("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoas("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoas("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.listaPessoas);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura().reversed());
    }
}
