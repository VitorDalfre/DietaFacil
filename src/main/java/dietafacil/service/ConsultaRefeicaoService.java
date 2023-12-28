package dietafacil.service;

import dietafacil.dao.ConsultaRefeicaoDAO;
import dietafacil.modelo.Factory.RefeicaoFactory;
import dietafacil.modelo.Refeicao;
import java.util.ArrayList;

public class ConsultaRefeicaoService {
    
    private final ConsultaRefeicaoDAO consultaRefeicaoDAO;
    
    public ConsultaRefeicaoService() {
           consultaRefeicaoDAO = new ConsultaRefeicaoDAO();
    }
    
    public ArrayList<Refeicao> consultar(String data){
        ArrayList<Refeicao> listaAlimentos = RefeicaoFactory.listaRefeicao(consultaRefeicaoDAO.consultar(data));
        return listaAlimentos;
    }

}
