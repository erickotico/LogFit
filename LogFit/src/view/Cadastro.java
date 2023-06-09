package view;

import data.Usuario;
import data.UsuarioDAO;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        txtLogin = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro");
        getContentPane().setLayout(null);

        btnVoltar.setBackground(new java.awt.Color(153, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(310, 490, 130, 40);

        btnSalvar.setBackground(new java.awt.Color(3, 129, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(170, 490, 130, 40);

        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(590, 220, 250, 40);

        lblSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(590, 200, 130, 16);

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Nome do Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(170, 200, 130, 16);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(170, 220, 410, 40);

        lblEstado.setBackground(new java.awt.Color(255, 255, 255));
        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado Civil:");
        getContentPane().add(lblEstado);
        lblEstado.setBounds(170, 340, 130, 16);

        lblCPF.setBackground(new java.awt.Color(255, 255, 255));
        lblCPF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF:");
        getContentPane().add(lblCPF);
        lblCPF.setBounds(610, 340, 110, 16);

        lblEndereco.setBackground(new java.awt.Color(255, 255, 255));
        lblEndereco.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço (Rua/Nº/Apt):");
        getContentPane().add(lblEndereco);
        lblEndereco.setBounds(170, 270, 190, 16);

        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyPressed(evt);
            }
        });
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(170, 290, 410, 40);

        lblTelefone.setBackground(new java.awt.Color(255, 255, 255));
        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone (DDD):");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(590, 270, 130, 16);

        txtAltura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlturaKeyPressed(evt);
            }
        });
        getContentPane().add(txtAltura);
        txtAltura.setBounds(320, 360, 110, 40);

        lblCEP.setBackground(new java.awt.Color(255, 255, 255));
        lblCEP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(255, 255, 255));
        lblCEP.setText("CEP:");
        getContentPane().add(lblCEP);
        lblCEP.setBounds(440, 340, 130, 16);

        txtCEP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCEPKeyPressed(evt);
            }
        });
        getContentPane().add(txtCEP);
        txtCEP.setBounds(440, 360, 160, 40);

        lblAltura.setBackground(new java.awt.Color(255, 255, 255));
        lblAltura.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(255, 255, 255));
        lblAltura.setText("Altura:");
        getContentPane().add(lblAltura);
        lblAltura.setBounds(320, 340, 130, 16);

        lblSexo.setBackground(new java.awt.Color(255, 255, 255));
        lblSexo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(280, 410, 170, 16);

        txtPeso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesoKeyPressed(evt);
            }
        });
        getContentPane().add(txtPeso);
        txtPeso.setBounds(170, 430, 100, 40);

        lblPeso.setBackground(new java.awt.Color(255, 255, 255));
        lblPeso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setText("Peso (KG):");
        getContentPane().add(lblPeso);
        lblPeso.setBounds(170, 410, 130, 16);

        txtTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(590, 290, 250, 40);

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(610, 410, 130, 16);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(340, 10, 290, 200);

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(610, 430, 230, 40);

        txtCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
        });
        getContentPane().add(txtCPF);
        txtCPF.setBounds(610, 360, 230, 40);

        cmbSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um Sexo", "Masculino", "Feminino", "Outro" }));
        cmbSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbSexoKeyPressed(evt);
            }
        });
        getContentPane().add(cmbSexo);
        cmbSexo.setBounds(280, 430, 160, 40);

        cmbEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um Estado", "Solteiro", "Casado", "Separado", "Divorciado", "Viúvo" }));
        cmbEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbEstadoKeyPressed(evt);
            }
        });
        getContentPane().add(cmbEstado);
        cmbEstado.setBounds(170, 360, 140, 40);

        txtLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });
        getContentPane().add(txtLogin);
        txtLogin.setBounds(450, 430, 150, 40);

        lblLogin.setBackground(new java.awt.Color(255, 255, 255));
        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Usuário de Login:");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(450, 410, 130, 16);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpeg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 970, 640);

        setSize(new java.awt.Dimension(982, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (evt.getSource() == btnVoltar) {
            new Login().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (evt.getSource() == btnSalvar) {
            Usuario usuario;
            usuario = new Usuario();

            UsuarioDAO dao;
            dao = new UsuarioDAO();
            boolean status;
            int resp;

            usuario.setNome(txtUsuario.getText());
            usuario.setSenha(new String(txtSenha.getPassword()));
            usuario.setEndereco(txtEndereco.getText());
            usuario.setTelefone(txtTelefone.getText());
            usuario.setEstado(cmbEstado.getSelectedItem().toString());
            usuario.setAltura(Double.parseDouble(txtAltura.getText()));
            usuario.setCep(txtCEP.getText());
            usuario.setCpf(txtCPF.getText());
            usuario.setPeso(Double.parseDouble(txtPeso.getText()));
            usuario.setSexo(cmbSexo.getSelectedItem().toString());
            usuario.setLogin(txtLogin.getText());
            usuario.setEmail(txtEmail.getText());

            status = dao.conectar(); // FAZENDO A con COM O BANCO.
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados");
            } else {
                resp = dao.salvar(usuario);
                if (resp == 1) { // SE ELA FOR 1 DEU TUDO CERTO -- NÃO MUDAR PRA SWITCH-CASE.
                    JOptionPane.showMessageDialog(null, "Bem Vindo");
                    new Home(usuario).setVisible(true);
                    dispose();
                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "Essa matricula ja foi cadastrada");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar Cadastrar o Usuario");
                }

            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtEndereco.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtTelefone.requestFocus();
        }
    }//GEN-LAST:event_txtEnderecoKeyPressed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cmbEstado.requestFocus();
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void cmbEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbEstadoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtAltura.requestFocus();
        }
    }//GEN-LAST:event_cmbEstadoKeyPressed

    private void txtAlturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtCEP.requestFocus();
        }
    }//GEN-LAST:event_txtAlturaKeyPressed

    private void txtCEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEPKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_txtCEPKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtPeso.requestFocus();
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtPesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cmbSexo.requestFocus();
        }
    }//GEN-LAST:event_txtPesoKeyPressed

    private void cmbSexoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSexoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtLogin.requestFocus();
        }
    }//GEN-LAST:event_cmbSexoKeyPressed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtLoginKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvar.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvar.doClick();
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
