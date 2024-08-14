package com.codedemonbr.list.Pesquisa;

public class CatalogoLivrosTeste {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Meu primeiro livro", "Thiago Santos", 1988);
        catalogo.adicionarLivro("Meu segundo livro", "Daiani Santos", 1987);
        catalogo.adicionarLivro("Meu terceiro livro", "Thiago Santos", 1988);


        System.out.println(catalogo.pesquisarPorAutor("thiago santos"));

        catalogo.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogo.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogo.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogo.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogo.pesquisarPorAutor("Robert C. Martin"));

        System.out.println(catalogo.pesquisarPorIntervaloAnos(2010, 2022));
        System.out.println(catalogo.getLivroList());

        System.out.println(catalogo.pesquisarPorTitulo("Java guia do programador"));
    }
}
