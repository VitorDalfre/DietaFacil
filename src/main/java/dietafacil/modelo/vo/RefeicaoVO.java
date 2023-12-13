package dietafacil.modelo.vo;

import java.sql.Date;
import java.util.ArrayList;

public class RefeicaoVO {
    
    private final Date data;
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;
    private final double peso;
    private final ArrayList<AlimentoVO> listaAlimento;

    public RefeicaoVO(Date pDate, double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso, ArrayList<AlimentoVO> pListaAlimento) {
        this.data = pDate;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
        this.peso = pPeso;
        this.listaAlimento = pListaAlimento;
    }

    public ArrayList<AlimentoVO> getListaAlimento() {
        return listaAlimento;
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
