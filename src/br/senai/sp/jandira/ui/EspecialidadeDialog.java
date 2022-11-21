
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;


public class EspecialidadeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;

    
    public EspecialidadeDialog(java.awt.Frame parent, boolean modal, TipoOperacao tipoOperacao, Especialidade especialidade) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    private void preencherFormulario() {
       
        textcodigo.setText(especialidade.getCodigo().toString());
        textnome.setText(especialidade.getNome());
        textdescricao.setText(especialidade.getDescricao());
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelsistema = new javax.swing.JLabel();
        labelicone = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelcodigo = new javax.swing.JLabel();
        labelsubtitulo = new javax.swing.JLabel();
        textcodigo = new javax.swing.JTextField();
        labelnome = new javax.swing.JLabel();
        textnome = new javax.swing.JTextField();
        labeldescricao = new javax.swing.JLabel();
        textdescricao = new javax.swing.JTextField();
        buttonsalvar = new javax.swing.JButton();
        buttoncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(null);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        labelsistema.setBackground(new java.awt.Color(255, 255, 255));
        labelsistema.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        labelsistema.setText("Especialidades");
        jPanel2.add(labelsistema);
        labelsistema.setBounds(10, 0, 260, 29);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 830, 30);

        labelicone.setForeground(new java.awt.Color(255, 255, 255));
        labelicone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/menu.icone.png"))); // NOI18N
        jPanel1.add(labelicone);
        labelicone.setBounds(30, 40, 40, 40);

        labeltitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labeltitulo.setText("Especialidade - Adicionar");
        jPanel1.add(labeltitulo);
        labeltitulo.setBounds(80, 40, 310, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 90);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(null);

        labelcodigo.setText("Código");
        jPanel4.add(labelcodigo);
        labelcodigo.setBounds(40, 80, 60, 16);

        labelsubtitulo.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        labelsubtitulo.setText("Sistema de agendamento");
        jPanel4.add(labelsubtitulo);
        labelsubtitulo.setBounds(30, 0, 190, 16);

        textcodigo.setEditable(false);
        textcodigo.setBackground(new java.awt.Color(204, 255, 255));
        textcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcodigoActionPerformed(evt);
            }
        });
        jPanel4.add(textcodigo);
        textcodigo.setBounds(40, 110, 100, 40);

        labelnome.setText("Nome da Especialidade");
        jPanel4.add(labelnome);
        labelnome.setBounds(40, 160, 150, 16);

        textnome.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.add(textnome);
        textnome.setBounds(40, 190, 340, 22);

        labeldescricao.setText("Descrição");
        jPanel4.add(labeldescricao);
        labeldescricao.setBounds(40, 240, 80, 16);
        jPanel4.add(textdescricao);
        textdescricao.setBounds(40, 270, 340, 22);

        buttonsalvar.setBackground(new java.awt.Color(204, 255, 204));
        buttonsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salvar.png"))); // NOI18N
        buttonsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsalvarActionPerformed(evt);
            }
        });
        jPanel4.add(buttonsalvar);
        buttonsalvar.setBounds(670, 320, 90, 70);

        buttoncancelar.setBackground(new java.awt.Color(255, 153, 153));
        buttoncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancel.png"))); // NOI18N
        buttoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelarActionPerformed(evt);
            }
        });
        jPanel4.add(buttoncancelar);
        buttoncancelar.setBounds(570, 320, 90, 70);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(20, 10, 790, 400);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 90, 830, 430);

        setBounds(0, 0, 842, 526);
    }// </editor-fold>//GEN-END:initComponents

//
    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncancelarActionPerformed

    private void buttonsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsalvarActionPerformed

        //Criar um objeto Plano de Saúde
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }
        
        

    }//GEN-LAST:event_buttonsalvarActionPerformed

    private void textcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcodigoActionPerformed

     private void atualizar() {

        especialidade.setNome(textnome.getText());
        especialidade.setDescricao(textdescricao.getText());
        EspecialidadeDao.atualizar(especialidade);
        JOptionPane.showMessageDialog(
                null,
                "Especialidade atualizada com sucesso!",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
     
     private void gravar() {
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textnome.getText());
        especialidade.setDescricao(textdescricao.getText());

        if (validarCadastro()) {
            EspecialidadeDao.gravar(especialidade);
            JOptionPane.showMessageDialog(this,
                    "Especialidade gravada com sucesso",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
  

 private boolean validarCadastro() {
        if (textnome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, preenche o nome da especialidade",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);

            textnome.requestFocus();

            return false;

        }
        if (textdescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor,preencha a descrição",
                    "Especialidade", JOptionPane.ERROR_MESSAGE);

            textdescricao.requestFocus();
            return false;

        }
        return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncancelar;
    private javax.swing.JButton buttonsalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labeldescricao;
    private javax.swing.JLabel labelicone;
    private javax.swing.JLabel labelnome;
    private javax.swing.JLabel labelsistema;
    private javax.swing.JLabel labelsubtitulo;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JTextField textcodigo;
    private javax.swing.JTextField textdescricao;
    private javax.swing.JTextField textnome;
    // End of variables declaration//GEN-END:variables
}
    
 
