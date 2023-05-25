package view;

import data.Usuario;

public class LogFit extends javax.swing.JFrame {

    public LogFit(Usuario usuario) {
        initComponents();
        txtNome.setText(usuario.getNome());
        txtAltura.setText(String.valueOf(usuario.getAltura())); // PRECISA COLOCAR AS TEXTBOX PRA FUNCIONAR.
        // LER O UsuarioDAO FUNÇÃO CONSULTAR() ANTES.

    }

    @SuppressWarnings("unchecked") // DESIGN DA TELA DE USUÁRIO.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogFit");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel1.setText("Painel principal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 50, 190, 90);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 310, 120, 50);

        txtNome.setEditable(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 200, 310, 60);

        txtAltura.setEditable(false);
        getContentPane().add(txtAltura);
        txtAltura.setBounds(50, 410, 330, 90);

        setSize(new java.awt.Dimension(516, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login().setVisible(true); // CHAMA A TELA DE LOGIN (TEMPORÁRIO).
        dispose(); // AO CLICAR NO BOTÃO A TELA É FECHADA.
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
    }//GEN-LAST:event_txtNomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
