package dietafacil.modelo.Factory;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.vo.AlimentoVO;
import java.util.ArrayList;

public class AlimentoFactory {
    
    public static Alimento create(AlimentoVO pAlimento) {
        return new Alimento(pAlimento.getDescricao(), pAlimento.getCarboidrato(), pAlimento.getProteina(), pAlimento.getGordura(), pAlimento.getCalorias(), pAlimento.getPeso());
    }
    
    public static ArrayList<Alimento> createLista(ArrayList<AlimentoVO> pListaVO){
        ArrayList<Alimento> listaAlimento = new ArrayList<>();
        for(AlimentoVO alimentoVO : pListaVO){
            listaAlimento.add(AlimentoFactory.create(alimentoVO));
        }
        return listaAlimento;
    }
}
