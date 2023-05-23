package Telas;

import data.Usuario;
import data.UsuarioDAO;
import javax.swing.JOptionPane;

<<<<<<< HEAD
public class Cadastro extends JFrame implements ActionListener {

//variaveis de String 
    JLabel lblTitulo, lblNome, lblEndereco, lblCep, lblEstado, lblSenha, lblTelefone, lblLogin, lblCpf;
    JTextField txtNome, txtEndereco, txtCep, txtEstado, txtTelefone, txtLogin, txtCpf;
    JPasswordField txtSenha;

    // Sexo?
    String[] sexo = new String[]{"F", "M"};
    JComboBox<String> genero = new JComboBox<>(sexo);

    //variaveis de inteiros alterar depois
    JLabel lblAltura, lblPeso;
    JTextField txtAltura, txtPeso;
    
    //Botoes
    JButton btnVotlar, btnCadastrar;

    // Imagens
    JLabel lblImagen;
    ImageIcon img;

    public Cadastro() {
        // Tamanho do formulario principal
        setSize(600, 500);
        setLocationRelativeTo(null); // Centraliza o formulario
        setTitle("Cadastro de Usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        lblTitulo = new JLabel("Cadastro");
        lblTitulo.setSize(200,200);
        lblTitulo.setFont(new java.awt.Font("Times New Roman", 3, 36));// realiza a mudança de fonte,estilo e tamanho da fonte.  
        lblTitulo.setLocation(200,-50);
        lblTitulo.setForeground(new Color(0,128,0));
        add(lblTitulo);

        // NOME
        lblNome = new JLabel("Nome");
        lblNome.setSize(90, 20); 
        lblNome.setLocation(30, 100);
        lblNome.setForeground(new Color(0, 128, 0));
        add(lblNome);
        txtNome = new JTextField();
        txtNome.setSize(150, 20);
        txtNome.setLocation(90, 100);
        add(txtNome);

        // Senha
        lblSenha = new JLabel("Senha");
        lblSenha.setSize(90, 20);
        lblSenha.setLocation(30, 130);
        lblSenha.setForeground(new Color(0, 128, 0));
        add(lblSenha);
        txtSenha = new JPasswordField();
        txtSenha.setSize(150, 20);
        txtSenha.setLocation(90, 130);
        add(txtSenha);

        // Endereço
        lblEndereco = new JLabel("Endereço");
        lblEndereco.setSize(90, 20);
        lblEndereco.setLocation(30, 160);
        lblEndereco.setForeground(new Color(0, 128, 0));
        add(lblEndereco);
        txtEndereco = new JTextField();
        txtEndereco.setSize(150, 20);
        txtEndereco.setLocation(90, 160);
        add(txtEndereco);

        // Telefone
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setSize(90, 20);
        lblTelefone.setLocation(30, 190);
        lblTelefone.setForeground(new Color(0, 128, 0));
        add(lblTelefone);
        txtTelefone = new JTextField();
        txtTelefone.setSize(150, 20);
        txtTelefone.setLocation(90, 190);
        add(txtTelefone);

        // CEP
        lblCep = new JLabel("Cep");
        lblCep.setSize(90, 20);
        lblCep.setLocation(30, 220);
        lblCep.setForeground(new Color(0, 128, 0));
        add(lblCep);
        txtCep = new JTextField();
        txtCep.setSize(150, 20);
        txtCep.setLocation(90, 220);
        add(txtCep);

        // Estado
        lblEstado = new JLabel("Estado");
        lblEstado.setSize(90, 20);
        lblEstado.setLocation(30, 250);
        lblEstado.setForeground(new Color(0, 128, 0));
        add(lblEstado);
        txtEstado = new JTextField();
        txtEstado.setSize(150, 20);
        txtEstado.setLocation(90, 250);
        add(txtEstado);

        // Altura
        lblAltura = new JLabel("Altura");
        lblAltura.setSize(90, 20);
        lblAltura.setLocation(30, 280);
        lblAltura.setForeground(new Color(0, 128, 0));
        add(lblAltura);
        txtAltura = new JTextField();
        txtAltura.setSize(150, 20);
        txtAltura.setLocation(90, 280);
        add(txtAltura);
        
        // Login -- coloca isso como primeiro ou na frente sei lá
        lblLogin = new JLabel("Login");
        lblLogin.setSize(90, 20);
        lblLogin.setLocation(30, 320);
        lblLogin.setForeground(new Color(0, 128, 0));
        add(lblLogin);
        txtLogin = new JTextField();
        txtLogin.setSize(150, 20);
        txtLogin.setLocation(90, 320);
        add(txtLogin);
        
        // CPF -- coloca isso como primeiro ou na frente sei lá
        lblCpf = new JLabel("Cpf");
        lblCpf.setSize(90, 20);
        lblCpf.setLocation(30, 360);
        lblCpf.setForeground(new Color(0, 128, 0));
        add(lblCpf);
        txtCpf = new JTextField();
        txtCpf.setSize(150, 20);
        txtCpf.setLocation(90, 360);
        add(txtCpf);
        
        // Peso -- Arrumar a posicão
        lblPeso = new JLabel("Peso");
        lblPeso.setSize(90, 20);
        lblPeso.setLocation(30, 380);
        lblPeso.setForeground(new Color(0, 128, 0));
        add(lblPeso);
        txtPeso = new JTextField();
        txtPeso.setSize(150, 20);
        txtPeso.setLocation(90, 380);
        add(txtPeso);

        // Isso é a caixa de sexo
        genero.setSize(50, 20);
        genero.setLocation(350, 50);
        add(genero);
        //String selectedSexo = (String) genero.getSelectedItem();

        // Botão voltar 
        btnVotlar = new JButton("Voltar");
        btnVotlar.setSize(100, 30);
        btnVotlar.setLocation(300, 400);
        btnVotlar.addActionListener(this);
        add(btnVotlar);

        // Botão de cadastro
        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setSize(100, 30);
        btnCadastrar.setLocation(150, 400);
        btnCadastrar.addActionListener(this);
        add(btnCadastrar);

        //imagem de background
        img = new ImageIcon(getClass().getResource("/img/background.jpeg")); // só altera o que está entre aspas por favor
        lblImagen = new JLabel("", img, JLabel.CENTER);
        lblImagen.setBounds(0, -20, 600, 500); // só altera essa linha aqui pelo amor de deus
        add(lblImagen);

=======
public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
>>>>>>> 3af72f87bce3c8e8ca08134b6738f0b87b3ea4f9
    }

    @SuppressWarnings("unchecked") // DESIGN DA TELA DE CADASTRO.
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

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoLogFit.png"))); // NOI18N
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

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpeg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 980, 640);

