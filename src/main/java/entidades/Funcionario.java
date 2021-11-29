package entidades;

public class Funcionario {
    public String nome ;
    public double salarioBruto;
    public double imposto;

    public double exibirSalario(){
        return salarioBruto - imposto;


    }

    public void AumentaSalario(double porcetagem){
        double salarioAumentado = (this.salarioBruto * porcetagem)/100;
        salarioBruto +=salarioAumentado;

    }
}
