/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietafacil.shared;

import javax.swing.JOptionPane;

/**
 *
 * @author Desenvolvimento
 */
public class Message {

    private Message() {
    }

    public static void warning(String title) {
        final String MESSAGE = "Produto ja Cadastrado!";
        
        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.WARNING_MESSAGE);
    }

    public static void info(String title) {
        final String MESSAGE = "Salvo com Sucesso!";
        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