        setSize(new java.awt.Dimension(982, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (evt.getSource() == btnVoltar) {
            new Login().setVisible(true); // CHAMA A TELA DE LOGIN.
            dispose(); // AO CLICAR NO BOTÃO A TELA É FECHADA.
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (evt.getSource() == btnSalvar) {
            // INSTANCIANDO O OBJETO DA CLASSE FUNCIONÁRIO.
            Usuario usuario;
            usuario = new Usuario();

            UsuarioDAO dao;
            dao = new UsuarioDAO();
            boolean status;
            int resp;

<<<<<<< HEAD
            // Quando o btn for apertado vai pegar esses itens -- colocar -- COLOCA EM ORDEM pls
            usuario.setPeso(Double.parseDouble(txtPeso.getText()));
            usuario.setNome(txtNome.getText());
            usuario.setEndereco(txtEndereco.getText());
            usuario.setCep(txtCep.getText());
            usuario.setCpf(txtCpf.getText());
            usuario.setEstado(txtEstado.getText());
            usuario.setTelefone(txtTelefone.getText());
            usuario.setLogin(txtLogin.getText());
            usuario.setSenha(new String(txtSenha.getPassword()));
=======
            // QUANDO O BOTÃO FOR APERTADO VAI PEGAR ESSES ITENS -- MANTER NA ORDEM.
            usuario.setNome(txtUsuario.getText());
            usuario.setSenha(txtSenha.getText());
            usuario.setEndereco(txtEndereco.getText());
            usuario.setTelefone(txtTelefone.getText());
            usuario.setEstado(cmbEstado.getSelectedItem().toString());
>>>>>>> 3af72f87bce3c8e8ca08134b6738f0b87b3ea4f9
            usuario.setAltura(Double.parseDouble(txtAltura.getText()));
            usuario.setCep(txtCEP.getText());
            usuario.setCpf(txtCPF.getText());
            usuario.setPeso(Double.parseDouble(txtPeso.getText()));
            usuario.setSexo(cmbSexo.getSelectedItem().toString());
            usuario.setLogin(txtLogin.getText());
            usuario.setEmail(txtEmail.getText());

            status = dao.conectar(); // FAZENDO A con COM O BANCO.
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados"); // MENSAGEM DE ERRO DE CONEXÃO COM O BANCO DE DADOS.
            } else { // O ELSE CONECTOU O METODO/FUNÇÃO SALVAR.
                resp = dao.salvar(usuario);// AQUI É O COMANDO INSERT.
                if (resp == 1) { // SE ELA FOR 1 DEU TUDO CERTO -- NÃO MUDAR PRA SWITCH-CASE.
                    JOptionPane.showMessageDialog(null, "Bem Vindo"); // MENSAGEM DE BEM VINDO.
                    new LogFit(usuario).setVisible(true); // CHAMA A TELA DE USUÁRIO.
                    dispose(); // AO CLICAR NO BOTÃO A TELA É FECHADA.
                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "Essa matricula ja foi cadastrada"); // MENSAGEM DE MATRICULA JÁ CADASTRADA.
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar Cadastrar o Usuario"); // MENSAGEM DE ERRO AO TENTAR CADASTRAL TAL MATRICULA.
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
