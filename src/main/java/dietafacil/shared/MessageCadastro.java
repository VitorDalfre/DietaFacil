package dietafacil.shared;

import javax.swing.JOptionPane;

public class MessageCadastro {

    private MessageCadastro() {
    }

    public static void jaCadastrado(String title) {
        final String MESSAGE = "Produto ja Cadastrado!";
        
        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.WARNING_MESSAGE);
    }

    public static void salvo(String title) {
        final String MESSAGE = "Salvo com Sucesso!";
        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
