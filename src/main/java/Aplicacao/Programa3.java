package Aplicacao;

import entidades.Retangulo;

public class Programa3 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4,4);
        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());
        System.out.println(retangulo.diagonal());


    }
}
