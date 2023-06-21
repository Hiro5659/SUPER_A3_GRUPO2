package gerenciador_de_moedas;

import javax.swing.*;

//Importamos a DefaultTableModel para representarmos a lista de moedas via JTable
import javax.swing.table.DefaultTableModel;

public class AddMoeda extends javax.swing.JFrame {

    //Declaramos a variavel "metodos" do tipo Metodos, fazendo referencia a classe Metodos
    private Metodos metodos;

    //Construtor, aceita um parâmetro do tipo Metodos e encaixa ele na variavel metodos(fazemos isso para acessar o objeto Metodos enquanto estivermos nessa classe)
    public AddMoeda(Metodos metodos) {
        initComponents();
        this.metodos = metodos;

    }

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
        btnBusca = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadeMoedas = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Moedas");
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

        btnBusca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
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
                "Nome", "Pais", "Valor", "Codigo", "Simbolo", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListadeMoedas.getTableHeader().setReorderingAllowed(false);
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

        btnSobre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
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
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addGap(121, 121, 121)
                                .addComponent(btnBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(btnSobre)
                    .addContainerGap(479, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluir)
                            .addComponent(btnLimpar))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusca)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(307, 307, 307)
                    .addComponent(btnSobre)
                    .addContainerGap(451, Short.MAX_VALUE)))
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

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        //Checamos se o campo de busca está vazio
        try {
        if (txtBusca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escreva um ID.");

        } else {
            //Caso não, Chamamos o método buscarMoeda com o ID inserido como parâmetro
            metodos.buscarMoeda(txtBusca.getText());
    }//GEN-LAST:event_btnBuscaActionPerformed
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "ID nao existente");
    }
    }

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
            //PARA REPRESENTAÇÃO VISUAL:
            //Criamos um DefaultTableModel
            DefaultTableModel tbMoedas = (DefaultTableModel) tblListadeMoedas.getModel();
            //Uma array dados é criada com os valores atribuidos as variaveis anteriores, onde o ID é o contador
            Object[] dados = {txtNomeMoeda.getText(), txtPaisMoeda.getText(), txtValorMoeda.getText(), txtCodigoMoeda.getText(), txtSimboloMoeda.getText(), metodos.getContador()};
            //Adicionamos ao JTable a array
            tbMoedas.addRow(dados);

            // Um novo objeto com os atributos inseridos é criado
            Moeda novaMoeda = new Moeda(codigoMoedanovo, simboloMoedanovo, nomeMoedanovo, paisMoedanovo, Integer.parseInt(valorMoedanovo));
            // Método adicionarMoeda é invocado com a novaMoeda como parâmetro
            metodos.adicionarMoeda(novaMoeda);
            // Método exibirMoedas é invocado, mostrando ao usuário o número atualizado de objetos no Array
            JOptionPane.showMessageDialog(null, "Moeda salva com sucesso! Total de moedas: " + metodos.getContador());
            metodos.exibirMoedasArray();

        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        //Setamos os campos de texto como ""
        txtNomeMoeda.setText("");
        txtPaisMoeda.setText("");
        txtValorMoeda.setText("");
        txtCodigoMoeda.setText("");
        txtSimboloMoeda.setText("");
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //TODO add your handling code here:
        //Checamos se alguma row dentro da JTable foi escolhida
        if (tblListadeMoedas.getSelectedRow() != -1) {
            //Criamos um DefaultTableModel
            DefaultTableModel tbMoedas = (DefaultTableModel) tblListadeMoedas.getModel();
            //O index da row selecionada é guardada na variavel selectedRow
            int selectedRow = tblListadeMoedas.getSelectedRow();
            //Criamos uma variavel ID, que é localizada na row selecionada(via int selectedRow) e coluna 5
            //Chamamos o toString para representar o ID em String, ao inves de objeto
            String id = tbMoedas.getValueAt(selectedRow, 5).toString();
            //Chamamos o metodo removerMoeda tendo como parâmetro o ID, passado dessa vez em int
            metodos.removerMoeda(Integer.parseInt(id));
            //Removemos a row selecionada
            tbMoedas.removeRow(selectedRow);

            // Atualizamos os IDs da tabela
            // Através de um for loop, percorremos a JTable e setamos os valores para ID(coluna 5) em ordem crescente)
            for (int i = 0; i < tbMoedas.getRowCount(); i++) {
                tbMoedas.setValueAt(i, i, 5); // Update the ID column (assumes it's the 6th column)
            }

        } else {
            //Pop up de erro caso nenhuma row seja selecionada
            JOptionPane.showMessageDialog(null, "Selecione uma moeda para excluir!");
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        //Checamos se uma row foi selecionada
        if (tblListadeMoedas.getSelectedRow() != -1) {
            //Guardamos a row selecionada com um int
            int selectedRow = tblListadeMoedas.getSelectedRow();
            //Setamos os valores inseridos nas caixas de texto nas respectivas colunas da row
            tblListadeMoedas.setValueAt(txtNomeMoeda.getText(), selectedRow, 0);
            tblListadeMoedas.setValueAt(txtPaisMoeda.getText(), selectedRow, 1);
            tblListadeMoedas.setValueAt(txtValorMoeda.getText(), selectedRow, 2);
            tblListadeMoedas.setValueAt(txtCodigoMoeda.getText(), selectedRow, 3);
            tblListadeMoedas.setValueAt(txtSimboloMoeda.getText(), selectedRow, 4);
            //Chamamos o metodo atualizarMoeda, que usa a row selecionada como ID, e faz as substituições nos atributos de tal moeda
            metodos.atualizarMoeda(selectedRow, txtNomeMoeda.getText(), txtPaisMoeda.getText(), txtValorMoeda.getText(), txtCodigoMoeda.getText(), txtSimboloMoeda.getText());

        } else {
            //Mesagem de erro caso nenhuma row seja selecionada
            JOptionPane.showMessageDialog(null, "Selecione uma moeda para atualizar!");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tblListadeMoedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadeMoedasMouseClicked
        //Metodo para atualizar os campos de texto com os valores respectivos da row em que você clica
        //Checamos se uma row foi selecionada
        int selectedRow = tblListadeMoedas.getSelectedRow();
        if (selectedRow != -1) {
            //Criamos uma variavel int com a row selecionada
            int rowCount = tblListadeMoedas.getRowCount();
            //Setamos os valores nas caixas de texto de acordo com seus valores na row
            if (rowCount > 0) {
                txtNomeMoeda.setText(tblListadeMoedas.getValueAt(selectedRow, 0).toString());
                txtPaisMoeda.setText(tblListadeMoedas.getValueAt(selectedRow, 1).toString());
                txtValorMoeda.setText(tblListadeMoedas.getValueAt(selectedRow, 2).toString());
                txtCodigoMoeda.setText(tblListadeMoedas.getValueAt(selectedRow, 3).toString());
                txtSimboloMoeda.setText(tblListadeMoedas.getValueAt(selectedRow, 4).toString());
            }
        }
    }//GEN-LAST:event_tblListadeMoedasMouseClicked

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        //Abrimos o form SobreAddMoeda
        SobreAddMoeda sobre = new SobreAddMoeda();
        sobre.setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

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
    private javax.swing.JButton btnBusca;
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
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCodigoMoeda;
    private javax.swing.JTextField txtNomeMoeda;
    private javax.swing.JTextField txtPaisMoeda;
    private javax.swing.JTextField txtSimboloMoeda;
    private javax.swing.JTextField txtValorMoeda;
    // End of variables declaration//GEN-END:variables
}
