package Telas;

// Aqui vai ser a tela de inicio tlg pedindo pra fazer login ou criar senha
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Intro extends JFrame implements ActionListener {

    
    // Botar isso aq depois
    JLabel lblLogin, lblUsuario, lblSenha, lblCriarConta;
    JButton btnLogin, btnCriarConta;
    JTextField txtNome, txtSenha;

    public Intro() {
        setSize(500, 600);
        setLocationRelativeTo(null); // Centraliza o formulario
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        // Login
        lblLogin = new JLabel("Já posui uma conta: ");
        lblLogin.setSize(150, 30);
        lblLogin.setLocation(140, 100);
        add(lblLogin);

        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setSize(150, 30);
        lblUsuario.setLocation(40, 130);
        add(lblUsuario);

        txtNome = new JTextField();
        txtNome.setSize(150, 30);
        txtNome.setLocation(120, 130);
        add(txtNome);

        lblSenha = new JLabel("Senha");
        lblSenha.setSize(150, 30);
        lblSenha.setLocation(40, 170);
        add(lblSenha);
        txtSenha = new JTextField();
        txtSenha.setSize(150, 30);
        txtSenha.setLocation(120, 170);
        add(txtSenha);

        btnLogin = new JButton("Login");
        btnLogin.setSize(100, 30);
        btnLogin.setLocation(140, 250);
        btnLogin.addActionListener(this);
        add(btnLogin);

        // Cadastro
        lblCriarConta = new JLabel("É novo por aqui:");
        lblCriarConta.setSize(100, 30);
        lblCriarConta.setLocation(20, 300);
        add(lblCriarConta);

        btnCriarConta = new JButton("Cadastrar");
        btnCriarConta.setSize(100, 30);
        btnCriarConta.setLocation(140, 300);
        btnCriarConta.addActionListener(this);
        add(btnCriarConta);

    }

    public static void main(String[] args) {
        //cria a variavel para a imagem

        new Intro().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // ação do botão
        if (e.getSource() == btnCriarConta) {
            new Cadastro().setVisible(true); // chama o formulario de criar conta
            dispose(); // fecha ao clicar no botão
        }
        if(e.getSource() == btnLogin ){
            new LogFit().setVisible(true);
            dispose();
        }

    }

}
