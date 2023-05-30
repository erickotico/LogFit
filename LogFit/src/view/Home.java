package view;

import data.Usuario;

public class Home extends javax.swing.JFrame {

    public Home(Usuario usuario) {
        initComponents();
        lblSaudacao.setText("Bem-Vindo, " + usuario.getNome() + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInform = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblSaudacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        lblHomeIcon = new javax.swing.JLabel();
        lblTreinoIcon = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        btnSaida = new javax.swing.JButton();
        btnAcademia = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogFit");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        lblInform.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblInform.setForeground(new java.awt.Color(51, 255, 51));
        lblInform.setText("Para Iniciar os Treinos clique no Peso abaixo!");
        getContentPane().add(lblInform);
        lblInform.setBounds(180, 50, 410, 80);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(-60, 0, 250, 140);

        lblSaudacao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(180, 20, 340, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tabela.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 210, 360, 340);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMC.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 0, 420, 230);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafico.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 160, 520, 370);

        lblSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icone_Saida.png"))); // NOI18N
        getContentPane().add(lblSaida);
        lblSaida.setBounds(530, 560, 30, 40);

        lblHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icone_Home.png"))); // NOI18N
        getContentPane().add(lblHomeIcon);
        lblHomeIcon.setBounds(410, 560, 30, 40);

        lblTreinoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icone_Academia.png"))); // NOI18N
        getContentPane().add(lblTreinoIcon);
        lblTreinoIcon.setBounds(470, 560, 30, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpeg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 970, 640);

        btnSaida.setText("jButton1");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaida);
        btnSaida.setBounds(530, 570, 30, 30);

        btnAcademia.setText("jButton1");
        btnAcademia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcademiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcademia);
        btnAcademia.setBounds(470, 570, 30, 30);

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

    private void btnAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcademiaActionPerformed
        if (evt.getSource() == btnAcademia) {
            new TreinoMenu().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnAcademiaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        if (evt.getSource() == btnHome) {
            Usuario usuario = new Usuario();
            new Home(usuario).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
            new Login().setVisible(true);
            dispose();
    }//GEN-LAST:event_btnSaidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcademia;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblHomeIcon;
    private javax.swing.JLabel lblInform;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JLabel lblTreinoIcon;
    // End of variables declaration//GEN-END:variables
}
