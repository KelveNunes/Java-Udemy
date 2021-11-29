package entidades;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public void calcularMedia() {
        double media = nota1 + nota2 + nota3;
        double mediaAprovacao = 60;
        if (media >= 60) {
            System.out.println("nota final: " + media);
            System.out.println("aprovado");
        } else {
            System.out.println("nota final: " + media);
            System.out.println("Reprovado");
            System.out.println("faltam: " + (mediaAprovacao - media) + " para ser aprovado");
        }
    }
}
