/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.view;

import agenda.controller.ContatoController;
import agenda.dao.RepositorioContato;
import agenda.model.Contato;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Santos
 */
public class ContatoForm extends javax.swing.JFrame implements ContatoView {
    
    private ContatoController mContatoController;
    private Contato mContato;
    
    public ContatoForm(RepositorioContato repositorioContato) {
        mContatoController = new ContatoController(this, repositorioContato);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        PesquisaButton = new javax.swing.JButton();
        PesquisaTextField = new javax.swing.JTextField();
        ButtonGravar = new javax.swing.JButton();
        mButtonExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        NomeTextField = new javax.swing.JTextField();
        TelefoneTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mButtonNovo = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PesquisaButton.setText("Pesquisar");
        PesquisaButton.setToolTipText("");
        PesquisaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaButtonActionPerformed(evt);
            }
        });

        ButtonGravar.setText("GRAVAR");
        ButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGravarActionPerformed(evt);
            }
        });

        mButtonExcluir.setText("EXCLUIR");
        mButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone");

        IdTextField.setEnabled(false);

        jLabel4.setText("Email");

        mButtonNovo.setText("NOVO");
        mButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PesquisaTextField)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NomeTextField)
                                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(PesquisaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(mButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mButtonExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonGravar, mButtonExcluir, mButtonNovo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EmailTextField, NomeTextField, TelefoneTextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisaButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonGravar)
                    .addComponent(mButtonExcluir)
                    .addComponent(mButtonNovo))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGravarActionPerformed
        Contato contato = mContato == null ? new Contato() : mContato;
        contato.setEmail(EmailTextField.getText());
        contato.setNome(NomeTextField.getText());
        contato.setTelefone(TelefoneTextField.getText());
        mContatoController.gravarContato(contato);        
    }//GEN-LAST:event_ButtonGravarActionPerformed

    private void mButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonExcluirActionPerformed
        if (mContato != null) {
            mContatoController.excluirContato(mContato.getId());
        }
    }//GEN-LAST:event_mButtonExcluirActionPerformed

    private void PesquisaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaButtonActionPerformed
        String strId = PesquisaTextField.getText();
        boolean eNumerico = strId.matches("[0-9]+");
        
        if (eNumerico) {
            mContatoController.buscarContatoPorId(Integer.parseInt(strId));
        }
        
    }//GEN-LAST:event_PesquisaButtonActionPerformed

    private void mButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonNovoActionPerformed
        resetarCampos();
    }//GEN-LAST:event_mButtonNovoActionPerformed
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGravar;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JButton PesquisaButton;
    private javax.swing.JTextField PesquisaTextField;
    private javax.swing.JTextField TelefoneTextField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton mButtonExcluir;
    private javax.swing.JButton mButtonNovo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void exibirContato(Contato contato) {
        mContato = contato;
        if (contato != null) {
            IdTextField.setText(String.valueOf(contato.getId()));    
            NomeTextField.setText(contato.getNome());
            EmailTextField.setText(contato.getEmail());
            TelefoneTextField.setText(contato.getTelefone());
        }
    }

    @Override
    public void resetarCampos() {
        mContato = null;
        PesquisaTextField.setText("");
        IdTextField.setText("");    
        NomeTextField.setText("");
        EmailTextField.setText("");
        TelefoneTextField.setText("");
    }

    @Override
    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }


}