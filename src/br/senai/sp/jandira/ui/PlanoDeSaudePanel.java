
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanoDeSaudePanel extends javax.swing.JPanel {

    int linha;

    public PlanoDeSaudePanel() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPlanodeSaude = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonnew = new javax.swing.JButton();
        buttonedit = new javax.swing.JButton();
        buttondelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 153, 255));
        setPreferredSize(new java.awt.Dimension(1090, 490));
        setLayout(null);

        labelPlanodeSaude.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelPlanodeSaude.setText("Planos de Saúde");
        labelPlanodeSaude.setToolTipText("");
        add(labelPlanodeSaude);
        labelPlanodeSaude.setBounds(40, 30, 120, 20);

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePlanoDeSaude);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 80, 1000, 320);

        buttonnew.setBackground(new java.awt.Color(204, 204, 255));
        buttonnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        buttonnew.setToolTipText("new");
        buttonnew.setPreferredSize(new java.awt.Dimension(300, 80));
        buttonnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnewActionPerformed(evt);
            }
        });
        add(buttonnew);
        buttonnew.setBounds(990, 410, 70, 60);

        buttonedit.setBackground(new java.awt.Color(204, 204, 255));
        buttonedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit.png"))); // NOI18N
        buttonedit.setToolTipText("edit");
        buttonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneditActionPerformed(evt);
            }
        });
        add(buttonedit);
        buttonedit.setBounds(910, 410, 70, 60);

        buttondelete.setBackground(new java.awt.Color(204, 204, 255));
        buttondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/lixeira.png"))); // NOI18N
        buttondelete.setToolTipText("delete");
        buttondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondeleteActionPerformed(evt);
            }
        });
        add(buttondelete);
        buttondelete.setBounds(830, 410, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnewActionPerformed

        PlanoDeSaudeDialog planosDeSaudeDialog = new PlanoDeSaudeDialog(
                null, 
                true,
                TipoOperacao.ADICIONAR,
                null);
        planosDeSaudeDialog.setVisible(true);
    

    }//GEN-LAST:event_buttonnewActionPerformed

    private void buttondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondeleteActionPerformed
        //Obtemos o idice da linha selecionada na tabela 
        linha = tablePlanoDeSaude.getSelectedRow();

        //Verificamos se a linha é diferente de-1
        //-1 significa que o usuário não selecionou nada 
        if (linha != -1) {
            excluir();

        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o plano que você deseja excluir",
                    "Plano de saúde",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buttondeleteActionPerformed


    private void buttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneditActionPerformed
       
        linha = tablePlanoDeSaude.getSelectedRow();
        
        if (linha != -1){
            editar();
        } else {
        JOptionPane.showMessageDialog(
                this, 
                "Porfavor,selecione um plano de saúde para alterar.", 
                "Planos de Saúde", 
                JOptionPane.WARNING_MESSAGE);
        }
    }
         private void editar(){
            PlanoDeSaude planoDeSaude = PlanoDeSaudeDao.getPlanoDeSaude(getCodigo());
        
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(
               null,
               true, 
               TipoOperacao.ALTERAR, planoDeSaude);
        
       planoDeSaudeDialog.setVisible(true);
       
       criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_buttoneditActionPerformed

            
    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão do plano de saude selecionado?",
                "Plano de saude ",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            
            PlanoDeSaudeDao.excluir(getCodigo());
            criarTabelaPlanosDeSaude();
        }
    }
    
    private Integer getCodigo(){
        String codigoStr = tablePlanoDeSaude.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondelete;
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonnew;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPlanodeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables
 
    private void criarTabelaPlanosDeSaude() {

        tablePlanoDeSaude.setModel(PlanoDeSaudeDao.getTableModel());
        //desativar o redimensionamento da jtable
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //Definir a largura de cada coluna 
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(300);

        //Impedir/bloquear a movimentação das colunas 
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);

        //Bloquear edição das células 
        tablePlanoDeSaude.setDefaultEditor(Object.class, null);

    }

   
}
