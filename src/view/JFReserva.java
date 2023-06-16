/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Mesa;
import model.Reserva;
import servicos.ClienteServicos;
import servicos.MesaServicos;
import servicos.ReservaServicos;
import servicos.ServicosFactory;


/**
 *
 * @author 201401665
 */
public class JFReserva extends javax.swing.JFrame {

    /**
     * Creates new form JFReserva
     */
    public JFReserva() {
        initComponents();
        addRowToTable();
    }
    
    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) JTReservas.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        Object rowData[] = new Object[4];
        ReservaServicos reservaS = ServicosFactory.getReservaServicos();
        for (Reserva reserva : reservaS.getReserva()){
            rowData[0] = reserva.getNumReserva();
            rowData[1] = reserva.getQntAssento();
            rowData[2] = reserva.getHoraRes();
            rowData[3] = reserva.getResCliente().getNome();
            model.addRow(rowData);
        }
    }
    public boolean validaInputs() {
        if(JTFNumMesa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo obrigatátorio");
            JTFNumMesa.requestFocus();
            return false;
        }else if (JTFLugares.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo obrigatório");
            JTFLugares.requestFocus();
            return false;
        }else if (JTFHoraRes.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo obrigatorio");
            JTFHoraRes.requestFocus();
            return false;
        }else if(JTFnumReserva.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Obriagatório");
            JTFnumReserva.requestFocus();
            return false;
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JLLugares = new javax.swing.JLabel();
        JTFLugares = new javax.swing.JTextField();
        JLHorario = new javax.swing.JLabel();
        JTFHoraRes = new javax.swing.JTextField();
        JLClienteReserv = new javax.swing.JLabel();
        JLCliente = new javax.swing.JLabel();
        JTFnumReserva = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTReservas = new javax.swing.JTable();
        JLLugares1 = new javax.swing.JLabel();
        JTFNumMesa = new javax.swing.JTextField();
        JBSalvar = new javax.swing.JButton();
        JTFClienteReser = new javax.swing.JTextField();
        JLLugares2 = new javax.swing.JLabel();
        JBDeletar = new javax.swing.JButton();
        JBLimpar = new javax.swing.JButton();
        JBFechar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Reservas");

        JLLugares.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JLLugares.setText("Lugares");

        JTFLugares.setBackground(new java.awt.Color(255, 255, 51));
        JTFLugares.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFLugaresActionPerformed(evt);
            }
        });

        JLHorario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JLHorario.setText("Horário");

        JTFHoraRes.setBackground(new java.awt.Color(255, 255, 51));
        JTFHoraRes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFHoraRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFHoraResActionPerformed(evt);
            }
        });

        JLClienteReserv.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JLClienteReserv.setText("CPF do Cliente");

        JLCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JLCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        JTFnumReserva.setBackground(new java.awt.Color(255, 255, 51));
        JTFnumReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFnumReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnumReservaActionPerformed(evt);
            }
        });

        JTReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Lugares", "Horário", "Mesa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTReservas);

        JLLugares1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JLLugares1.setText("Num. da Mesa");

        JTFNumMesa.setBackground(new java.awt.Color(255, 255, 51));
        JTFNumMesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFNumMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumMesaActionPerformed(evt);
            }
        });

        JBSalvar.setText("Salvar");
        JBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarActionPerformed(evt);
            }
        });

        JTFClienteReser.setBackground(new java.awt.Color(255, 255, 51));
        JTFClienteReser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFClienteReser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFClienteReserActionPerformed(evt);
            }
        });

        JLLugares2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JLLugares2.setText("Reserva");

        JBDeletar.setText("Deletar");
        JBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDeletarActionPerformed(evt);
            }
        });

        JBLimpar.setText("Limpar Campos");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JBFechar.setText("Sair");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLClienteReserv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFClienteReser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addComponent(JLCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLLugares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFHoraRes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JLLugares1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JLLugares2)
                                .addGap(18, 18, 18)
                                .addComponent(JTFnumReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBLimpar)))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JBDeletar)
                        .addGap(72, 72, 72)
                        .addComponent(JBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBFechar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLClienteReserv)
                    .addComponent(JLCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFClienteReser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLLugares)
                    .addComponent(JTFLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLHorario)
                    .addComponent(JTFHoraRes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLLugares1)
                    .addComponent(JTFNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLLugares2)
                    .addComponent(JTFnumReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBDeletar)
                    .addComponent(JBSalvar)
                    .addComponent(JBEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFLugaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFLugaresActionPerformed

    private void JTFHoraResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFHoraResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFHoraResActionPerformed

    private void JTFnumReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnumReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnumReservaActionPerformed

    private void JTFNumMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumMesaActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        // TODO add your handling code here:
        if (validaInputs()){
            ReservaServicos reservaS = ServicosFactory.getReservaServicos();
            ClienteServicos clienteS = ServicosFactory.getClienteServicos();
            MesaServicos mesaS = ServicosFactory.getMesaServicos();
            String numReserva = JTFnumReserva.getText();
            String qntAssento = JTFLugares.getText();
            String horaRes = JTFHoraRes.getText();
            Cliente ResCliente = clienteS.getClienteByDoc(JTFClienteReser.getText());
            Mesa numMesa = mesaS.getMesaByDoc(JTFNumMesa.getText());
            
            Reserva r = new Reserva(numReserva,qntAssento,horaRes,ResCliente,numMesa);
            System.out.println(r.toString());
            if (JBSalvar.getText().equals("Salvar")){
                reservaS.cadastroReservas(r);
            }else {
                reservaS.atualizarReservas(r);
            }
            addRowToTable();
           // limparCampos();
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JTFClienteReserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFClienteReserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFClienteReserActionPerformed

    private void JBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeletarActionPerformed
        // TODO add your handling code here:
        int linha = JTReservas.getSelectedRow();
        String numReserva = (String) JTReservas.getValueAt(linha, 0);
        ReservaServicos reservaS = ServicosFactory.getReservaServicos();
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this,
                "Deseja Realmente deletar" + numReserva, "DELETAR RESERVA",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, btnMSG, btnMSG[0]);
        if (resp == 0) {
            reservaS.deletarReservas(numReserva);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Reserva Cancelada/Finalizada");
        }else {
            JOptionPane.showMessageDialog(this, "Cancelado");
        }
        JBLimpar.doClick();
    }//GEN-LAST:event_JBDeletarActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        // TODO add your handling code here:
        if (JBLimpar.getText().equals("Limpar")){
            limparCampos();
        }else {
            JBLimpar.setText("Limpar");
            JBSalvar.setText("Salvar");
            limparCampos();
        }
    }//GEN-LAST:event_JBLimparActionPerformed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        // TODO add your handling code here:
        JBDeletar.setVisible(false);
        JBSalvar.setText("Confirmar");
        JBLimpar.setText("Cancelar");
        
        int linha = JTReservas.getSelectedRow();
        String numReserva = (String) JTReservas.getValueAt(linha, 0);
        ReservaServicos reservaS = ServicosFactory.getReservaServicos();
        MesaServicos mesaS = ServicosFactory.getMesaServicos();
        Reserva r = reservaS.getReservaByDoc(numReserva);
        JTFClienteReser.setText(r.getResCliente().getCpf());
        JTFHoraRes.setText(r.getHoraRes());
        JTFLugares.setText(r.getQntAssento());
        JTFNumMesa.setText(r.getNumMesa().getnumMesa());
    }//GEN-LAST:event_JBEditarActionPerformed

    public void limparCampos() {
        JTFnumReserva.setText("");
        JTFClienteReser.setText("");
        JTFHoraRes.setText("");
        JTFLugares.setText("");
        JTFNumMesa.setText("");
    }
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
            java.util.logging.Logger.getLogger(JFReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDeletar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JLabel JLCliente;
    private javax.swing.JLabel JLClienteReserv;
    private javax.swing.JLabel JLHorario;
    private javax.swing.JLabel JLLugares;
    private javax.swing.JLabel JLLugares1;
    private javax.swing.JLabel JLLugares2;
    private javax.swing.JTextField JTFClienteReser;
    private javax.swing.JTextField JTFHoraRes;
    private javax.swing.JTextField JTFLugares;
    private javax.swing.JTextField JTFNumMesa;
    private javax.swing.JTextField JTFnumReserva;
    private javax.swing.JTable JTReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
