package dietafacil.modelo;

import java.sql.Date;
import java.util.ArrayList;

public class Refeicao {

    private final String data;
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;
    private final double peso;
    private final ArrayList<Alimento> listaAlimento;

    public Refeicao(String pDate, double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso, ArrayList<Alimento> pListaAlimento) {
        this.data = pDate;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
        this.peso = pPeso;
        this.listaAlimento = pListaAlimento;
    }

    public String getData() {
        return data;
    }

    public ArrayList<Alimento> getListaAlimento() {
        return listaAlimento;
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
