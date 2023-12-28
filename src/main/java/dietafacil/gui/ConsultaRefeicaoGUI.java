package dietafacil.gui;
import dietafacil.modelo.Refeicao;
import dietafacil.service.ConsultaRefeicaoService;
import dietafacil.shared.ConverteData;
import dietafacil.shared.MessageData;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class ConsultaRefeicaoGUI extends javax.swing.JInternalFrame {

    MaskFormatter mf;
    private AdicionaRefeicaoGUI cadastroRefeicaoGUI;
    private ConsultaRefeicaoService consultaRefeicaoService;

    public ConsultaRefeicaoGUI() {
        consultaRefeicaoService = new ConsultaRefeicaoService();
        try {
            mf = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            MessageData.invalida(title);
        }
        initComponents();
        setVisible(Boolean.TRUE);
        SwingUtilities.invokeLater(() -> {
            moveToFront();
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btConsultar = new javax.swing.JButton();
        jfData = new javax.swing.JFormattedTextField(mf);
        lbData = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRefeicao = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Consulta de Refeição");

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        jfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfDataActionPerformed(evt);
            }
        });

        lbData.setText("Data");

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        tabelaRefeicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Refeição", "Data", "Calorias (Kcal)", "Peso (g)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaRefeicao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                        .addComponent(btAdicionar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbData)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfData, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btConsultar)
                        .addComponent(btAdicionar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        String data = null;
        try{
        data = ConverteData.converte(jfData.getText());
        } catch(ParseException e){
            jfData.setText("");
            MessageData.invalida(title);
        }
        
        ArrayList<Refeicao> listaRefeicao = consultaRefeicaoService.consultar(data);
        DefaultTableModel modeloTabela = (DefaultTableModel) tabelaRefeicao.getModel();
        
        for(Refeicao ref : listaRefeicao){
            Object[] dadosTabela = {"Teste DescricaoREF", ref.getData(), ref.getCalorias(), ref.getPeso()};
            modeloTabela.addRow(dadosTabela);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void jfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfDataActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        if (Objects.isNull(cadastroRefeicaoGUI)) {
            cadastroRefeicaoGUI = new AdicionaRefeicaoGUI();
        }
        cadastroRefeicaoGUI.setVisible(Boolean.TRUE);
        DesktopManager.adicionar(cadastroRefeicaoGUI);
    }//GEN-LAST:event_btAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jfData;
    private javax.swing.JLabel lbData;
    private javax.swing.JTable tabelaRefeicao;
    // End of variables declaration//GEN-END:variables
}
