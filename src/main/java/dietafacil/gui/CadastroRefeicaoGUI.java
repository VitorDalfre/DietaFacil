package dietafacil.gui;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.dto.AlimentoDTO;
import dietafacil.service.CalcularMacrosRefeicaoService;
import dietafacil.service.CalcularRefeicaoCompletaService;
import dietafacil.service.ConsultaAlimentoService;
import dietafacil.shared.MessageCalculo;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class CadastroRefeicaoGUI extends javax.swing.JInternalFrame {

    private final ConsultaAlimentoService consultaAlimentoService;
    private final CalcularMacrosRefeicaoService calcularMacrosRefeicaoService;
    private final CalcularRefeicaoCompletaService calcularRefeicaoCompletaService;
    private MostrarValoresRefeicaoGUI mostrarValoresRefeicaoGUI;
    private final ArrayList<AlimentoDTO> alimentosCalculados = new ArrayList<>();

    public CadastroRefeicaoGUI() {
        initComponents();
        setVisible(Boolean.TRUE);
        SwingUtilities.invokeLater(() -> {
            moveToFront();
        });
        consultaAlimentoService = new ConsultaAlimentoService();
        calcularMacrosRefeicaoService = new CalcularMacrosRefeicaoService();
        calcularRefeicaoCompletaService = new CalcularRefeicaoCompletaService();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPeso = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAlimento = new javax.swing.JTextPane();
        lbAlimento = new javax.swing.JLabel();
        lbPeso = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastro de Refeição");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alimento", "Peso"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtPeso);

        jScrollPane3.setViewportView(txtAlimento);

        lbAlimento.setText("Alimento");

        lbPeso.setText("Peso (g)");

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAlimento)
                        .addGap(90, 90, 90)
                        .addComponent(lbPeso)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdicionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSalvar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAlimento)
                    .addComponent(lbPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAdicionar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zerarCamposAdicao() {
        txtAlimento.setText("");
        txtPeso.setText("");
        txtAlimento.requestFocus();
    }

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        String alimento = txtAlimento.getText();
        double peso = Double.parseDouble(txtPeso.getText());

        if (consultaAlimentoService.existeAlimento(alimento)) {
            Alimento alimentoRecebido = consultaAlimentoService.consultarPorDescricao(alimento);

            AlimentoDTO alimentoCalculadoPorPeso = calcularMacrosRefeicaoService.calcularMacros(alimentoRecebido, peso);
            alimentosCalculados.add(alimentoCalculadoPorPeso);
            
            adicionaAlimentoTabela(alimentoRecebido, peso);
            zerarCamposAdicao();
        } else {
            MessageCalculo.alimentoNaoEncontrado(this.title);
            zerarCamposAdicao();
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(Objects.isNull(mostrarValoresRefeicaoGUI)){
        mostrarValoresRefeicaoGUI = new MostrarValoresRefeicaoGUI();        
        }
        DesktopManager.adicionar(mostrarValoresRefeicaoGUI);
        mostrarValoresRefeicaoGUI.setVisible(Boolean.TRUE);
        
        AlimentoDTO totalMacrosRefeicao = calcularRefeicaoCompletaService.calcularRefeicao(alimentosCalculados);
        mostrarValoresRefeicaoGUI.mostraValoresTotais(totalMacrosRefeicao, alimentosCalculados);
        
        alimentosCalculados.clear();
        limparTabela();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        
    }//GEN-LAST:event_txtPesoKeyTyped

    private void adicionaAlimentoTabela(Alimento alimento, double pPeso) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        Object[] dados = {alimento.getDescricao(), pPeso};
        modelo.addRow(dados);
    }
    
    private void limparTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbAlimento;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JTable tabela;
    private javax.swing.JTextPane txtAlimento;
    private javax.swing.JTextPane txtPeso;
    // End of variables declaration//GEN-END:variables
}
