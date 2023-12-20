import dietafacil.dao.CriarTabelasRefeicaoDAO;
import dietafacil.gui.MenuGUI;

public class Main {

    public static void main(String[] args) {

        CriarTabelasRefeicaoDAO a = new CriarTabelasRefeicaoDAO();
        a.criarTabelaRefeicao();
        
        MenuGUI menu = new MenuGUI();
        
    }
}
