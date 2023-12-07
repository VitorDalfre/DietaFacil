package dietafacil.shared;

import javax.swing.JOptionPane;

public class MessageCalculo {

    private MessageCalculo() {
    }

    public static void adicionadoAoCalculo(String title) {
        final String MESSAGE = "Adicionado a Refeição!";
        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void alimentoNaoEncontrado(String title) {
        final String MESSAGE = "Alimento não Encontrado!";
        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.WARNING_MESSAGE);
    }

}
