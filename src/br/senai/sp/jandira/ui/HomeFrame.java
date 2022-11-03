package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    private PlanoDeSaudePanel planosDeSaudePanel;
    private EspecialidadePanel especialidadePanel;

    private final int POSICAO_X = 0;
    private final int POSICAO_Y = 240;
    private final int LARGURA = 1090;
    private final int ALTURA = 490;

    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDao.getListaPlanoDeSaude();
        EspecialidadeDao.criarEspecialidadeTeste();
        initPanels();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labeltitulo = new javax.swing.JLabel();
        labelicon = new javax.swing.JLabel();
        buttonexit = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelSisacon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonsaude = new javax.swing.JButton();
        buttonespecialidade = new javax.swing.JButton();
        buttondoctor = new javax.swing.JButton();
        buttonpacient = new javax.swing.JButton();
        buttonhome = new javax.swing.JButton();
        buttonagenda1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));
        jPanel1.setLayout(null);

        labeltitulo.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(255, 255, 255));
        labeltitulo.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(labeltitulo);
        labeltitulo.setBounds(140, 30, 600, 50);

        labelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda.png"))); // NOI18N
        jPanel1.add(labelicon);
        labelicon.setBounds(40, 20, 64, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 100);

        buttonexit.setBackground(new java.awt.Color(204, 204, 255));
        buttonexit.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonexit.setForeground(new java.awt.Color(255, 0, 0));
        buttonexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/exit.png"))); // NOI18N
        buttonexit.setToolTipText("Sair");
        buttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonexitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonexit);
        buttonexit.setBounds(980, 130, 90, 70);

        panelHome.setBackground(new java.awt.Color(255, 204, 255));
        panelHome.setLayout(null);

        labelSisacon.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        labelSisacon.setText("SISACON");
        labelSisacon.setToolTipText("");
        panelHome.add(labelSisacon);
        labelSisacon.setBounds(20, 10, 220, 70);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dados para Contato:");
        panelHome.add(jLabel1);
        jLabel1.setBounds(900, 110, 174, 25);

        jLabel2.setText("Telefone: (11)95555-5555");
        panelHome.add(jLabel2);
        jLabel2.setBounds(950, 160, 130, 16);

        jLabel3.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel3);
        jLabel3.setBounds(20, 70, 217, 16);

        jLabel4.setText("E-mail: girodrigues03@gmail.com.br");
        panelHome.add(jLabel4);
        jLabel4.setBounds(890, 140, 194, 16);

        jLabel5.setText("www.sisacon.com.br");
        panelHome.add(jLabel5);
        jLabel5.setBounds(970, 180, 110, 16);

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        panelHome.add(jPanel2);
        jPanel2.setBounds(10, 90, 1070, 2);

        getContentPane().add(panelHome);
        panelHome.setBounds(0, 240, 1090, 490);

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setLayout(null);

        buttonsaude.setBackground(new java.awt.Color(204, 204, 255));
        buttonsaude.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonsaude.setForeground(new java.awt.Color(102, 102, 102));
        buttonsaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano.png"))); // NOI18N
        buttonsaude.setToolTipText("Planos de Saúde");
        buttonsaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsaudeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonsaude);
        buttonsaude.setBounds(520, 30, 90, 70);

        buttonespecialidade.setBackground(new java.awt.Color(204, 204, 255));
        buttonespecialidade.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonespecialidade.setForeground(new java.awt.Color(102, 102, 102));
        buttonespecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/especi.png"))); // NOI18N
        buttonespecialidade.setToolTipText("Especialidades");
        buttonespecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonespecialidadeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonespecialidade);
        buttonespecialidade.setBounds(420, 30, 90, 70);

        buttondoctor.setBackground(new java.awt.Color(204, 204, 255));
        buttondoctor.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttondoctor.setForeground(new java.awt.Color(102, 102, 102));
        buttondoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doctor.png"))); // NOI18N
        buttondoctor.setToolTipText("Médicos");
        buttondoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondoctorActionPerformed(evt);
            }
        });
        jPanel3.add(buttondoctor);
        buttondoctor.setBounds(320, 30, 90, 70);

        buttonpacient.setBackground(new java.awt.Color(204, 204, 255));
        buttonpacient.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonpacient.setForeground(new java.awt.Color(102, 102, 102));
        buttonpacient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pacient.png"))); // NOI18N
        buttonpacient.setToolTipText("Pacientes");
        buttonpacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpacientActionPerformed(evt);
            }
        });
        jPanel3.add(buttonpacient);
        buttonpacient.setBounds(220, 30, 90, 70);

        buttonhome.setBackground(new java.awt.Color(153, 153, 255));
        buttonhome.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonhome.setForeground(new java.awt.Color(102, 102, 102));
        buttonhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/home.png"))); // NOI18N
        buttonhome.setToolTipText("Agenda");
        buttonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhomeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonhome);
        buttonhome.setBounds(10, 30, 90, 70);

        buttonagenda1.setBackground(new java.awt.Color(204, 204, 255));
        buttonagenda1.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonagenda1.setForeground(new java.awt.Color(102, 102, 102));
        buttonagenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda (2).png"))); // NOI18N
        buttonagenda1.setToolTipText("Agenda");
        buttonagenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonagenda1ActionPerformed(evt);
            }
        });
        jPanel3.add(buttonagenda1);
        buttonagenda1.setBounds(120, 30, 90, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 100, 1090, 140);

        setBounds(0, 0, 1105, 767);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonpacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpacientActionPerformed
        mudarCorBotao();
        buttonpacient.setBackground(new java.awt.Color(204, 204, 255));
        panelHome.setVisible(true);
        planosDeSaudePanel.setVisible(false);
    }//GEN-LAST:event_buttonpacientActionPerformed

    private void buttondoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondoctorActionPerformed
        mudarCorBotao();
        buttondoctor.setBackground(new java.awt.Color(204, 204, 255));
        panelHome.setVisible(true);
        planosDeSaudePanel.setVisible(false);
    }//GEN-LAST:event_buttondoctorActionPerformed

    private void buttonespecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonespecialidadeActionPerformed
        mudarCorBotao();

        buttonespecialidade.setBackground(new java.awt.Color(204, 204, 255));
        panelHome.setVisible(false);
        planosDeSaudePanel.setVisible(false);
        especialidadePanel.setVisible(true);


    }//GEN-LAST:event_buttonespecialidadeActionPerformed

    private void buttonsaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsaudeActionPerformed
        mudarCorBotao();
        buttonsaude.setBackground(new java.awt.Color(204, 204, 255));
        panelHome.setVisible(false);
        planosDeSaudePanel.setVisible(true);

    }//GEN-LAST:event_buttonsaudeActionPerformed

    private void buttonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonexitActionPerformed

    private void buttonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhomeActionPerformed
        mudarCorBotao();
        buttonhome.setBackground(new java.awt.Color(204, 204, 255));
        planosDeSaudePanel.setVisible(false);
        panelHome.setVisible(true);


    }//GEN-LAST:event_buttonhomeActionPerformed

    private void buttonagenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonagenda1ActionPerformed
        mudarCorBotao();
        buttonagenda1.setBackground(new java.awt.Color(204, 204, 255));
        planosDeSaudePanel.setVisible(false);
        panelHome.setVisible(true);

    }//GEN-LAST:event_buttonagenda1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonagenda1;
    private javax.swing.JButton buttondoctor;
    private javax.swing.JButton buttonespecialidade;
    private javax.swing.JButton buttonexit;
    private javax.swing.JButton buttonhome;
    private javax.swing.JButton buttonpacient;
    private javax.swing.JButton buttonsaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelSisacon;
    private javax.swing.JLabel labelicon;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        planosDeSaudePanel = new PlanoDeSaudePanel();

        planosDeSaudePanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);

        getContentPane().add(planosDeSaudePanel);
        planosDeSaudePanel.setVisible(false);

        especialidadePanel = new EspecialidadePanel();

        especialidadePanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);

        getContentPane().add(especialidadePanel);
        especialidadePanel.setVisible(false);

    }

    private void mudarCorBotao() {
        buttonagenda1.setBackground(new java.awt.Color(255, 255, 255));
        buttonhome.setBackground(new java.awt.Color(255, 255, 255));
        buttonsaude.setBackground(new java.awt.Color(255, 255, 255));
        buttonespecialidade.setBackground(new java.awt.Color(255, 255, 255));
        buttondoctor.setBackground(new java.awt.Color(255, 255, 255));
        buttonpacient.setBackground(new java.awt.Color(255, 255, 255));
    }

}
