package entidades;

import org.w3c.dom.ls.LSOutput;

public class Produto {
    public String nome;
    public int quantidade;
    public double preco ;

    public double  valorEmEsotoque(){
        return quantidade * preco;
    }
    public void AdcionaProdutos(int quantidade){
        this.quantidade+=quantidade;
    }
    public void removeProdutos(int quantidade){
        this.quantidade-=quantidade;
    }
    @Override
    public String toString(){
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", " + quantidade
                +" unidades, total: $ "
                + String.format("%.2f", valorEmEsotoque());
    }
}
