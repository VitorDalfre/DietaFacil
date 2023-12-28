package dietafacil.modelo.vo;

public class AlimentoVO {

    private final String descricao;
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;
    private final double peso;

    public AlimentoVO(String pDescricao, double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso) {
        this.descricao = pDescricao;
        this.carboidrato = pCarboidrato * 100 / 100;
        this.proteina = pProteina * 100 / 100;
        this.gordura = pGordura * 100 / 100;
        this.calorias = pCalorias * 100 / 100;
        this.peso = pPeso * 100 / 100;
    }

    public AlimentoVO(String pDescricao, double pCarboidrato, double pProteina, double pGordura, double pCalorias) {
        this.descricao = pDescricao;
        this.carboidrato = pCarboidrato * 100 / 100;
        this.proteina = pProteina * 100 / 100;
        this.gordura = pGordura * 100 / 100;
        this.calorias = pCalorias * 100 / 100;
        this.peso = 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getCarboidrato() {
        return carboidrato;
    }

    public double getProteina() {
        return proteina;
    }

    public double getGordura() {
        return gordura;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPeso() {
        return peso;
    }

}
