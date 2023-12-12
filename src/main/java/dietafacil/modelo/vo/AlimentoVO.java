package dietafacil.modelo.vo;

import dietafacil.modelo.Alimento;

public class AlimentoVO {

    private final String descricao;
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;

    public AlimentoVO(String pDescricao, double pCarboidrato, double pProteina, double pGordura, double pCalorias) {
        this.descricao = pDescricao;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
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

    public Alimento toAlimento(){
        return new Alimento(descricao, carboidrato, proteina, gordura, calorias);
    }
}
