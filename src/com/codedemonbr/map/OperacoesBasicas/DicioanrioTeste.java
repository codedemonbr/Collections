package com.codedemonbr.map.OperacoesBasicas;

public class DicioanrioTeste {
    public static void main(String[] args) {
        DIcionario dicionario = new DIcionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionar("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionar("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionar("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
