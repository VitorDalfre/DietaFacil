package dietafacil.modelo.Factory;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.vo.AlimentoVO;

public class AlimentoVOFactory {

    private AlimentoVOFactory() {
    }

    public static AlimentoVO create(Alimento pAlimento) {
        return new AlimentoVO(pAlimento.getDescricao(), pAlimento.getCarboidrato(), pAlimento.getProteina(), pAlimento.getGordura(), pAlimento.getCalorias(), pAlimento.getPeso());
    }

}
