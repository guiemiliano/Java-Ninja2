package Generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja <T>{

    //Inicializar nosso array
    private List<T> itens;

    public BolsaNinja() {
        this.itens = new ArrayList<>();
    }

    //adicionando itens ao array
    public void adicionarItens(T itens){
        this.itens.add(itens);
    }


    //Mostrar itens com foreach
    public void mostrarItens(){
        for(T itens: itens){
            System.out.println(itens);
        }
    }


}
