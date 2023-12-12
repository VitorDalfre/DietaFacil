package dietafacil.service;

import dietafacil.dao.AdicionaAlimentoDAO;
import dietafacil.modelo.Alimento;
import dietafacil.modelo.Factory.AlimentoVOFactory;
import dietafacil.modelo.vo.AlimentoVO;

public class AdicionaAlimentoService {

    private final AdicionaAlimentoDAO adicionaAlimentoDAO;
    private final ConsultaAlimentoService consultaAlimentoService;

    public AdicionaAlimentoService() {
        adicionaAlimentoDAO = new AdicionaAlimentoDAO();
        consultaAlimentoService = new ConsultaAlimentoService();
    }

    public int adicionar(Alimento pAlimento) {
        AlimentoVO alimentoVO = AlimentoVOFactory.create(pAlimento);
        if (consultaAlimentoService.existeAlimento(pAlimento.getDescricao())) {
            return -1;
        }
        return adicionaAlimentoDAO.adicionar(alimentoVO);
    }
}
