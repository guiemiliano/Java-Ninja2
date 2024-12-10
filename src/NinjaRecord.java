/*  Basicamente ele resume e enxuga o código de uma forma absurda e é muito útil

    O Record em Java foi introduzido no Java 14 como uma maneira simples e concisa
    de declarar classes imutáveis que servem para conter dados. Ele faz parte do
    pacote java.lang e é projetado para reduzir o código boilerplate associado a
    classes que simplesmente armazenam dados, como getters, setters, equals(),
    hashCode(), e toString().
 */
public record NinjaRecord(String nome, String email, int numero) {

    public String emailEmCaixaAlta(){
        return email.toUpperCase();
    }

}
//Todos os atributos são "final" por padrão
//Records não tem Setter, não da para alterar
//não precisa usar getter
//Usar para coisas que não necessitam de tanta mudança


