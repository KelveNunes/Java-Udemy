package Aplicacao;

import entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("digite os dados do produto: ");
        System.out.print("nome: ");
        produto.nome = sc.nextLine();
        System.out.print("preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println("Produtos em estoque: "+ produto);
        System.out.println();

        System.out.println("Quantidade de produtos que quer adicionar em estoque: ");
        int quantidadeAdicional = sc.nextInt();
        System.out.println();

        produto.AdcionaProdutos(quantidadeAdicional);
        System.out.println("Produtos em estoque: "+ produto);

        System.out.println("Quantidade de produtos que quer remover em estoque: ");
        int removerQuantidade = sc.nextInt();
        System.out.println();

        produto.removeProdutos(removerQuantidade);
        System.out.println("Produtos em estoque: "+ produto);
        sc.close();
    }

}
