package dietafacil.service;

import dietafacil.dao.ConsultaAlimentoDAO;
import dietafacil.modelo.Alimento;
import dietafacil.modelo.Factory.AlimentoFactory;

public class AdicionaAlimentoRefeicaoService {
    
    private final ConsultaAlimentoDAO consultaAlimentoDAO;

    public AdicionaAlimentoRefeicaoService() {
        this.consultaAlimentoDAO = new ConsultaAlimentoDAO();
    }    
   
    public Alimento adicionar(String pDescricaoAlimento, double peso){
        if(consultaAlimentoDAO.existeNoBanco(pDescricaoAlimento)){
            Alimento alimento = AlimentoFactory.create(consultaAlimentoDAO.consultaPorDescricao(pDescricaoAlimento));
            alimento.setPeso(peso);
            return alimento;
        }
        return null;
    }  
}
