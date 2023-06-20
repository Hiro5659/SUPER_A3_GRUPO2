/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gerenciador_de_moedas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodz
 */
public class AddMoeda extends javax.swing.JFrame {

    private Metodos metodos;

    /**
     * Creates new form Frame
     */
    public AddMoeda(Metodos metodos) {
        initComponents();
        this.metodos = metodos;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeMoeda = new javax.swing.JTextField();
        txtCodigoMoeda = new javax.swing.JTextField();
        txtSimboloMoeda = new javax.swing.JTextField();
        txtPaisMoeda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValorMoeda = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadeMoedas = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar moeda");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Crie uma nova moeda inserindo as informações abaixo:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Símbolo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("País:");

        txtCodigoMoeda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoMoedaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Valor:");

        txtValorMoeda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorMoedaActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSobre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        tblListadeMoedas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Pais", "Valor", "Codigo", "Simbolo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListadeMoedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadeMoedasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListadeMoedas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
        );

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSobre)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNomeMoeda, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                            .addComponent(txtPaisMoeda))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSimboloMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCodigoMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtValorMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAtualizar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluir)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPaisMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSimboloMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtValorMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAtualizar))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSobre)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoMoedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoMoedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoMoedaActionPerformed

    private void txtValorMoedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorMoedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorMoedaActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        new SobreAddMoeda().setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed


    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
// Checar se os campos estão em branco, caso sim mostrar mensagem de erro, caso não continuar com o código
        if (txtCodigoMoeda.getText().isEmpty()
                || txtSimboloMoeda.getText().isEmpty()
                || txtNomeMoeda.getText().isEmpty()
                || txtPaisMoeda.getText().isEmpty()
                || txtValorMoeda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
        } else {
            // Atributos recebem os valores inseridos na caixa de texto
            String codigoMoedanovo = txtCodigoMoeda.getText();
            String simboloMoedanovo = txtSimboloMoeda.getText();
            String nomeMoedanovo = txtNomeMoeda.getText();
            String paisMoedanovo = txtPaisMoeda.getText();
            String valorMoedanovo = txtValorMoeda.getText();

            DefaultTableModel tbMoedas = (DefaultTableModel) tblListadeMoedas.getModel();
            Object[] dados = {txtNomeMoeda.getText(), txtPaisMoeda.getText(), txtValorMoeda.getText(), txtCodigoMoeda.getText(), txtSimboloMoeda.getText()};
            tbMoedas.addRow(dados);

            // Um novo objeto com os atributos inseridos é criado
            Moeda novaMoeda = new Moeda(codigoMoedanovo, simboloMoedanovo, nomeMoedanovo, paisMoedanovo, Integer.parseInt(valorMoedanovo));
            // Método adicionarMoeda é invocado com a novaMoeda como parâmetro
            metodos.adicionarMoeda(novaMoeda);
            // Método exibirMoedas é invocado, mostrando ao usuário o número atualizado de objetos no Array
            JOptionPane.showMessageDialog(null, "Moeda salva com sucesso! Total de moedas: " + metodos.getContador());
            metodos.exibirMoedasArray();

        }
        /*
        DefaultTableModel dtmListaMoeda = (DefaultTableModel) listaMoedas.getModel();
        Object[] dados = {nomeMoeda.getText(), paisMoeda.getText(), valorMoeda.getText(), codigoMoeda.getText(), simboloMoeda.getText()};
        dtmListaMoeda.addRow(dados);
         */
// TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:

        txtNomeMoeda.setText("");
        txtPaisMoeda.setText("");
        txtValorMoeda.setText("");
        txtCodigoMoeda.setText("");
        txtSimboloMoeda.setText("");
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if (tblListadeMoedas.getSelectedRow() != -1) {
            DefaultTableModel tbMoedas = (DefaultTableModel) tblListadeMoedas.getModel();
            tbMoedas.removeRow((tblListadeMoedas.getSelectedRow()));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para Excluir");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        if (tblListadeMoedas.getSelectedRow() != -1) {
            tblListadeMoedas.setValueAt(txtNomeMoeda.getText(), tblListadeMoedas.getSelectedRow(), 0);
            tblListadeMoedas.setValueAt(txtPaisMoeda.getText(), tblListadeMoedas.getSelectedRow(), 1);
            tblListadeMoedas.setValueAt(txtValorMoeda.getText(), tblListadeMoedas.getSelectedRow(), 2);
            tblListadeMoedas.setValueAt(txtCodigoMoeda.getText(), tblListadeMoedas.getSelectedRow(), 3);
            tblListadeMoedas.setValueAt(txtSimboloMoeda.getText(), tblListadeMoedas.getSelectedRow(), 4);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tblListadeMoedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadeMoedasMouseClicked
        // TODO add your handling code here:
        if (tblListadeMoedas.getSelectedRow() != -1) {
            txtNomeMoeda.setText(tblListadeMoedas.getValueAt(tblListadeMoedas.getSelectedRow(), 0).toString());
            txtPaisMoeda.setText(tblListadeMoedas.getValueAt(tblListadeMoedas.getSelectedRow(), 1).toString());
            txtValorMoeda.setText(tblListadeMoedas.getValueAt(tblListadeMoedas.getSelectedRow(), 2).toString());
            txtCodigoMoeda.setText(tblListadeMoedas.getValueAt(tblListadeMoedas.getSelectedRow(), 3).toString());
            txtSimboloMoeda.setText(tblListadeMoedas.getValueAt(tblListadeMoedas.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_tblListadeMoedasMouseClicked

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
            java.util.logging.Logger.getLogger(AddMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    public javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListadeMoedas;
    private javax.swing.JTextField txtCodigoMoeda;
    private javax.swing.JTextField txtNomeMoeda;
    private javax.swing.JTextField txtPaisMoeda;
    private javax.swing.JTextField txtSimboloMoeda;
    private javax.swing.JTextField txtValorMoeda;
    // End of variables declaration//GEN-END:variables
}