package dietafacil.gui;

import dietafacil.modelo.Refeicao;
import dietafacil.service.ConsultaRefeicaoService;
import dietafacil.shared.ConverteData;
import dietafacil.shared.MessageData;
import dietafacil.shared.MessageRegistro;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class ConsultaRefeicaoGUI extends javax.swing.JInternalFrame {
    
    MaskFormatter mf;
    private AdicionaRefeicaoGUI adicionaRefeicaoGUI;
    private ConsultaRefeicaoService consultaRefeicaoService;
    private RefeicaoGUI refeicaoGUI;
    
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
                "ID", "Refeição", "Data", "Calorias (Kcal)", "Peso (g)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRefeicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRefeicaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRefeicao);
        if (tabelaRefeicao.getColumnModel().getColumnCount() > 0) {
            tabelaRefeicao.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaRefeicao.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(btConsultar))
                            .addComponent(lbData))
                        .addGap(290, 290, 290)
                        .addComponent(btAdicionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btConsultar)
                        .addComponent(btAdicionar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        String data = null;
        try {
            data = ConverteData.converte(jfData.getText());
        } catch (ParseException e) {
            jfData.setText("");
            MessageData.invalida(title);
            return;
        }
        
        ArrayList<Refeicao> listaRefeicao = consultaRefeicaoService.consultarPorData(data);
        DefaultTableModel modeloTabela = (DefaultTableModel) tabelaRefeicao.getModel();
        modeloTabela.setNumRows(0);
        
        if (!listaRefeicao.isEmpty()) {
            for (Refeicao ref : listaRefeicao) {
                Object[] dadosTabela = {ref.getId(), ref.getOpcaoRefeicao(), ref.getData(), ref.getCalorias(), ref.getPeso()};
                modeloTabela.addRow(dadosTabela);
            }
        } else {
            MessageRegistro.naoEncontrado(title);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void jfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfDataActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        if (Objects.isNull(adicionaRefeicaoGUI)) {
            adicionaRefeicaoGUI = new AdicionaRefeicaoGUI();
        }
        DesktopManager.adicionar(adicionaRefeicaoGUI);
        adicionaRefeicaoGUI.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void tabelaRefeicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRefeicaoMouseClicked
        Object id = tabelaRefeicao.getValueAt(tabelaRefeicao.getSelectedRow(), 0);
        int idRef = (int) id;
        refeicaoGUI = new RefeicaoGUI(idRef);
        DesktopManager.adicionar(refeicaoGUI);
    }//GEN-LAST:event_tabelaRefeicaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jfData;
    private javax.swing.JLabel lbData;
    private javax.swing.JTable tabelaRefeicao;
    // End of variables declaration//GEN-END:variables
}
