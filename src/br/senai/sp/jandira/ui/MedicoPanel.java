
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    int linha;
   
    public MedicoPanel() {
        initComponents();
        criarTabelaMedico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        labelMedico = new javax.swing.JLabel();
        buttondelete = new javax.swing.JButton();
        buttonedit = new javax.swing.JButton();
        buttonnew = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 153, 255));
        setLayout(null);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableMedico);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 80, 1000, 320);

        labelMedico.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelMedico.setText("Médico");
        labelMedico.setToolTipText("");
        add(labelMedico);
        labelMedico.setBounds(40, 30, 120, 20);

        buttondelete.setBackground(new java.awt.Color(204, 204, 255));
        buttondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/lixeira.png"))); // NOI18N
        buttondelete.setToolTipText("delete");
        buttondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondeleteActionPerformed(evt);
            }
        });
        add(buttondelete);
        buttondelete.setBounds(840, 420, 70, 60);

        buttonedit.setBackground(new java.awt.Color(204, 204, 255));
        buttonedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit.png"))); // NOI18N
        buttonedit.setToolTipText("edit");
        buttonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneditActionPerformed(evt);
            }
        });
        add(buttonedit);
        buttonedit.setBounds(920, 420, 70, 60);

        buttonnew.setBackground(new java.awt.Color(204, 204, 255));
        buttonnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        buttonnew.setToolTipText("new");
        buttonnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnewActionPerformed(evt);
            }
        });
        add(buttonnew);
        buttonnew.setBounds(1000, 420, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondeleteActionPerformed
        linha = tableMedico.getSelectedRow();

        if (linha != -1) {
            excluir();

        } else {
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione o médico que você deseja excluir",
                "Médico",
                JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttondeleteActionPerformed

    private void buttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneditActionPerformed

        linha = tableMedico.getSelectedRow();

        if (linha != -1){
            editar();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Porfavor,selecione um médico para alterar.",
                "CRM",
                JOptionPane.WARNING_MESSAGE);
        }
        }
        private void editar(){
            Medico medico = MedicoDao.getMedico(getCodigo());

            MedicoDialog medicoDialog = new MedicoDialog(
                null,
                true,
                TipoOperacao.ALTERAR, medico);

            medicoDialog.setVisible(true);

            criarTabelaMedico();

    }//GEN-LAST:event_buttoneditActionPerformed

    private void buttonnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnewActionPerformed

        MedicoDialog medicoDialog = new MedicoDialog
                (null, 
                true, 
                TipoOperacao.ADICIONAR, 
                null);

        medicoDialog.setVisible(true);

        criarTabelaMedico();
    }//GEN-LAST:event_buttonnewActionPerformed
    private void criarTabelaMedico() {

        tableMedico.setModel(MedicoDao.getTableModel());
        //desativar o redimensionamento da jtable
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //Definir a largura de cada coluna 
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(600);

        //Impedir/bloquear a movimentação das colunas 
        tableMedico.getTableHeader().setReorderingAllowed(false);

        //Bloquear edição das células 
        tableMedico.setDefaultEditor(Object.class, null);

    }
    
    private void excluir() {
        
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão do médico selecionado?",
                "Médico",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            
            MedicoDao.excluir(getCodigo());
            criarTabelaMedico();
        }
    
    }
    
     private Integer getCodigo() {
        String codigoStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondelete;
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonnew;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables

    
}
