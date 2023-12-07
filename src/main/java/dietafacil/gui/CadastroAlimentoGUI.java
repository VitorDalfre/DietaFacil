package dietafacil.gui;

import dietafacil.modelo.Alimento;
import dietafacil.service.AdicionaNovoAlimentoService;
import dietafacil.shared.MessageCadastro;

public class CadastroAlimentoGUI extends javax.swing.JInternalFrame {

    private final AdicionaNovoAlimentoService adicionaNovoAlimentoService;
    private Alimento alimento;

    public CadastroAlimentoGUI() {
        initComponents();
        setVisible(Boolean.TRUE);
        adicionaNovoAlimentoService = new AdicionaNovoAlimentoService();
        setMaximizable(Boolean.TRUE);
        setClosable(Boolean.TRUE);
    }

    public int salvarInformacoesAlimento() {
        String descricao = txtDescricao.getText();
        int carboidrato = Integer.parseInt(txtCarboidrato.getText());
        int proteina = Integer.parseInt(txtProteina.getText());
        int gordura = Integer.parseInt(txtGordura.getText());
        int caloria = Integer.parseInt(txtCalorias.getText());

        alimento = new Alimento(descricao, carboidrato, proteina, gordura, caloria);
        return adicionaNovoAlimentoService.adicionar(alimento);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCarboidrato = new javax.swing.JTextPane();
        lbDescricao = new javax.swing.JLabel();
        lbCarboidrato = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtProteina = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtGordura = new javax.swing.JTextPane();
        lbGordura = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCalorias = new javax.swing.JTextPane();
        lbCalorias = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();

        setTitle("Cadastro de Alimento");

        jScrollPane1.setViewportView(txtDescricao);

        jScrollPane2.setViewportView(txtCarboidrato);

        lbDescricao.setText("Descricao");

        lbCarboidrato.setText("Carboidratos");

        jScrollPane3.setViewportView(txtProteina);

        jLabel3.setText("Proteinas");

        jScrollPane5.setViewportView(txtGordura);

        lbGordura.setText("Gorduras");

        jScrollPane6.setViewportView(txtCalorias);

        lbCalorias.setText("Calorias");

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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbCarboidrato))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbGordura))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbCalorias)
                                .addComponent(btSalvar))))
                    .addComponent(lbDescricao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCalorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbGordura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCarboidrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        int id = salvarInformacoesAlimento();
        if (id > 0) {           
            MessageCadastro.salvo(this.getTitle());
        } else {
            MessageCadastro.jaCadastrado(this.getTitle());
        }
        
        txtDescricao.setText("");
        txtCarboidrato.setText("");
        txtProteina.setText("");
        txtGordura.setText("");
        txtCalorias.setText("");
        txtDescricao.requestFocus();
    }//GEN-LAST:event_btSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbCalorias;
    private javax.swing.JLabel lbCarboidrato;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbGordura;
    private javax.swing.JTextPane txtCalorias;
    private javax.swing.JTextPane txtCarboidrato;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextPane txtGordura;
    private javax.swing.JTextPane txtProteina;
    // End of variables declaration//GEN-END:variables
}
