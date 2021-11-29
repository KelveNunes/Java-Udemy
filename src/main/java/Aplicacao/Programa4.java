package Aplicacao;

import entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario: ");
        funcionario.nome= sc.nextLine();
        System.out.println("Digite o salario bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Digite o imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("nome: " + funcionario.nome + " salario: " + funcionario.exibirSalario());
        funcionario.AumentaSalario(10);
        System.out.println("nome: " + funcionario.nome + " salario: " + funcionario.exibirSalario());




        sc.close();
    }
}
