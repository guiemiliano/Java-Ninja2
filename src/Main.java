import java.util.*;

public class Main {
    public static void main(String[] args) {
        NinjaRecord ninjaRecord = new NinjaRecord("Naruto Uzumaki",
                "naruto@email.com", 12121212);

        System.out.println(ninjaRecord.emailEmCaixaAlta());



        // Arrays
        System.out.println("----------- ARRAY ------------");

        String[] nomeNinjaArray = new String[7];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";
        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nomeNinjaArray[0] = " + nomeNinjaArray[4]);

        // Lista é um pouco mais lenta em comparação com ARRAY
        System.out.println("----------- LISTA ------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Madara Uchiha");
        System.out.println(nomeNinjaList);

        //Listas ordenadas, o último a entrar é o primeiro a sair
        //LIFO - Last In First Out
        System.out.println("----------- STACK ------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        nomeNinjaStack.push("Kakashi");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Ninja no topo (sem remover): " + nomeNinjaStack.peek());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);


        System.out.println("----------- QUEUE / FILAS ------------");
        //FIFO - First In First Out
        //Head e tail
        //Head primeiro da fila e Tail último
        //Queue faz parte de uma LinkedList
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Shikamaru");

        //Mostrar ninjas na fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        //Tirar ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na depois do poll: " + ninjasQueue);

        //Como ver o primeiro da fila HEAD
        System.out.println("Head da Fila: " + ninjasQueue.peek());

        //NÃO DA PARA DELETAR O TAIL, TEM QUE SEGUIR A FILA





    }
}
