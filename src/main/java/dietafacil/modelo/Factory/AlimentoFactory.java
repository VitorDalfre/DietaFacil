package dietafacil.modelo.Factory;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.vo.AlimentoVO;

public class AlimentoFactory {
    
    public static Alimento create(AlimentoVO pAlimento) {
        return new Alimento(pAlimento.getDescricao(), pAlimento.getCarboidrato(), pAlimento.getProteina(), pAlimento.getGordura(), pAlimento.getCalorias());
    }
}
