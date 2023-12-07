package dietafacil.service;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.dto.AlimentoDTO;

public class CalcularMacrosRefeicaoService {
 
    public AlimentoDTO calcularMacros(Alimento pAlimento, double pPeso) {
        double carboidrato = calcularCarboidratoAlimento(pAlimento.getCarboidrato(), pPeso);
        double proteina = calcularProteinaAlimento(pAlimento.getProteina(), pPeso);
        double gordura = calcularGorduraAlimento(pAlimento.getGordura(), pPeso);
        double calorias = calcularCaloriasAlimento(pAlimento.getCalorias(), pPeso);
        
        return new AlimentoDTO (carboidrato, proteina, gordura, calorias);
    }
    
    private double calcularCarboidratoAlimento(double pCarboidrato, double pPeso){
        double carboidratoPorGrama = pCarboidrato/100;
        return carboidratoPorGrama * pPeso;
    }
    
    private double calcularProteinaAlimento(double pProteina, double pPeso){
        double ProteinaPorGrama = pProteina/100;
        return ProteinaPorGrama * pPeso;
    }
    
    private double calcularGorduraAlimento(double pGordura, double pPeso){
        double gorduraPorGrama = pGordura/100;
        return gorduraPorGrama * pPeso;
    }
    
    private double calcularCaloriasAlimento(double pCalorias, double pPeso){
        double caloriaPorGrama = pCalorias/100;
        return caloriaPorGrama * pPeso;
    }

}
