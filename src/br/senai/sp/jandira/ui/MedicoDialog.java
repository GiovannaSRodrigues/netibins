
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.awt.TextField;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

 private Medico medico;
    public MedicoDialog() {
        initComponents();
    }

    MedicoDialog(Object object, boolean b, TipoOperacao tipoOperacao, Medico medico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelmedico = new javax.swing.JLabel();
        labelicone = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        labelcrm = new javax.swing.JLabel();
        labelsubtitulo1 = new javax.swing.JLabel();
        textcrm = new javax.swing.JTextField();
        labeltelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labeldata = new javax.swing.JLabel();
        textFieldData = new javax.swing.JTextField();
        buttonsalvar1 = new javax.swing.JButton();
        buttoncancelar1 = new javax.swing.JButton();
        labelespecialidade = new javax.swing.JLabel();
        labelcodigo3 = new javax.swing.JLabel();
        textnomemedico = new javax.swing.JTextField();
        textcodigo3 = new javax.swing.JTextField();
        labelemail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        labelespmedico = new javax.swing.JLabel();
        labelnomemedico = new javax.swing.JLabel();
        jbuttondireita = new javax.swing.JButton();
        jbuttonesquerda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(null);

        labelmedico.setBackground(new java.awt.Color(255, 255, 255));
        labelmedico.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        labelmedico.setText("Médico");
        jPanel3.add(labelmedico);
        labelmedico.setBounds(10, 0, 260, 39);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 830, 30);

        labelicone.setForeground(new java.awt.Color(255, 255, 255));
        labelicone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/menu.icone.png"))); // NOI18N
        jPanel1.add(labelicone);
        labelicone.setBounds(30, 40, 40, 40);

        labeltitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labeltitulo.setText("Médico - Adicionar");
        jPanel1.add(labeltitulo);
        labeltitulo.setBounds(80, 50, 310, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 90);

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.setLayout(null);

        labelcrm.setText("CRM:");
        jPanel7.add(labelcrm);
        labelcrm.setBounds(150, 40, 60, 16);

        labelsubtitulo1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        labelsubtitulo1.setText("Detalhes do(a) médico(a):");
        jPanel7.add(labelsubtitulo1);
        labelsubtitulo1.setBounds(30, 0, 190, 16);

        textcrm.setEditable(false);
        textcrm.setBackground(new java.awt.Color(204, 255, 255));
        textcrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcrmActionPerformed(evt);
            }
        });
        jPanel7.add(textcrm);
        textcrm.setBounds(150, 60, 100, 22);

        labeltelefone.setText("Telefone:");
        jPanel7.add(labeltelefone);
        labeltelefone.setBounds(20, 100, 120, 16);

        textFieldTelefone.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.add(textFieldTelefone);
        textFieldTelefone.setBounds(20, 120, 150, 22);

        labeldata.setText("Data  Nascimento:");
        jPanel7.add(labeldata);
        labeldata.setBounds(550, 100, 120, 16);

        textFieldData.setBackground(new java.awt.Color(204, 255, 255));
        textFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDataActionPerformed(evt);
            }
        });
        jPanel7.add(textFieldData);
        textFieldData.setBounds(550, 120, 170, 22);

        buttonsalvar1.setBackground(new java.awt.Color(204, 255, 204));
        buttonsalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salvar.png"))); // NOI18N
        buttonsalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsalvar1ActionPerformed(evt);
            }
        });
        jPanel7.add(buttonsalvar1);
        buttonsalvar1.setBounds(670, 320, 90, 70);

        buttoncancelar1.setBackground(new java.awt.Color(255, 153, 153));
        buttoncancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancel.png"))); // NOI18N
        buttoncancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelar1ActionPerformed(evt);
            }
        });
        jPanel7.add(buttoncancelar1);
        buttoncancelar1.setBounds(570, 320, 90, 70);

        labelespecialidade.setText("Lista de Especialidades:");
        jPanel7.add(labelespecialidade);
        labelespecialidade.setBounds(30, 190, 150, 16);

        labelcodigo3.setText("Código:");
        jPanel7.add(labelcodigo3);
        labelcodigo3.setBounds(20, 40, 60, 16);

        textnomemedico.setEditable(false);
        textnomemedico.setBackground(new java.awt.Color(204, 255, 255));
        textnomemedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnomemedicoActionPerformed(evt);
            }
        });
        jPanel7.add(textnomemedico);
        textnomemedico.setBounds(270, 60, 410, 22);

        textcodigo3.setEditable(false);
        textcodigo3.setBackground(new java.awt.Color(204, 255, 255));
        textcodigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcodigo3ActionPerformed(evt);
            }
        });
        jPanel7.add(textcodigo3);
        textcodigo3.setBounds(20, 60, 100, 22);

        labelemail.setText("E-mail:");
        jPanel7.add(labelemail);
        labelemail.setBounds(190, 100, 60, 16);

        textEmail.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.add(textEmail);
        textEmail.setBounds(190, 120, 340, 20);

        labelespmedico.setText("Especialidades do médico:");
        jPanel7.add(labelespmedico);
        labelespmedico.setBounds(260, 190, 150, 16);

        labelnomemedico.setText("Nome do(a) médico(a):");
        jPanel7.add(labelnomemedico);
        labelnomemedico.setBounds(270, 40, 150, 16);

        jbuttondireita.setBackground(new java.awt.Color(102, 0, 204));
        jbuttondireita.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbuttondireita.setForeground(new java.awt.Color(255, 255, 255));
        jbuttondireita.setText(">");
        jPanel7.add(jbuttondireita);
        jbuttondireita.setBounds(180, 240, 60, 50);

        jbuttonesquerda.setBackground(new java.awt.Color(0, 204, 204));
        jbuttonesquerda.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbuttonesquerda.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonesquerda.setText("<");
        jPanel7.add(jbuttonesquerda);
        jbuttonesquerda.setBounds(180, 310, 60, 50);

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
        jScrollPane2.setViewportView(jTable1);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(20, 220, 140, 170);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jPanel7.add(jScrollPane3);
        jScrollPane3.setBounds(260, 220, 140, 170);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(20, 10, 790, 400);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 90, 830, 430);

        setBounds(0, 0, 842, 526);
    }// </editor-fold>//GEN-END:initComponents

    private void textcrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcrmActionPerformed

    private void buttonsalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsalvar1ActionPerformed
        TipoOperacao tipoOperacao = null;
       

        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonsalvar1ActionPerformed

    private void buttoncancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelar1ActionPerformed
        
    }//GEN-LAST:event_buttoncancelar1ActionPerformed

    private void textnomemedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnomemedicoActionPerformed
     
    }//GEN-LAST:event_textnomemedicoActionPerformed

    private void textcodigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcodigo3ActionPerformed
        
    }//GEN-LAST:event_textcodigo3ActionPerformed

    private void textFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDataActionPerformed
    
      private void atualizar() {
        medico.setCrm(textcrm.getText());
        medico.setNome(textnomemedico.getText());
        medico.setEmail(textEmail.getText());
        medico.setTelefone(textFieldTelefone.getText());
        textFieldData.setText(textFieldData.getText());
        
        if (validarCadastro()) {
            MedicoDao.gravar(medico);
            JOptionPane.showMessageDialog(this,
                    "Médico atualizado com sucesso",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        
    
    }
    
    private void gravar() {
        Medico medico = new Medico();
        medico.setCrm(textcrm.getText());
        medico.setNome(textnomemedico.getText());
        medico.setEmail(textEmail.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setDataDeNascimento(LocalDate.parse
                (textFieldData.getText(), 
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        

        if (validarCadastro()) {
            MedicoDao.gravar(medico);
            JOptionPane.showMessageDialog(this,
                    "Médico gravado com sucesso",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {
        if (textcrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, preenche o nome da CRM",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textcrm.requestFocus();

            return false;

        }
        if (textnomemedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor,preencha o nome do médico",
                    "Médico", JOptionPane.ERROR_MESSAGE);

            textnomemedico.requestFocus();
            return false;

        }
        if (textFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor,preencha o telefone",
                    "Médico", JOptionPane.ERROR_MESSAGE);

            textFieldTelefone.requestFocus();
            return false;
        }
            if (textEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor,preencha o e-mail",
                    "Médico", JOptionPane.ERROR_MESSAGE);

            textEmail.requestFocus();
            return false;
            }
           
        return true;
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncancelar1;
    private javax.swing.JButton buttonsalvar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbuttondireita;
    private javax.swing.JButton jbuttonesquerda;
    private javax.swing.JLabel labelcodigo3;
    private javax.swing.JLabel labelcrm;
    private javax.swing.JLabel labeldata;
    private javax.swing.JLabel labelemail;
    private javax.swing.JLabel labelespecialidade;
    private javax.swing.JLabel labelespmedico;
    private javax.swing.JLabel labelicone;
    private javax.swing.JLabel labelmedico;
    private javax.swing.JLabel labelnomemedico;
    private javax.swing.JLabel labelsubtitulo1;
    private javax.swing.JLabel labeltelefone;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textFieldData;
    private javax.swing.JTextField textFieldTelefone;
    private javax.swing.JTextField textcodigo3;
    private javax.swing.JTextField textcrm;
    private javax.swing.JTextField textnomemedico;
    // End of variables declaration//GEN-END:variables

    
}
