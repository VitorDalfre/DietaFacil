package dietafacil.service;

import dietafacil.modelo.Alimento;
import java.util.ArrayList;

public class CalcularRefeicaoCompletaService {

    public Alimento calcularRefeicao(ArrayList<Alimento> pListaAlimento) {
        double totalCarboidrato = 0;
        double totalProteina = 0;
        double totalGordura = 0;
        double totalCalorias = 0;
        double totalPeso = 0;

        for (Alimento alimento : pListaAlimento) {
            totalCarboidrato += alimento.getCarboidrato();
            totalProteina += alimento.getProteina();
            totalGordura += alimento.getGordura();
            totalCalorias += alimento.getCalorias();
        }
        return new Alimento(null, totalCarboidrato, totalProteina, totalGordura, totalCalorias, totalPeso);
    }
}
