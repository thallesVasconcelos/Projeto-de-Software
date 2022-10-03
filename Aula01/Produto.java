package Aula01;

public class Produto {
     String nome;
     String fabricante;
     double preco;
    
    public Produto(String nome,String fabricante,double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
