package dietafacil.shared;

import javax.swing.JOptionPane;


public class MessageRefeicao {
    
        private MessageRefeicao() {
    }

    public static void refeicaoSemAlimento(String title) {
        final String MESSAGE = "Refei��o sem Alimentos!";
        
        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.WARNING_MESSAGE);
    }
    
}
