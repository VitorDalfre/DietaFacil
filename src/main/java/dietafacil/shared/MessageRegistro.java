package dietafacil.shared;

import javax.swing.JOptionPane;

public class MessageRegistro {

    private MessageRegistro() {
    }

    public static void naoEncontrado(String title) {
        final String MESSAGE = "Registro não Encontrado!";

        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.WARNING_MESSAGE);
    }

}
