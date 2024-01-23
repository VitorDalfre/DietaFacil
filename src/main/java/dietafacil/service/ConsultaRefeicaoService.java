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
    
    public ArrayList<Refeicao> consultarPorData(String data){
        ArrayList<Refeicao> listaAlimentos = RefeicaoFactory.listaRefeicao(consultaRefeicaoDAO.consultarPorData(data));
        return listaAlimentos;
    }
    
    public Refeicao consultarRefeicao(int pId){
        Refeicao ref = RefeicaoFactory.create(consultaRefeicaoDAO.consultarRefeicao(pId));
        return ref;
    }

}
