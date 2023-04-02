// Aqui vei ser a tela de inicio tlg pedindo pra fazer login ou criar senha

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Intro extends JFrame implements ActionListener{
    // Botar isso aq depois
     JLabel lblLogin;
     JButton btnLogin;

     JLabel lblCiarConta;
     JButton btnCriarConta;

    public Intro() {
     setSize(500, 400);
     setLocationRelativeTo(null); // Centraliza o formulario
     setTitle("Cadastro de funcionários"); 
     setDefaultCloseOperation(EXIT_ON_CLOSE); 
     setLayout(null);      
     
     // Login
     lblLogin = new JLabel("Já posui uma conta: ");
     lblLogin.setSize(150,30); 
     lblLogin.setLocation(20, 30);
     add(lblLogin);
     btnLogin = new JButton("Login");
     btnLogin.setSize(100,30);
     btnLogin.setLocation(150,20);
     btnLogin.addActionListener(this);
     add(btnLogin);


     // Cadastro
     lblCiarConta = new JLabel("É novo por aqui:");
     lblCiarConta.setSize(100,30); 
     lblCiarConta.setLocation(20, 150);
     add(lblCiarConta);
     btnCriarConta = new JButton("Criar conta");
     btnCriarConta.setSize(100,30);
     btnCriarConta.setLocation(150,150);
     btnCriarConta.addActionListener(this); 
     add(btnCriarConta);
    }

    public static void main(String[] args) {    
        new Intro().setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) { // ação do botão
        if(e.getSource()==btnCriarConta){
            new LogFit().setVisible(true); // chama o formulario de criar conta
            dispose(); // fecha ao clicar no botão
        }

    }

}