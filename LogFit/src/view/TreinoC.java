package view;

import javax.swing.JOptionPane;

public class TreinoC extends javax.swing.JFrame {

    public TreinoC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTreinoImage = new javax.swing.JLabel();
        lblTexto1 = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        lblTexto3 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTreino = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        lblFinalizar = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblTreinoIcon = new javax.swing.JLabel();
        lblHomeIcon = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JToggleButton();
        lblBackground = new javax.swing.JLabel();
        btnAcademia = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Treino A");
        getContentPane().setLayout(null);

        lblTreinoImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTreinoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TreinoB.png"))); // NOI18N
        getContentPane().add(lblTreinoImage);
        lblTreinoImage.setBounds(370, 130, 230, 240);

        lblTexto1.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        lblTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto1.setText("AGACHAMENTO, AFUNDO, STIFF, AGACHAMENTO SUMÔ, ");
        getContentPane().add(lblTexto1);
        lblTexto1.setBounds(360, 410, 250, 10);

        lblTexto2.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        lblTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto2.setText("AGACHAMENTO BÚLGARO, LEG PRESS, MESA FLEXORA, ");
        getContentPane().add(lblTexto2);
        lblTexto2.setBounds(360, 420, 250, 10);

        lblTexto3.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        lblTexto3.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto3.setText("ELEVAÇÃO DE PANTURILHA SENTADO E EM PÉ.");
        getContentPane().add(lblTexto3);
        lblTexto3.setBounds(330, 430, 300, 10);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(-60, 0, 250, 140);

        lblTreino.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lblTreino.setForeground(new java.awt.Color(255, 255, 255));
        lblTreino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTreino.setText("TREINO C");
        lblTreino.setToolTipText("");
        getContentPane().add(lblTreino);
        lblTreino.setBounds(0, 0, 960, 80);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FundoRetangulo.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(340, 100, 280, 390);

        lblFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Finalizar.png"))); // NOI18N
        getContentPane().add(lblFinalizar);
        lblFinalizar.setBounds(340, 490, 290, 60);

        lblInfo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("PERNAS.");
        lblInfo.setToolTipText("");
        getContentPane().add(lblInfo);
        lblInfo.setBounds(0, 40, 960, 80);

        lblTreinoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icone_Academia.png"))); // NOI18N
        getContentPane().add(lblTreinoIcon);
        lblTreinoIcon.setBounds(510, 560, 30, 40);

        lblHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icone_Home.png"))); // NOI18N
        getContentPane().add(lblHomeIcon);
        lblHomeIcon.setBounds(450, 560, 30, 40);

        btnFinalizar.setText("jToggleButton1");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizar);
        btnFinalizar.setBounds(380, 490, 210, 40);

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
        btnAcademia.setBounds(510, 570, 30, 30);

        btnHome.setText("jButton1");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(450, 570, 30, 30);

        setSize(new java.awt.Dimension(982, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcademiaActionPerformed
        if (evt.getSource() == btnAcademia) {
            new TreinoMenu().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnAcademiaActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (evt.getSource() == btnFinalizar) {
            new TreinoMenu().setVisible(true);
            dispose();
            JOptionPane.showMessageDialog(null, "Treino Finalizado com Sucesso!");
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       if (evt.getSource() == btnHome) {
            new Home().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcademia;
    private javax.swing.JToggleButton btnFinalizar;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFinalizar;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblHomeIcon;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTexto3;
    private javax.swing.JLabel lblTreino;
    private javax.swing.JLabel lblTreinoIcon;
    private javax.swing.JLabel lblTreinoImage;
    // End of variables declaration//GEN-END:variables
}
