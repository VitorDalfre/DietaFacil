package dietafacil.service;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.dto.AlimentoDTO;

public class CalcularMacrosRefeicaoService {
 
    public AlimentoDTO calcularMacros(Alimento pAlimento, double pPeso) {
        double carboidrato = calcularCarboidratoAlimento(pAlimento.getCarboidrato(), pPeso);
        double proteina = calcularProteinaAlimento(pAlimento.getProteina(), pPeso);
        double gordura = calcularGorduraAlimento(pAlimento.getGordura(), pPeso);
        double calorias = calcularCaloriasAlimento(pAlimento.getCalorias(), pPeso);

        return new AlimentoDTO (pAlimento.getDescricao(), carboidrato, proteina, gordura, calorias, pPeso);
    }
    
    private double calcularCarboidratoAlimento(double pCarboidrato, double pPeso){
        return (pCarboidrato/100) * pPeso;
    }
    
    private double calcularProteinaAlimento(double pProteina, double pPeso){
        return (pProteina / 100) * pPeso;
    }
    
    private double calcularGorduraAlimento(double pGordura, double pPeso){
        return (pGordura/100) * pPeso;
    }
    
    private double calcularCaloriasAlimento(double pCalorias, double pPeso){
        return (pCalorias/100) * pPeso;
    }

}
