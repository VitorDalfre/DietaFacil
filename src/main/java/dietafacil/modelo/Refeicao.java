package dietafacil.modelo;

import java.util.ArrayList;

public class Refeicao {

    private final int id;
    private final String data;
    private final String opcaoRefeicao;
    private final double carboidrato;
    private final double proteina;
    private final double gordura;
    private final double calorias;
    private final double peso;
    private final ArrayList<Alimento> listaAlimento;

    public Refeicao(int pId, String pDate, String pOpcaoRefeicao, double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso, ArrayList<Alimento> pListaAlimento) {
        this.id = pId;
        this.data = pDate;
        this.opcaoRefeicao = pOpcaoRefeicao;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
        this.peso = pPeso;
        this.listaAlimento = pListaAlimento;
    }

    public int getId() {
        return id;
    }

    public Refeicao(String pDate, String pOpcaoRefeicao, double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso, ArrayList<Alimento> pListaAlimento) {
        this.data = pDate;
        this.opcaoRefeicao = pOpcaoRefeicao;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
        this.peso = pPeso;
        this.listaAlimento = pListaAlimento;
        this.id = 0;
    }

    public Refeicao(int pId, String pDate, String pOpcaoRefeicao, double pCarboidrato, double pProteina, double pGordura, double pCalorias, double pPeso) {
        this.data = pDate;
        this.carboidrato = pCarboidrato;
        this.proteina = pProteina;
        this.gordura = pGordura;
        this.calorias = pCalorias;
        this.peso = pPeso;
        this.opcaoRefeicao = pOpcaoRefeicao;
        this.listaAlimento = null;
        this.id = pId;
    }

    public String getOpcaoRefeicao() {
        return opcaoRefeicao;
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
