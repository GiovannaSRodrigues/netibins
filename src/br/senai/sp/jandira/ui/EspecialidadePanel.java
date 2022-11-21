package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EspecialidadePanel extends javax.swing.JPanel {

    int linha;

    public EspecialidadePanel() {
        initComponents();
        criarTabelaEspecialidade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();
        labelEspecialidade = new javax.swing.JLabel();
        buttondelete = new javax.swing.JButton();
        buttonedit = new javax.swing.JButton();
        buttonnew = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 153, 255));
        setPreferredSize(new java.awt.Dimension(1078, 490));
        setLayout(null);

        tableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableEspecialidade);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 1000, 320);

        labelEspecialidade.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelEspecialidade.setText("Especialidades");
        labelEspecialidade.setToolTipText("");
        add(labelEspecialidade);
        labelEspecialidade.setBounds(40, 30, 120, 20);

        buttondelete.setBackground(new java.awt.Color(204, 204, 255));
        buttondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/lixeira.png"))); // NOI18N
        buttondelete.setToolTipText("delete");
        buttondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondeleteActionPerformed(evt);
            }
        });
        add(buttondelete);
        buttondelete.setBounds(830, 400, 70, 60);

        buttonedit.setBackground(new java.awt.Color(204, 204, 255));
        buttonedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit.png"))); // NOI18N
        buttonedit.setToolTipText("edit");
        buttonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneditActionPerformed(evt);
            }
        });
        add(buttonedit);
        buttonedit.setBounds(910, 400, 70, 60);

        buttonnew.setBackground(new java.awt.Color(204, 204, 255));
        buttonnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        buttonnew.setToolTipText("new");
        buttonnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnewActionPerformed(evt);
            }
        });
        add(buttonnew);
        buttonnew.setBounds(990, 400, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondeleteActionPerformed
        linha = tableEspecialidade.getSelectedRow();

        if (linha != -1) {
            excluir();

        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a especialidade que você deseja excluir",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buttondeleteActionPerformed

    private void buttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneditActionPerformed

        linha = tableEspecialidade.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Porfavor,selecione uma especialidade para alterar.",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        }

    
    }//GEN-LAST:event_buttoneditActionPerformed

    private void buttonnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnewActionPerformed

        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(
                null,
                true,
                TipoOperacao.ADICIONAR,
                null);

        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidade();

    }//GEN-LAST:event_buttonnewActionPerformed

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão da especialidade selecionada?",
                "Especialidade ",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {

            EspecialidadeDao.excluir(getCodigo());
            criarTabelaEspecialidade();
        }

    }
    
    private void editar() {
        Especialidade especialidade = EspecialidadeDao.getEspecialidade(getCodigo());

        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(
                null,
                true,
                TipoOperacao.ALTERAR, especialidade);

        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidade();

    }

    private Integer getCodigo() {
        String codigoStr = tableEspecialidade.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondelete;
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonnew;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidade() {

        tableEspecialidade.setModel(EspecialidadeDao.getTableModel());
        //desativar o redimensionamento da jtable
        tableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //Definir a largura de cada coluna 
        tableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(600);

        //Impedir/bloquear a movimentação das colunas 
        tableEspecialidade.getTableHeader().setReorderingAllowed(false);

        //Bloquear edição das células 
        tableEspecialidade.setDefaultEditor(Object.class, null);

    }

}
