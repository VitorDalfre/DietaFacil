package dietafacil.vo;

import dietafacil.modelo.Alimento;

public class AlimentoVO {

    private final String descricao;
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;

    public AlimentoVO(String descricao, double carboidrato, double proteina, double gordura, double calorias) {
        this.descricao = descricao;
        this.carboidrato = carboidrato;
        this.proteina = proteina;
        this.gordura = gordura;
        this.calorias = calorias;
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
