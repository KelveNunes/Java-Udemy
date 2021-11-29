package entidades;

public class Triangulo {

    public double a, b, c;


    public double calcularArea(){
        double calculo = (a + b+ c) / 2;
        return Math.sqrt(calculo *(calculo - a)* (calculo - b)* (calculo-c));


    }
}
