package dietafacil.service;

import dietafacil.dao.ConsultaAlimentoDAO;
import dietafacil.modelo.Alimento;
import dietafacil.vo.AlimentoVO;

public class ConsultaAlimentoService {

    private final ConsultaAlimentoDAO consultaAlimentoDAO;

    public ConsultaAlimentoService() {
        consultaAlimentoDAO = new ConsultaAlimentoDAO();
    }

    public Alimento consultarPorDescricao(String pDescricaoAlimento){
        AlimentoVO alimentoVO = consultaAlimentoDAO.consultarPorDescricao(pDescricaoAlimento);
        return  alimentoVO.toAlimento();
    }

    public boolean existeAlimento(String pDescricaoAlimento) {
        return consultaAlimentoDAO.existeNoBanco(pDescricaoAlimento);
    }
}
