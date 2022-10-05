package Aula01;

import java.util.Date;

public class Lote {
   private int quantidade;
   private Date datav;
   private Produto prod;

   public Lote(int quantidade,Date datav,Produto prod) {
        this.datav = datav;
        this.quantidade = quantidade;
        this.prod =prod;
   }
   public Date getDatav(){
     return this.datav;
   }
   public Produto getProduto(){
     return this.prod;
   }
   public int getQuantidade(){
     return this.quantidade;
   }
   public void Setdatav(Date datav) {
        this.datav = datav;
   }
   public void SetQuantidade(int quantidade) {
        this.quantidade = quantidade; 
   }
   public String toString(){
     return this.quantidade + " " + this.datav + " " + this.prod.toString();
   }
}
