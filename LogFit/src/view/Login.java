package view;

import data.Usuario;
import data.UsuarioDAO;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    private void initComponents() {

        lblEsquecerSenha = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblLembrar = new javax.swing.JLabel();
        btnLembrar = new javax.swing.JToggleButton();
        txtSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setTitle("Tela de Login");
        getContentPane().setLayout(null);

        lblEsquecerSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblEsquecerSenha.setFont(new java.awt.Font("Segoe UI", 0, 15));
        lblEsquecerSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblEsquecerSenha.setText("Esqueceu sua senha?");
        getContentPane().add(lblEsquecerSenha);
        lblEsquecerSenha.setBounds(350, 480, 150, 16);

        btnCadastrar.setBackground(new java.awt.Color(3, 129, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(490, 430, 130, 40);

        btnLogin.setBackground(new java.awt.Color(3, 129, 0));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 16));
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(350, 430, 130, 40);

        lblLembrar.setBackground(new java.awt.Color(255, 255, 255));
        lblLembrar.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblLembrar.setForeground(new java.awt.Color(255, 255, 255));
        lblLembrar.setText("Lembrar-me");
        getContentPane().add(lblLembrar);
        lblLembrar.setBounds(380, 390, 100, 20);

        btnLembrar.setToolTipText("");
        btnLembrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLembrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLembrarActionPerformed(evt);
            }

            private void btnLembrarActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        getContentPane().add(btnLembrar);
        btnLembrar.setBounds(350, 390, 25, 25);

        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(350, 330, 270, 40);

        lblSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(350, 310, 130, 16);

        lblNome.setBackground(new java.awt.Color(255, 255, 255));
        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 16));
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome do Usuário:");
        getContentPane().add(lblNome);
        lblNome.setBounds(350, 240, 130, 16);

        txtLogin.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });
        getContentPane().add(txtLogin);
        txtLogin.setBounds(350, 260, 270, 40);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")));
        getContentPane().add(lblLogo);
        lblLogo.setBounds(330, 50, 290, 200);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpeg")));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 970, 640);

        setSize(new java.awt.Dimension(982, 646));
        setLocationRelativeTo(null);
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnCadastrar) {
            new Cadastro().setVisible(true);
            dispose();
        }
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnLogin) {

            String senha;
            senha = txtSenha.getText();
            String login;
            login = txtLogin.getText();
            UsuarioDAO dao = new UsuarioDAO();
            boolean status = dao.conectar();

            if (status == true) {
                Usuario usuario = dao.consultar(senha, login);
                if (usuario == null) {
                    JOptionPane.showMessageDialog(null, "Login ou Senha incorreto.");
                } else {
                    new Home(usuario).setVisible(true);
                    dispose();
                }
                dao.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "Erro na conecxão com o banco de dados.");
            }

        }
    }

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtSenha.requestFocus();
        }
    }

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnLogin.requestFocus();
        }
    }

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCadastrar;
    private javax.swing.JToggleButton btnLembrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEsquecerSenha;
    private javax.swing.JLabel lblLembrar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
}
