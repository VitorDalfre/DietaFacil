package dietafacil.service;

import dietafacil.modelo.dto.AlimentoDTO;
import java.util.ArrayList;

public class CalcularRefeicaoCompletaService {
    
    public AlimentoDTO calcularRefeicao(ArrayList<AlimentoDTO> pListaAlimento){
        double totalCarboidrato = 0;
        double totalProteina = 0;
        double totalGordura = 0;
        double totalCalorias = 0;
        
        for(AlimentoDTO alimento : pListaAlimento){
            totalCarboidrato += alimento.getCarboidrato();
            totalProteina += alimento.getProteina();
            totalGordura += alimento.getGordura();
            totalCalorias += alimento.getCalorias();
        }
        return new AlimentoDTO (totalCarboidrato, totalProteina, totalGordura, totalCalorias);
    }
}
