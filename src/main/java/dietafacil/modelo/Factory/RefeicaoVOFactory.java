package dietafacil.modelo.Factory;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.Refeicao;
import dietafacil.modelo.vo.AlimentoVO;
import dietafacil.modelo.vo.RefeicaoVO;
import java.util.ArrayList;

public class RefeicaoVOFactory {

    public static RefeicaoVO create(Refeicao pRefeicao) {
        return new RefeicaoVO(pRefeicao.getId(), pRefeicao.getData(), pRefeicao.getOpcaoRefeicao() ,pRefeicao.getCarboidrato(), pRefeicao.getProteina(),
                pRefeicao.getGordura(), pRefeicao.getCalorias(), pRefeicao.getPeso(), listaParaListaVO(pRefeicao.getListaAlimento()));
    }

    private static ArrayList<AlimentoVO> listaParaListaVO(ArrayList<Alimento> pLista) {
        ArrayList<AlimentoVO> listaAlimento = new ArrayList<>();
        for (Alimento alimento : pLista) {
            listaAlimento.add(AlimentoVOFactory.create(alimento));
        }
        return listaAlimento;
    }

}
