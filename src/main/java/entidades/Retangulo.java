package entidades;

public class Retangulo {
    protected double altura;
    protected double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    public double area(){
        return altura * largura;
    }
    public double perimetro(){
        return (altura + largura) * 2;
    }
    public double diagonal(){
        return Math.sqrt((altura*2) + (largura*2));
    }

}
