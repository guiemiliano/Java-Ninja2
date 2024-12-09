package Generics;

import java.util.ArrayList;
import java.util.List;

/*
    Para usar generics na minha classe devo usar
    <T> o T é apenas um símbolo, mas é boa prática usá-lo
 */
public class BolsaGenerica<T>{
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    //Colocar equipamentos genéricos
    public void adicionarEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de Equipamentos: " + equipamentos.toString();
    }
}
