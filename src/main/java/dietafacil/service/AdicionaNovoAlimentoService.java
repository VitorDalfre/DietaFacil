package dietafacil.service;

import dietafacil.ConexaoComBanco;
import dietafacil.dao.AdicionaNovoAlimentoDAO;
import dietafacil.dao.ConsultaAlimentoDAO;
import dietafacil.modelo.Alimento;
import dietafacil.vo.AlimentoVO;

public class AdicionaNovoAlimentoService {

    private final AdicionaNovoAlimentoDAO adicionaNovoAlimentoDAO;
    private final ConsultaAlimentoService consultaAlimentoService;

    public AdicionaNovoAlimentoService() {
        adicionaNovoAlimentoDAO = new AdicionaNovoAlimentoDAO();
        consultaAlimentoService = new ConsultaAlimentoService();
    }

    public int adicionar(Alimento pAlimento) {
        AlimentoVO alimentoVO = pAlimento.toAlimentoVO();
        if (consultaAlimentoService.existeAlimento(pAlimento.getDescricao())) {
            return -1;
        }
        return adicionaNovoAlimentoDAO.adicionar(alimentoVO);
    }
}
