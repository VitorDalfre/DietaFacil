import dietafacil.dao.CriarTabelasAlimentoDAO;
import dietafacil.dao.CriarTabelasRefeicaoDAO;
import dietafacil.gui.MenuGUI;

public class Main {

    public static void main(String[] args) {

        CriarTabelasRefeicaoDAO a = new CriarTabelasRefeicaoDAO();
        CriarTabelasAlimentoDAO aa = new CriarTabelasAlimentoDAO();
        a.criarTabelaRefeicao();
        aa.criarTabelaAlimento();
        
        
        MenuGUI menu = new MenuGUI();
        
    }
}
