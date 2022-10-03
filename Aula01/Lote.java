package Aula01;

import javax.xml.crypto.Data;

public class Lote {
   int quantidade;
   Data datav;
   Produto prod;

   public Lote(int quantidade,Data datav,Produto prod) {
        this.datav = datav;
        this.quantidade = quantidade;
        this.prod =prod;
   }
   public void Setdatav(Data datav) {
        this.datav = datav;
   }
   public void SetQuantidade(int quantidade) {
        this.quantidade = quantidade; 
   }
}
