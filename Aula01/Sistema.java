package Aula01;

public class Sistema {
   public static void main(String[] args) {
     Produto p = new Produto("bike","ferrari", 1000);
     new Lote(1000,1000,p);
   } 
}
