package dietafacil.modelo;

import java.sql.Date;

public class Refeicao {

    private final Date data;
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;
    private final double peso;

    public Refeicao(Date pDate, double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso) {
        this.data = pDate;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
        this.peso = pPeso;
    }

    public Date getData() {
        return data;
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
