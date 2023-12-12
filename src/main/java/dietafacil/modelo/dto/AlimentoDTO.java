package dietafacil.modelo.dto;

public class AlimentoDTO {

    private final String descricao;
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;
    private final double peso;

    public AlimentoDTO(String pDescricao, double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso) {
        this.descricao = pDescricao;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
        this.peso = pPeso;
    }

    public AlimentoDTO(double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso) {
        this.descricao = null;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
        this.peso = pPeso;
    }

    public double getCarboidrato() {
        return Math.round(carboidrato * 100.00) / 100.00;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getProteina() {
        return Math.round(proteina * 100.00) / 100.00;
    }

    public double getGordura() {
        return Math.round(gordura * 100.00) / 100.00;
    }

    public double getCalorias() {
        return Math.round(calorias * 100.00) / 100.00;
    }

    public double getPeso() {
        return peso;
    }

}
