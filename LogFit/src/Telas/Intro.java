package Telas;

// Aqui vai ser a tela de inicio tlg pedindo pra fazer login ou criar senha

import data.Usuario;
import data.UsuarioDAO;
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
    JLabel lblLogin, lblUsuario, lblSenha, lblCriarConta, lblImagem;
    JButton btnLogin, btnCriarConta;
    JTextField txtNome, txtSenha;
    ImageIcon img;
            
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
        txtSenha = new JPasswordField();
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
        
        // NUNCA MEXA -- imagem de background --  NÃO MEXE NISSO
        img  = new ImageIcon(getClass().getResource("/img/background.jpeg")); // só altera o que está entre aspas por favor
        lblImagem = new JLabel("", img, JLabel.CENTER);
        lblImagem.setBounds(0, 0, 500, 600); // só altera essa linha aqui pelo amor de deus
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
        if(e.getSource() == btnLogin ){
            
        String senha;// fazendo uma variavel pra receber a senha
        senha = txtSenha.getText();// pegando a senha
        UsuarioDAO dao = new UsuarioDAO();// Pra chamar as funçoes precisa fazer isso
        boolean status = dao.conectar(); // chamando o metodo/função conectar
        
        if(status ==true){
            Usuario usuario = dao.consultar(senha);// Chamando o metodo/função consultar e passando a senha que na função/metodo é obrigatorio -- obj da classe funcionario vai receber o que quero consultar
            if(usuario == null){ // se o obj usuario for nulo senha incorreta
                JOptionPane.showMessageDialog(null, "Senha incorreta");
            }else{// se não estiver nulo faz o login -- mas como fazemos pros itens irem dq pra tela LogFit
                new LogFit().setVisible(true);
                dispose();
            }
            dao.desconectar();
        }else{ // esse é o else do primeiro IF
            JOptionPane.showMessageDialog(null, "Erro na conecxão com o banco de dados");
        }

        }
    }
}
