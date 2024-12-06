package Encapsulamento;
/*
    Enum é para algo que não vai mudar,
    por exemplo, dias da semana, meios de pagamento etc
    também é separado por, e cada enum deve ter uma única útilidade
    coisas que se relacionam.
 */
public enum RankDeMissoes {

    D("Gennin", 2),
    C("Gennin, Chuunin",4),
    B("Chuunin",6),
    A("Chuunin,Jounin", 10),
    S("Jounin, Hokage", 15);

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    private String descricao;
    private int dificuldade;


}
