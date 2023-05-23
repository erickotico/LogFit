package Telas;

// Aqui vai ser a tela de inicio tlg pedindo pra fazer login ou criar senha
import data.Usuario;
import data.UsuarioDAO;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Intro extends JFrame implements ActionListener {

    // Botar isso aq depois
    JLabel lblLogin, lblUsuario, lblSenha, lblCriarConta, lblImagem, lblLogo;
    JButton btnLogin, btnCriarConta;
    JTextField txtLogin, txtSenha;
    ImageIcon img, imgLogo;

    public Intro() {
        JFrame f = new JFrame();
        JLabel label = new JLabel("Fonte Alterado");
        label.setFont(new Font("Times new Roman", Font.BOLD, 20));
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);

        setSize(500, 500);
        setLocationRelativeTo(null); // Centraliza o formulario
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        // Login
        lblLogin = new JLabel("Login: ");
        lblLogin.setFont(new java.awt.Font("Times New Roman", 3, 20));
        lblLogin.setSize(150, 30);
        lblLogin.setLocation(220, 200);
        add(lblLogin);
        lblLogin.setForeground(new Color(0, 128, 0));

        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setSize(150, 30);
        lblUsuario.setLocation(130, 230);
        add(lblUsuario);
        lblUsuario.setForeground(new Color(0, 128, 0));

        txtLogin = new JTextField("");
        txtLogin.setSize(150, 30);
        txtLogin.setLocation(200, 230);
        add(txtLogin);

        lblSenha = new JLabel("Senha");
        lblSenha.setSize(150, 30);
        lblSenha.setLocation(140, 270);
        add(lblSenha);
        lblSenha.setForeground(new Color(0, 128, 0));
        txtSenha = new JPasswordField();
        txtSenha.setSize(150, 30);
        txtSenha.setLocation(200, 270);
        add(txtSenha);

        btnLogin = new JButton("Login");
        btnLogin.setSize(100, 30);
        btnLogin.setLocation(220, 360);
        btnLogin.addActionListener(this);
        add(btnLogin);
        btnLogin.setBackground(new Color(0, 200, 50));
        btnLogin.setForeground(new Color(0, 128, 0));

        // Cadastro
        lblCriarConta = new JLabel("É novo por aqui:");
        lblCriarConta.setSize(100, 30);
        lblCriarConta.setLocation(100, 400);
        add(lblCriarConta);
        lblCriarConta.setForeground(new Color(0, 100, 0));

        btnCriarConta = new JButton("Cadastrar");
        btnCriarConta.setSize(100, 30);
        btnCriarConta.setLocation(220, 400);
        btnCriarConta.addActionListener(this);
        add(btnCriarConta);
        btnCriarConta.setBackground(new Color(0, 200, 50));
        btnCriarConta.setForeground(new Color(0, 100, 0));

        // NUNCA MEXA -- imagem de background --  NÃO MEXE NISSO
        imgLogo = new ImageIcon(getClass().getResource("/img/LogoLogFit.png"));
        lblLogo = new JLabel("", imgLogo, JLabel.CENTER);
        lblLogo.setBounds(120, -20, 250, 250);
        add(lblLogo);

        img = new ImageIcon(getClass().getResource("/img/background.jpeg")); // só altera o que está entre aspas por favor
        lblImagem = new JLabel("", img, JLabel.CENTER);
        lblImagem.setBounds(0, -75, 500, 600); // só altera essa linha aqui pelo amor de deus
        add(lblImagem);

    }

    public static void main(String[] args) {
        new Intro().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // ação do botão Criar conta
        if (e.getSource() == btnCriarConta) {
            new Cadastro().setVisible(true); // chama o formulario de criar conta
            dispose(); // fecha ao clicar no botão
        }

        //Ação botão logar
        if (e.getSource() == btnLogin) {

            String senha;// fazendo uma variavel pra receber a senha
            senha = txtSenha.getText();// pegando a senha
            String login;
            login = txtLogin.getText();
            UsuarioDAO dao = new UsuarioDAO();// Pra chamar as funçoes precisa fazer isso
            boolean status = dao.conectar(); // chamando o metodo/função conectar

            if (status == true) {
                Usuario usuario = dao.consultar(senha, login);// Chamando o metodo/função consultar e passando a senha que na função/metodo é obrigatorio -- obj da classe funcionario vai receber o que quero consultar
                if (usuario == null) { // se o obj usuario for nulo senha incorreta
                    JOptionPane.showMessageDialog(null, "Login ou Senha incorreta");
                } else {// se não estiver nulo faz o login -- mas como fazemos pros itens irem dq pra tela LogFit
                    new LogFit(usuario).setVisible(true);
                    dispose();
                }
                dao.desconectar();
            } else { // esse é o else do primeiro IF
                JOptionPane.showMessageDialog(null, "Erro na conecxão com o banco de dados");
            }

        }
    }
}
