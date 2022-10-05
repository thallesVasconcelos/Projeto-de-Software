package Aula01;

public class Sistema {
   public static void main(String[] args) {
      Fachada fachada = new Fachada();

      fachada.adicionarLote(0, null, null);
      fachada.adicionarProduto(null, null, 0);
      fachada.listarLote();
      fachada.listarProdutos();
   } 
}
