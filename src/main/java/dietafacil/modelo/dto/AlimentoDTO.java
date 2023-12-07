package dietafacil.modelo.dto;

public class AlimentoDTO {
    
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;
    
    public AlimentoDTO(double pCarboidrato, double pProteina, double pGordura, double pCalorias){
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
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
    
    
    
}
