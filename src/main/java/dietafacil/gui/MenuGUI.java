package dietafacil.gui;

import java.util.Objects;

public class MenuGUI extends javax.swing.JFrame {
    
    private ConsultaAlimentoGUI consultaAlimentoGUI;
    private CalcularMacrosRefeicaoGUI calcularMacrosRefeicaoGUI;
            
    public MenuGUI() {
        initComponents();
        setVisible(Boolean.TRUE);
        DesktopManager.setDesktop(this.desktop);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jConsulta = new javax.swing.JMenu();
        jAlimento = new javax.swing.JMenuItem();
        jRefeicao = new javax.swing.JMenu();
        jCalcularMacro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DietaFacil");
        setExtendedState(1);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jConsulta.setMnemonic('C');
        jConsulta.setText("Consulta");

        jAlimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jAlimento.setText("Alimento");
        jAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlimentoActionPerformed(evt);
            }
        });
        jConsulta.add(jAlimento);

        jMenuBar1.add(jConsulta);

        jRefeicao.setText("Refeição");

        jCalcularMacro.setText("Calcular Macros");
        jCalcularMacro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalcularMacroActionPerformed(evt);
            }
        });
        jRefeicao.add(jCalcularMacro);

        jMenuBar1.add(jRefeicao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlimentoActionPerformed
        if(Objects.isNull(consultaAlimentoGUI)){
        consultaAlimentoGUI = new ConsultaAlimentoGUI();
        }
        consultaAlimentoGUI.setVisible(Boolean.TRUE);
        DesktopManager.adicionar(consultaAlimentoGUI);
    }//GEN-LAST:event_jAlimentoActionPerformed

    private void jCalcularMacroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalcularMacroActionPerformed
        if(Objects.isNull(calcularMacrosRefeicaoGUI)){
            calcularMacrosRefeicaoGUI = new CalcularMacrosRefeicaoGUI();
        }
        calcularMacrosRefeicaoGUI.setVisible(Boolean.TRUE);
        DesktopManager.adicionar(calcularMacrosRefeicaoGUI);
    }//GEN-LAST:event_jCalcularMacroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem jAlimento;
    private javax.swing.JMenuItem jCalcularMacro;
    private javax.swing.JMenu jConsulta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jRefeicao;
    // End of variables declaration//GEN-END:variables
}
