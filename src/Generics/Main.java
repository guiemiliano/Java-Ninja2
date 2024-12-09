package Generics;

/*
    Generics benefícios
    deixar o código escalável
    Facilitar manutenção
    Deixar o código genérico e reutilizável
 */
public class Main {
    public static void main(String[] args) {
        //Criando Equipamentos genéricos com seu nome no construtor
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja papelBomba = new EquipamentosNinja("Papel Bomba");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        //Crio objeto BolsaGenerica que vai receber a lista de objetos genéricos EquipamentosNinja
        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();

        //Usando o método de adicionarEquipamentos da calsse bolsaGenerica
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);
        bolsaGenerica.adicionarEquipamentos(papelBomba);

        //Apenas printando minha bolsa genérica
        System.out.println(bolsaGenerica);


    }
}
