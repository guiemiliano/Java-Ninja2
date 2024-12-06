package Encapsulamento;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha",
                17, 15, 1.89);

        System.out.println(naruto.getNome());

        Missoes missao = new Missoes("Capturar Gato", RankDeMissoes.D);
        missao.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Deidara", RankDeMissoes.A);
        missao2.exibirDetalhes();

    }
}