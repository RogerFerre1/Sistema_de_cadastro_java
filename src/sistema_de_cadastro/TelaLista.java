/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema_de_cadastro;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rogin
 */
public class TelaLista extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLista.class.getName());

    /**
     * Creates new form TelaLista
     */
    public TelaLista() {
        initComponents();
        carregarTabela();
    }

   private void carregarTabela(){
       DefaultTableModel modelo = (DefaultTableModel) tabelaVerificarCadastro.getModel();
       
       modelo.setRowCount(0);
       
       for(int i = 0; i < Sistema_de_Cadastro.total_pessoas; i++){
           modelo.addRow(new Object[]{ 
               Sistema_de_Cadastro.pessoa[i].nome, 
               Sistema_de_Cadastro.pessoa[i].cpf, 
               Sistema_de_Cadastro.pessoa[i].telefone, 
               Sistema_de_Cadastro.pessoa[i].email
           });
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVerificarCadastro = new javax.swing.JTable();
        btnVoltarLista = new javax.swing.JButton();
        btnExcluirCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaVerificarCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaVerificarCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(tabelaVerificarCadastro);

        btnVoltarLista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVoltarLista.setText("Voltar");
        btnVoltarLista.addActionListener(this::btnVoltarListaActionPerformed);

        btnExcluirCad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExcluirCad.setText("Excluir Cadastro");
        btnExcluirCad.addActionListener(this::btnExcluirCadActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnExcluirCad)
                .addGap(53, 53, 53)
                .addComponent(btnVoltarLista)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCad)
                    .addComponent(btnVoltarLista))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarListaActionPerformed
        this.dispose();
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltarListaActionPerformed

    private void btnExcluirCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadActionPerformed
        int linhaSelecionada = tabelaVerificarCadastro.getSelectedRow();
        
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Selecione um cadastro para excluir.");
            return;
        }
        
        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este cadastro?", 
                "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        
        if(confirmacao == JOptionPane.YES_OPTION){
            for(int i = linhaSelecionada; i < (Sistema_de_Cadastro.total_pessoas - 1); i++){
                Sistema_de_Cadastro.pessoa[i] = Sistema_de_Cadastro.pessoa[i + 1];
            }
        
            Sistema_de_Cadastro.total_pessoas--;
        
            Sistema_de_Cadastro.pessoa[Sistema_de_Cadastro.total_pessoas] = null;
        
            carregarTabela();
        }else{
            return;
        }
    }//GEN-LAST:event_btnExcluirCadActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaLista().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirCad;
    private javax.swing.JButton btnVoltarLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVerificarCadastro;
    // End of variables declaration//GEN-END:variables
}
