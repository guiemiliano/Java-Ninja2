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

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    private double altura = 1.80;

    //Getter tirar dados ou mostrar para o usuário eu uso GET + nome da variável
    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Setter receber valores
    public void setNome(String nome) {
        this.nome = nome;
    }

}
