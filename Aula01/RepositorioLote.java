package Aula01;

import java.util.ArrayList;

public class RepositorioLote {
    ArrayList<Lote> RepositorioLote = new ArrayList<>();
    public RepositorioLote(){
        this.RepositorioLote = new ArrayList<>();  
    }
    public void add(Lote lote){
        RepositorioLote.add(lote);
    }
    public String listarLote() {
        String resultado = "";
        for (Lote lote : RepositorioLote) {
            resultado += lote.toString() + " ";
        }
        return resultado.trim();
        
    }
}