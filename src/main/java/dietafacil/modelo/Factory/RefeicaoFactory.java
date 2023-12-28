package dietafacil.modelo.Factory;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.Refeicao;
import dietafacil.modelo.vo.AlimentoVO;
import dietafacil.modelo.vo.RefeicaoVO;
import java.util.ArrayList;

public class RefeicaoFactory {

    public static Refeicao create(RefeicaoVO pRefeicaoVO) {
        return new Refeicao(pRefeicaoVO.getData(), pRefeicaoVO.getCarboidrato(), pRefeicaoVO.getProteina(),
                pRefeicaoVO.getGordura(), pRefeicaoVO.getCalorias(), pRefeicaoVO.getPeso(), listaVOparaLista(pRefeicaoVO.getListaAlimento()));
    }
    
    public static ArrayList<Refeicao> listaRefeicao(ArrayList<RefeicaoVO> pListaRefVO){
        ArrayList listaRefeicao = new ArrayList<>();
        for(RefeicaoVO refVO : pListaRefVO){
            Refeicao novaRef = createSemAlimento(refVO);
            listaRefeicao.add(novaRef);
        }
        return listaRefeicao;
    }

    private static ArrayList<Alimento> listaVOparaLista(ArrayList<AlimentoVO> pListaVO) {
        ArrayList<Alimento> listaAlimento = new ArrayList<>();
        for (AlimentoVO alimentoVO : pListaVO) {
            listaAlimento.add(AlimentoFactory.create(alimentoVO));
        }
        return listaAlimento;
    }
    
    private static Refeicao createSemAlimento(RefeicaoVO pRefeicaoVO) {
        return new Refeicao(pRefeicaoVO.getData(), pRefeicaoVO.getCarboidrato(), pRefeicaoVO.getProteina(),
                pRefeicaoVO.getGordura(), pRefeicaoVO.getCalorias(), pRefeicaoVO.getPeso());
    }

}
