package dietafacil.service;

import dietafacil.dao.AdicionaRefeicaoDAO;
import dietafacil.modelo.Factory.RefeicaoVOFactory;
import dietafacil.modelo.Refeicao;
import dietafacil.modelo.vo.RefeicaoVO;

public class AdicionaRefeicaoService {
    
    private final AdicionaRefeicaoDAO adicionaRefeicaoDAO;
    
    public AdicionaRefeicaoService(){
        this.adicionaRefeicaoDAO = new AdicionaRefeicaoDAO();
    }

    public void adicionar(Refeicao pRefeicao){
        RefeicaoVO refeicaoVO = RefeicaoVOFactory.create(pRefeicao);
        adicionaRefeicaoDAO.adicionaAlimentoRefeicao(refeicaoVO);
    }
}
