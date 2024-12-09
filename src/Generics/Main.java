package Generics;

/*
    Generics benefícios
    deixar o código escalável
    Facilitar manutenção
    Deixar o código genérico e reutilizável
 */
public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(pergaminho);
        bolsaGenerica.adicionarEquipamentos(shuriken);

        System.out.println(bolsaGenerica);

    }
}
