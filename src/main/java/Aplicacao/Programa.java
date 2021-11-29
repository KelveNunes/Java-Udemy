package Aplicacao;
import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os lados do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do triagulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double calcularAreax = x.calcularArea();
        double calcularAreay = y.calcularArea();

        if( calcularAreax > calcularAreay){
            System.out.println("maior X");
        }
        else{
            System.out.println("maior Y");
        }


        sc.close();
    }
}
