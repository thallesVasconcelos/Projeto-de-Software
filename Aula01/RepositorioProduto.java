package Aula01;

import java.util.ArrayList;

public class RepositorioProduto {
    ArrayList<Produto> RepositorioProduto = new ArrayList<>();
    public RepositorioProduto(){
        this.RepositorioProduto = new ArrayList<>();  
    }
    public void add(Produto produto){
        RepositorioProduto.add(produto);
    }
    public String listarProdutos() {
        String resultado = "";
        for (Produto produto : RepositorioProduto) {
            resultado += produto.toString() + " ";
        }
        return resultado.trim();
        
    }
}
