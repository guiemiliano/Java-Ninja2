package Generics2;

public class Main {
    public static void main(String[] args) {

        //Outra forma de utilizar generics
        BolsaNinja<Object> itensBolsa = new BolsaNinja<>();
        itensBolsa.adicionarItens(new Kunai("Explosiva"));
        itensBolsa.adicionarItens(new Shuriken(2));
        itensBolsa.adicionarItens(new Pergaminho("Invocar Gamabunta"));
        itensBolsa.adicionarItens(new CompanheiroNinja("Pakkun "));

        System.out.println("Itens da nossa bolsa ninja");
        itensBolsa.mostrarItens();
    }
}
