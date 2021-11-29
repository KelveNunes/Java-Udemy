package Aplicacao;

import entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.print("digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("digite a nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("digite a nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("digite a nota 3: ");
        aluno.nota3 = sc.nextDouble();

        aluno.calcularMedia();
        sc.close();
    }
}
