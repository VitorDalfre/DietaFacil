package dietafacil.service;

import dietafacil.dao.ConsultaAlimentoDAO;
import dietafacil.modelo.Alimento;
import dietafacil.modelo.Factory.AlimentoFactory;
import dietafacil.modelo.vo.AlimentoVO;

import java.util.ArrayList;

public class ConsultaAlimentoService {

    private final ConsultaAlimentoDAO consultaAlimentoDAO;

    public ConsultaAlimentoService() {
        consultaAlimentoDAO = new ConsultaAlimentoDAO();
    }
    
    public ArrayList<Alimento> consultaTodosAlimento(){
        ArrayList<AlimentoVO> lista = consultaAlimentoDAO.consultaTodosAlimentos();
        return AlimentoFactory.createLista(lista);
    }

    public Alimento consultarPorDescricao(String pDescricaoAlimento){
        AlimentoVO alimentoVO = consultaAlimentoDAO.consultaPorDescricao(pDescricaoAlimento);
        return  AlimentoFactory.create(alimentoVO);
    }

    public boolean existeAlimento(String pDescricaoAlimento) {
        return consultaAlimentoDAO.existeNoBanco(pDescricaoAlimento);
    }
}
