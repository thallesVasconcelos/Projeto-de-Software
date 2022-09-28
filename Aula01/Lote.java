public class Lote {
   int quantidade;
   int datav;
   Produto prod;

   public Lote(int quantidade,int datav,Produto prod) {
        this.datav = datav;
        this.quantidade = quantidade;
        this.prod =prod;
   }
   public void Setdatav(int datav) {
        this.datav = datav;
   }
   public void SetQuantidade(int quantidade) {
        this.quantidade = quantidade; 
   }
}
