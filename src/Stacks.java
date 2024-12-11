import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        //Estruturas de dados

        //Arrays
        //Estáticos e tem referência de memória prévia(Devo declarar quanto espaço quero na memória)
        String[] arrayNinja = new String[3];
        arrayNinja[0] = "Naruto Uzumaki";


        //Listas
        //São dinâmicas e seu tamanho aumenta ou diminuí conforme a necessidade
        List<String> listaNinja = new ArrayList<>();
        listaNinja.add("Naruto Uzumaki");

        //-----------------------------------------

        //Stack
        //O último elemento que entrou é obrigatoriamente o primeiro a sair
        //Ele tem 4 métodos próprios

        //push() - Colocar elemento na pilha
        //pop() - Tira o elemento do topo da pilha (o último a ser inserido)
        //peek() - Verifica qual o próximo elemento da pilha
        //size() - Verifica o tamanho / quantidade de elementos da pilha

        Stack<String> stackNinja = new Stack<>();
//        stackNinja.push("Naruto Uzumaki");
//        stackNinja.push("Sasuke Uchiha");
//        stackNinja.push("Sakura Haruno");



        stackNinja.pop();








    }

}
