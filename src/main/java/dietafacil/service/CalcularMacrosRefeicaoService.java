package dietafacil.service;

import dietafacil.modelo.Alimento;

public class CalcularMacrosRefeicaoService {
 
    public Alimento calcularMacros(Alimento pAlimento) {
        double carboidrato = calcularCarboidratoAlimento(pAlimento.getCarboidrato(), pAlimento.getPeso());
        double proteina = calcularProteinaAlimento(pAlimento.getProteina(), pAlimento.getPeso());
        double gordura = calcularGorduraAlimento(pAlimento.getGordura(), pAlimento.getPeso());
        double calorias = calcularCaloriasAlimento(pAlimento.getCalorias(), pAlimento.getPeso());

        return new Alimento (pAlimento.getDescricao(), carboidrato, proteina, gordura, calorias, pAlimento.getPeso());
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
