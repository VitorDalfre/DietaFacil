package dietafacil.shared;

import javax.swing.JOptionPane;

public class MessageData {
    
    private MessageData(){
        
    }
    
    public static void invalida(String title) {
        final String MESSAGE = "Data Inv�lida!";      
        JOptionPane.showMessageDialog(null, MESSAGE, title, JOptionPane.WARNING_MESSAGE);
    }
    
}
