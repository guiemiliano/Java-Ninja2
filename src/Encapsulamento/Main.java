package Encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha",
                17, 15, 1.89);

        System.out.println(naruto.getNome());

        Missoes missao = new Missoes("Capturar Gato", RankDeMissoes.D);
        missao.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Deidara", RankDeMissoes.A);
        missao2.exibirDetalhes();



         */

        //Arrays
        //São estáticos e não alteram de tamanho!
        //caso eu queira aumentar devo inserir mais espaço na sua declaração/atribuição
        //Printam a referência do objeto na memória, caso eu coloque seu nome sem seu index

        String[] ninjas = new String[3];

        ninjas[0] = "Sasuke Uchiha";
        ninjas[1] = "Kakashi Hatake";
        ninjas[2] = "Tobirama Senju";

        System.out.println("ninjas = " + ninjas[0]);


        //Listas (MAIS UTILIZADAS) é importado do java.util
        //Não são estáticas, elas podem aumentar e diminuir
        //é um array com "super poderes", a lista cresce ou diminuí automaticamente
        //Usamos muito, pois atualmente não é tão necessário enxugar a memória.
        //Os computadores atuais são bem melhores em desempenho e tem mais memória

        List<String> ninjasList = new ArrayList<>();

    }
}