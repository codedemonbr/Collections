package com.codedemonbr.map.OperacoesBasicas;

public class AgendaTeste {
    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();
        // Adicionar contatos
        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("João", 5665);
        agenda.adicionarContato("Carlos", 1111111);
        agenda.adicionarContato("Ana", 654987);
        agenda.adicionarContato("Maria", 1111111);
        agenda.adicionarContato("Camila", 44444);

        agenda.exibirContatos();

        // Remover um contato
        agenda.removerContato("Maria");
        agenda.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agenda.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agenda.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);

    }
}
