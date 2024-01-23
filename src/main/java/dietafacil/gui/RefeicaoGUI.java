package dietafacil.gui;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.Refeicao;
import dietafacil.service.ConsultaRefeicaoService;
import dietafacil.shared.MessageData;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class RefeicaoGUI extends javax.swing.JInternalFrame {
    
    MaskFormatter mf;
    private final ConsultaRefeicaoService consultaRefeicaoService;

    public RefeicaoGUI() {
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
        setMaximizable(Boolean.TRUE);
        setClosable(Boolean.TRUE);
    }
    
    public RefeicaoGUI(int pIdRefeicao){
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
        setMaximizable(Boolean.TRUE);
        setClosable(Boolean.TRUE);
        
        metodoQueMostraRef(pIdRefeicao);
    }
    
    public void metodoQueMostraRef(int pIdRefeicao){
        Refeicao refeicao = consultaRefeicaoService.consultarRefeicao(pIdRefeicao);
        mostraValoresRefeicao(refeicao);
    }
    
    private void mostraValoresRefeicao(Refeicao pRefeicao) {
        pnCarboidrato.setText(String.valueOf(pRefeicao.getCarboidrato()));
        pnProteina.setText(String.valueOf(pRefeicao.getProteina()));
        pnGordura.setText(String.valueOf(pRefeicao.getGordura()));
        pnCalorias.setText(String.valueOf(pRefeicao.getCalorias()));
        jfData.setValue(pRefeicao.getData());
        pnRefeicao.setText(pRefeicao.getOpcaoRefeicao());

        adicionaAlimentoTabela(pRefeicao.getListaAlimento());
    }              

    public void mostraValoresTotais(Alimento pValoresRefeicao, ArrayList<Alimento> pListaAlimento, String pRefeicao ,String pData) {
        pnCarboidrato.setText(String.valueOf(pValoresRefeicao.getCarboidrato()));
        pnProteina.setText(String.valueOf(pValoresRefeicao.getProteina()));
        pnGordura.setText(String.valueOf(pValoresRefeicao.getGordura()));
        pnCalorias.setText(String.valueOf(pValoresRefeicao.getCalorias()));
        jfData.setValue(pData); 
        pnRefeicao.setText(pRefeicao);

        adicionaAlimentoTabela(pListaAlimento);
    }

    private void adicionaAlimentoTabela(ArrayList<Alimento> pListaAlimento) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlimentos.getModel();
        modelo.setNumRows(0);
        for (Alimento alimento : pListaAlimento) {
            Object[] dados = {alimento.getDescricao(), alimento.getCarboidrato(), alimento.getProteina(), alimento.getGordura(), alimento.getCalorias(), alimento.getPeso()};
            modelo.addRow(dados);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnCarboidrato = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnProteina = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnCalorias = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        pnGordura = new javax.swing.JTextPane();
        lbCarboidrato = new javax.swing.JLabel();
        lbProteina = new javax.swing.JLabel();
        lbGordura = new javax.swing.JLabel();
        lbCalorias = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaAlimentos = new javax.swing.JTable();
        lbData = new javax.swing.JLabel();
        jfData = new javax.swing.JFormattedTextField(mf);
        jScrollPane7 = new javax.swing.JScrollPane();
        pnRefeicao = new javax.swing.JTextPane();
        lbRefeicao = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setMaximizable(true);
        setTitle("Refeição");
        setToolTipText("");
        setRequestFocusEnabled(false);
        setVisible(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        pnCarboidrato.setEditable(false);
        jScrollPane2.setViewportView(pnCarboidrato);

        jScrollPane3.setEnabled(false);

        pnProteina.setEditable(false);
        jScrollPane3.setViewportView(pnProteina);

        pnCalorias.setEditable(false);
        jScrollPane4.setViewportView(pnCalorias);

        pnGordura.setEditable(false);
        jScrollPane5.setViewportView(pnGordura);

        lbCarboidrato.setText("Carboidrato");

        lbProteina.setText("Proteina");

        lbGordura.setText("Gordura");

        lbCalorias.setText("Calorias (Kcal)");

        tabelaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alimento", "Carboidrato", "Proteina", "Gordura", "Calorias (Kcal)", "Peso (g)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAlimentos.setToolTipText("");
        jScrollPane6.setViewportView(tabelaAlimentos);
        if (tabelaAlimentos.getColumnModel().getColumnCount() > 0) {
            tabelaAlimentos.getColumnModel().getColumn(0).setMaxWidth(550);
            tabelaAlimentos.getColumnModel().getColumn(1).setMaxWidth(200);
            tabelaAlimentos.getColumnModel().getColumn(2).setMaxWidth(200);
            tabelaAlimentos.getColumnModel().getColumn(3).setMaxWidth(200);
            tabelaAlimentos.getColumnModel().getColumn(4).setMaxWidth(200);
            tabelaAlimentos.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        lbData.setText("Data");

        jfData.setEditable(false);
        jfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfDataActionPerformed(evt);
            }
        });

        pnRefeicao.setEnabled(false);
        pnRefeicao.setOpaque(false);
        jScrollPane7.setViewportView(pnRefeicao);

        lbRefeicao.setText("Refeição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCarboidrato))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbProteina)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbGordura)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCalorias)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbData)
                                    .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRefeicao)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbData)
                        .addGap(9, 9, 9)
                        .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbRefeicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProteina, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCarboidrato)
                                .addComponent(lbGordura)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCalorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFormattedTextField jfData;
    private javax.swing.JLabel lbCalorias;
    private javax.swing.JLabel lbCarboidrato;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbGordura;
    private javax.swing.JLabel lbProteina;
    private javax.swing.JLabel lbRefeicao;
    private javax.swing.JTextPane pnCalorias;
    private javax.swing.JTextPane pnCarboidrato;
    private javax.swing.JTextPane pnGordura;
    private javax.swing.JTextPane pnProteina;
    private javax.swing.JTextPane pnRefeicao;
    private javax.swing.JTable tabelaAlimentos;
    // End of variables declaration//GEN-END:variables

}
