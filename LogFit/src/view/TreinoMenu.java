package view;

import data.Usuario;

public class TreinoMenu extends javax.swing.JFrame {

    public TreinoMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInfo3 = new javax.swing.JLabel();
        lblTreinoImage2 = new javax.swing.JLabel();
        btnIniciar3 = new javax.swing.JToggleButton();
        lblFundo2 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        lblTreinoImage1 = new javax.swing.JLabel();
        btnIniciar2 = new javax.swing.JToggleButton();
        lblFundo1 = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JToggleButton();
        lblTreinoImage = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTreino = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        lblTreinoIcon = new javax.swing.JLabel();
        lblHomeIcon = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        btnAcademia = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Treino A");
        getContentPane().setLayout(null);

        lblInfo3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lblInfo3.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo3.setText("PERNAS.");
        lblInfo3.setToolTipText("");
        getContentPane().add(lblInfo3);
        lblInfo3.setBounds(660, 130, 270, 80);

        lblTreinoImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTreinoImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TreinoC.png"))); // NOI18N
        getContentPane().add(lblTreinoImage2);
        lblTreinoImage2.setBounds(680, 190, 230, 240);

        btnIniciar3.setText("Iniciar");
        btnIniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar3);
        btnIniciar3.setBounds(690, 450, 210, 40);

        lblFundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FundoRetangulo.png"))); // NOI18N
        getContentPane().add(lblFundo2);
        lblFundo2.setBounds(650, 140, 280, 390);

        lblInfo2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lblInfo2.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo2.setText("COSTAS E BÍCEPS.");
        lblInfo2.setToolTipText("");
        getContentPane().add(lblInfo2);
        lblInfo2.setBounds(350, 130, 270, 80);

        lblTreinoImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTreinoImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TreinoB.png"))); // NOI18N
        getContentPane().add(lblTreinoImage1);
        lblTreinoImage1.setBounds(370, 190, 230, 240);

        btnIniciar2.setText("Iniciar");
        btnIniciar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar2);
        btnIniciar2.setBounds(380, 450, 210, 40);

        lblFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FundoRetangulo.png"))); // NOI18N
        getContentPane().add(lblFundo1);
        lblFundo1.setBounds(340, 140, 280, 390);

        lblInfo1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lblInfo1.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo1.setText("PEITO, OMBRO E TRÍCEPS.");
        lblInfo1.setToolTipText("");
        getContentPane().add(lblInfo1);
        lblInfo1.setBounds(40, 130, 270, 80);

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar);
        btnIniciar.setBounds(70, 450, 210, 40);

        lblTreinoImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTreinoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TreinoA.png"))); // NOI18N
        getContentPane().add(lblTreinoImage);
        lblTreinoImage.setBounds(60, 190, 230, 240);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(-60, 0, 250, 140);

        lblTreino.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lblTreino.setForeground(new java.awt.Color(255, 255, 255));
        lblTreino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTreino.setText("MENU DE TREINO");
        lblTreino.setToolTipText("");
        getContentPane().add(lblTreino);
        lblTreino.setBounds(0, 30, 960, 80);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FundoRetangulo.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(30, 140, 280, 390);

        lblTreinoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icone_Academia.png"))); // NOI18N
        getContentPane().add(lblTreinoIcon);
        lblTreinoIcon.setBounds(470, 560, 30, 40);

        lblHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icone_Home.png"))); // NOI18N
        getContentPane().add(lblHomeIcon);
        lblHomeIcon.setBounds(410, 560, 30, 40);

        lblSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icone_Saida.png"))); // NOI18N
        getContentPane().add(lblSaida);
        lblSaida.setBounds(530, 560, 30, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpeg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 970, 640);

        btnAcademia.setText("jButton1");
        btnAcademia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcademiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcademia);
        btnAcademia.setBounds(470, 570, 30, 30);

        btnSaida.setText("jButton1");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaida);
        btnSaida.setBounds(530, 570, 30, 30);

        btnHome.setText("jButton1");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(410, 570, 30, 30);

        setSize(new java.awt.Dimension(982, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (evt.getSource() == btnIniciar) {
            new TreinoA().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnIniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar2ActionPerformed
        if (evt.getSource() == btnIniciar2) {
            new TreinoB().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnIniciar2ActionPerformed

    private void btnIniciar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar3ActionPerformed
        if (evt.getSource() == btnIniciar3) {
            new TreinoC().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnIniciar3ActionPerformed

    private void btnAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcademiaActionPerformed
        if (evt.getSource() == btnAcademia) {
            new TreinoMenu().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnAcademiaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        if (evt.getSource() == btnHome) {
            Usuario usuario = null;
            new Home(usuario).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcademia;
    private javax.swing.JButton btnHome;
    private javax.swing.JToggleButton btnIniciar;
    private javax.swing.JToggleButton btnIniciar2;
    private javax.swing.JToggleButton btnIniciar3;
    private javax.swing.JButton btnSaida;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblFundo1;
    private javax.swing.JLabel lblFundo2;
    private javax.swing.JLabel lblHomeIcon;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblTreino;
    private javax.swing.JLabel lblTreinoIcon;
    private javax.swing.JLabel lblTreinoImage;
    private javax.swing.JLabel lblTreinoImage1;
    private javax.swing.JLabel lblTreinoImage2;
    // End of variables declaration//GEN-END:variables
}
