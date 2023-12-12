package dietafacil.gui;

import dietafacil.modelo.dto.AlimentoDTO;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class MostrarValoresRefeicaoGUI extends javax.swing.JInternalFrame {

    public MostrarValoresRefeicaoGUI() {
        initComponents();
        setVisible(Boolean.TRUE);
        SwingUtilities.invokeLater(() -> {
            moveToFront();
        });
        setMaximizable(Boolean.TRUE);
        setClosable(Boolean.TRUE);
    }

    public void mostraValoresTotais(AlimentoDTO pAlimentoDTO, ArrayList<AlimentoDTO> pListaAlimento) {
        pnCarboidrato.setText(String.valueOf(pAlimentoDTO.getCarboidrato()));
        pnProteina.setText(String.valueOf(pAlimentoDTO.getProteina()));
        pnGordura.setText(String.valueOf(pAlimentoDTO.getGordura()));
        pnCalorias.setText(String.valueOf(pAlimentoDTO.getCalorias()));

        adicionaAlimentoTabela(pListaAlimento);
    }

    private void adicionaAlimentoTabela(ArrayList<AlimentoDTO> pListaAlimento) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlimentos.getModel();
        modelo.setNumRows(0);
        for (AlimentoDTO alimento : pListaAlimento) {
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
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tabelaAlimentos);
        if (tabelaAlimentos.getColumnModel().getColumnCount() > 0) {
            tabelaAlimentos.getColumnModel().getColumn(0).setMaxWidth(550);
            tabelaAlimentos.getColumnModel().getColumn(1).setMaxWidth(200);
            tabelaAlimentos.getColumnModel().getColumn(2).setMaxWidth(200);
            tabelaAlimentos.getColumnModel().getColumn(3).setMaxWidth(200);
            tabelaAlimentos.getColumnModel().getColumn(4).setMaxWidth(200);
            tabelaAlimentos.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCarboidrato))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProteina))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGordura))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCalorias)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 221, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCarboidrato)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbGordura)
                            .addComponent(lbProteina)
                            .addComponent(lbCalorias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbCalorias;
    private javax.swing.JLabel lbCarboidrato;
    private javax.swing.JLabel lbGordura;
    private javax.swing.JLabel lbProteina;
    private javax.swing.JTextPane pnCalorias;
    private javax.swing.JTextPane pnCarboidrato;
    private javax.swing.JTextPane pnGordura;
    private javax.swing.JTextPane pnProteina;
    private javax.swing.JTable tabelaAlimentos;
    // End of variables declaration//GEN-END:variables

    void mostraValores(AlimentoDTO calcularRefeicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
