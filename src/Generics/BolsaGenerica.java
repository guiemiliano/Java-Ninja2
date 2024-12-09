package Generics;

import java.util.ArrayList;
import java.util.List;

/*
    Para usar generics na minha classe devo usar
    <T> o T é apenas um símbolo, mas é boa prática usá-lo
 */
public class BolsaGenerica<T>{
    private List<T> equipamento;

    public BolsaGenerica() {
        this.equipamento = new ArrayList<>();
    }

    //Método para add equipamento

    public void adicionarEquipamentos(T equipamento){
        this.equipamento.add(equipamento);
    }

    public List<T> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<T> equipamento) {
        this.equipamento = equipamento;
    }

    @Override
    public String toString() {
        return "Bolsa genérica: "+ equipamento;

    }
}
