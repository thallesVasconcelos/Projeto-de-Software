package Aula01;

import java.util.Date;

public class Fachada {
    Service service;
    public Fachada(){
         service = new Service();
    }
    public void adicionarProduto(String nome,String fabricante,double preco){
        service.criarProduto(nome, fabricante, preco);
    }
    public String listarProdutos(){
        return service.ListarProduto();
    }
    public void adicionarLote(int quantidade,Date datav,Produto prod){
        service.criarLote(quantidade, datav, prod);
    }
    public String listarLote() {
        return service.listarLote();
    }
}     
