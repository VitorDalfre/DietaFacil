package dietafacil.modelo.enums;

public enum OpcaoRefeicao {

    CAFE_DA_MANHA(1, "CAFÉ DA MANHÃ"),
    LANCHE_DA_MANHA(2, "LANCHE DA MANHÃ"),
    ALMOCO(3, "ALMOCO"),
    CAFE_DA_TARDE(4, "CAFÉ DA TARDE"),
    JANTA(5, "JANTA"),
    CEIA(6, "CEIA");

    private final int id;
    private final String descricao;

    private OpcaoRefeicao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static String[] getDescricoes() {
        OpcaoRefeicao[] opcoes = values();
        String[] descricoes = new String[opcoes.length];

        for (int i = 0; i < opcoes.length; i++) {
            descricoes[i] = opcoes[i].getDescricao();
        }
        return descricoes;
    }

}
