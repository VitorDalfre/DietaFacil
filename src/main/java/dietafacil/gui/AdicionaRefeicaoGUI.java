package dietafacil.gui;

import dietafacil.modelo.Alimento;
import dietafacil.modelo.Refeicao;
import dietafacil.service.AdicionaAlimentoRefeicaoService;
import dietafacil.service.AdicionaRefeicaoService;
import dietafacil.service.CalcularMacrosRefeicaoService;
import dietafacil.service.CalcularRefeicaoCompletaService;
import dietafacil.shared.MessageCadastro;
import dietafacil.shared.MessageCalculo;
import dietafacil.shared.MessageData;
import dietafacil.shared.MessageRefeicao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import javax.swing.JFormattedTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class AdicionaRefeicaoGUI extends javax.swing.JInternalFrame {

    private final AdicionaAlimentoRefeicaoService adicionaAlimentoRefeicaoService;
    private final CalcularMacrosRefeicaoService calcularMacrosRefeicaoService;
    private final CalcularRefeicaoCompletaService calcularRefeicaoCompletaService;
    private final AdicionaRefeicaoService adicionaRefeicaoService;
    private final ArrayList<Alimento> alimentosCalculados = new ArrayList<>();
    private final ArrayList<Alimento> alimentosDaRefeicao = new ArrayList<>();
    private RefeicaoGUI refeicaoGUI;
    MaskFormatter mf;

    public AdicionaRefeicaoGUI() {
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
        calcularMacrosRefeicaoService = new CalcularMacrosRefeicaoService();
        calcularRefeicaoCompletaService = new CalcularRefeicaoCompletaService();
        adicionaRefeicaoService = new AdicionaRefeicaoService();
        adicionaAlimentoRefeicaoService = new AdicionaAlimentoRefeicaoService();
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
        jfData = new javax.swing.JFormattedTextField(mf);
        lbData = new javax.swing.JLabel();

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

        jfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfDataActionPerformed(evt);
            }
        });

        lbData.setText("Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAlimento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPeso)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addComponent(btAdicionar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAdicionar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbAlimento)
                                    .addComponent(lbPeso))
                                .addGap(29, 29, 29))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar)
                .addGap(11, 11, 11))
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

        Alimento alimentoAdicionado = adicionaAlimentoRefeicaoService.adicionar(alimento, peso);
        if (alimentoAdicionado != null) {
            alimentosDaRefeicao.add(alimentoAdicionado);
        } else {
            MessageCalculo.alimentoNaoEncontrado(title);
        }

        Alimento macrosAlimentoAdicionado = calcularMacrosRefeicaoService.calcularMacros(alimentoAdicionado);
        alimentosCalculados.add(macrosAlimentoAdicionado);

        adicionaAlimentoTabela(alimentoAdicionado, peso);
        zerarCamposAdicao();
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(alimentosDaRefeicao.size() <= 0){
            MessageRefeicao.refeicaoSemAlimento(title);
            return;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Formartar a data inserida
        Date data = null;
        try {
            data = sdf.parse(jfData.getText());
        } catch (ParseException e) {
            jfData.setFocusLostBehavior(JFormattedTextField.PERSIST);
        }
        String dataFormatada = sdf.format(data); // Pega a data e transforma em String

        if (Objects.isNull(refeicaoGUI)) { //Valida se o Objeto já não está instanciada pela classe Object                     
            refeicaoGUI = new RefeicaoGUI();
        }
        DesktopManager.adicionar(refeicaoGUI);
        refeicaoGUI.setVisible(Boolean.TRUE);

        Alimento valoresRefeicao = calcularRefeicaoCompletaService.calcularRefeicao(alimentosCalculados); //Retorna o total da Refeição (Carb, Prot, Gord e KCal)
        refeicaoGUI.mostraValoresTotais(valoresRefeicao, alimentosCalculados, dataFormatada); //Mostra Lista de Alimentos, totais e data da refeição na tela

        Refeicao refeicao = new Refeicao(dataFormatada, valoresRefeicao.getCarboidrato(), valoresRefeicao.getProteina(),
                valoresRefeicao.getGordura(), valoresRefeicao.getCalorias(), valoresRefeicao.getPeso(), alimentosDaRefeicao); //Crio a refeição com base nas infos        
        adicionaRefeicaoService.adicionar(refeicao); //Adiciona Refeição e Alimentos da mesma no banco                        //e passo para o BD salvar!

        limparTabela();
        alimentosCalculados.clear();
        alimentosDaRefeicao.clear();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped

    }//GEN-LAST:event_txtPesoKeyTyped

    private void jfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfDataActionPerformed

    private void adicionaAlimentoTabela(Alimento alimento, double pPeso) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        Object[] dados = {alimento.getDescricao(), pPeso};
        modelo.addRow(dados);
    }

    private void limparTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        jfData.setValue(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JFormattedTextField jfData;
    private javax.swing.JLabel lbAlimento;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JTable tabela;
    private javax.swing.JTextPane txtAlimento;
    private javax.swing.JTextPane txtPeso;
    // End of variables declaration//GEN-END:variables
}
