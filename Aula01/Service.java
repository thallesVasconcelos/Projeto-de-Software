package Aula01;

import java.util.Date;

public class Service {
  
    RepositorioProduto repositorioProduto = new RepositorioProduto();
    RepositorioLote repositorioLote = new RepositorioLote();
    
    public Service(){
        new Service();
    }

    public void criarProduto(String nome,String fabricante,double preco){ 
        Produto produto = new Produto(nome, fabricante, preco);
        repositorioProduto.add(produto);
  }
    public String ListarProduto() {
        return repositorioProduto.listarProdutos();
  }
     public void criarLote(int quantidade,Date datav,Produto prod) {
        Lote lote = new Lote(quantidade, datav, prod);
        repositorioLote.add(lote);
  }
    public String listarLote(){
        return repositorioLote.listarLote();
  }

}
