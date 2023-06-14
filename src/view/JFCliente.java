/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import servicos.ClienteServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Caio
 */
public class JFCliente extends javax.swing.JFrame {

    /**
     * Creates new form JFCliente
     */
    public JFCliente() {
        initComponents();
        JBDeletar.setVisible(false);
        addRowToTable();
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) JTClientes.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();;
        Object rowData[] = new Object[4];
        ClienteServicos clienteS = ServicosFactory.getClienteServicos();
        for (Cliente cliente : clienteS.getClientes()) {
            rowData[0] = cliente.getCpf();
            rowData[1] = cliente.getNome();
            rowData[2] = cliente.getTelefone();
            rowData[3] = cliente.getEndereco();
            model.addRow(rowData);
        }

    }

    public boolean validaInputs() {
        if (JTFCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Insira o CPF aqui.");
            JTFCPF.requestFocus();
            return false;
        } else if (JTFNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Insira o nome aqui.");
            JTFNome.requestFocus();
            return false;
        } else if (JTFTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Insira o telefone aqui.");
            JTFTelefone.requestFocus();
            return false;
        } else if (JTFEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o endereço aqui.");
            JTFEndereco.requestFocus();
            return false;
        }
        /* else if (!JRBpagFormaCréd.isSelected() && !JRBpagFormaDeb.isSelected() && !JRBpagFormaDin.isSelected() && !JRBpagFormaPIX.isSelected()) {
            JOptionPane.showMessageDialog(this, "Campo de pagamento obrigatório!");
            return false;
        }*/
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPag = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JBDeletar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBSalvar = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
        JTFTelefone = new javax.swing.JFormattedTextField();
        JBLimpar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTClientes = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro do Cliente");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        JTFNome.setBackground(new java.awt.Color(255, 204, 204));
        JTFNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("CPF");

        JTFCPF.setBackground(new java.awt.Color(255, 204, 204));
        JTFCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCPFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Telefone");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Endereco");

        JTFEndereco.setBackground(new java.awt.Color(255, 204, 204));
        JTFEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEnderecoActionPerformed(evt);
            }
        });

        jLabel7.setText("Obrigado pela preferência!");

        JBDeletar.setText("Deletar");
        JBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDeletarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBSalvar.setText("Salvar");
        JBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarActionPerformed(evt);
            }
        });

        JBSair.setText("Sair");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        JTFTelefone.setBackground(new java.awt.Color(255, 204, 204));
        try {
            JTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JBLimpar.setText("Limpar");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(JTFTelefone)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(JBDeletar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBLimpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(JBSalvar))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTFTelefone)
                    .addComponent(JTFCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JBSair)
                    .addComponent(JBDeletar)
                    .addComponent(JBEditar)
                    .addComponent(JBLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEnderecoActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        // TODO add your handling code here:
        if (validaInputs()) {
            String cpf = JTFCPF.getText();
            String nome = JTFNome.getText();
            String telefone = JTFTelefone.getText();
            String endereco = JTFEndereco.getText();

            ClienteServicos clienteS = ServicosFactory.getClienteServicos();
            Cliente c = new Cliente(0, nome, cpf, telefone, endereco);
            if (JBSalvar.getText().equals("Salvar")) {
                clienteS.cadastroCliente(c);
            } else {
                clienteS.atualizarCliente(c);
            }
            addRowToTable();
            limparCampos();
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeletarActionPerformed
        // TODO add your handling code here:
        int linha = JTClientes.getSelectedRow();
        String cpf = (String) JTClientes.getValueAt(linha, 0);
        ClienteServicos clienteS = ServicosFactory.getClienteServicos();
        //String nome = clienteS.getClienteByDoc(cpf).getNome();
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this,
                "Deseja realmente deletar " + cpf, ".: Deletar :.",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, btnMSG, btnMSG[0]);
        if (resp == 0) {
            clienteS.deletarCliente(cpf);
            addRowToTable();
            JOptionPane.showMessageDialog(this, cpf + "deletado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Operação cancelado pelo usuário!");
        }
        JBLimpar.doClick();
    }//GEN-LAST:event_JBDeletarActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        // TODO add your handling code here:
        if (JBLimpar.getText().equals("Limpar")) {
            limparCampos();
        } else {
            JBEditar.setEnabled(false);
            JBLimpar.setText("Limpar");
            limparCampos();
            addRowToTable();
        }
    }//GEN-LAST:event_JBLimparActionPerformed

    private void JTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTClientesMouseClicked
        // TODO add your handling code here:
        JBDeletar.setVisible(true);
        JBEditar.setEnabled(true);
    }//GEN-LAST:event_JTClientesMouseClicked

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        // TODO add your handling code here:
        JBDeletar.setVisible(false);
        JBSalvar.setText("Confirmar");
        JBLimpar.setText("Cancelar");

        int linha = JTClientes.getSelectedRow();
        String cpf = (String) JTClientes.getValueAt(linha, 0);
        ClienteServicos clienteS = ServicosFactory.getClienteServicos();
        Cliente c = clienteS.getClienteByDoc(cpf);
        JTFNome.setText(c.getNome());
        JTFCPF.setText(c.getCpf());
        JTFTelefone.setText(c.getTelefone());
        JTFEndereco.setText(c.getEndereco());
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBSairActionPerformed

    private void JTFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCPFActionPerformed

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
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    public void limparCampos() {
        JTFNome.setText("");
        JTFCPF.setText("");
        JTFTelefone.setText("");
        JTFEndereco.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDeletar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JButton JBSair;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JTable JTClientes;
    private javax.swing.JTextField JTFCPF;
    private javax.swing.JTextField JTFEndereco;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JFormattedTextField JTFTelefone;
    private javax.swing.ButtonGroup bgPag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
