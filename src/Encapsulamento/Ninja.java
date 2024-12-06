package Encapsulamento;

/*
    Por padrão os atributos são public, não preciso
    escrever public.

    getNome = pegar
    setNome = definir
 */
public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private double altura = 1.80;

    //Getter tirar dados ou mostrar para o usuário eu uso GET + nome da variável
    public String getNome() {
        return nome;
    }

    //Setter receber valores
    public void setNome(String nome) {
        this.nome = nome;
    }

}
