package Aula01;

public class Produto {
    private String nome;
    private String fabricante;
    private double preco;
   
    
    public Produto(String nome,String fabricante,double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;


    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Double getPreco(){
        return this.preco;
    }
    public String getFabricante(){
        return this.fabricante;
    }
    public String toString(){
        return this.nome + " "+ this.getFabricante()+" "+ this.preco;
    }

}
