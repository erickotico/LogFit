package Telas;

import data.Usuario;
import data.UsuarioDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class Cadastro  extends JFrame implements ActionListener{
    
//variaveis de String 
     JLabel lblNome, lblEndereco, lblCep, lblEstado, lblSenha, lblTelefone;
     JTextField txtNome, txtEndereco, txtCep, txtEstado, txtTelefone;
     JPasswordField txtSenha;
             
     // Vai ter sexo? ih
     String[] sexo = new String[] {"F", "M"};
     JComboBox<String> genero = new JComboBox<>(sexo);

    //variaveis de inteiros alterar depois
     JLabel lblAltura;
     JTextField txtAltura;

     JLabel lblPeso;
     JTextField txtPeso;
     
     //Botoes
     JButton btnVotlar, btnCadastrar;
     
     // Imagens
     JLabel lblImagen;
     ImageIcon img;

     public Cadastro(){
         // Tamanho do formulario principal
        setSize(600, 500); 
        setLocationRelativeTo(null); // Centraliza o formulario
        setTitle("Cadastro de Usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(null);

        
        // NOME
        lblNome = new JLabel("Nome");
        lblNome.setSize(90,20);
        lblNome.setLocation(30, 100);
        lblNome.setForeground(new Color(0,128,0));
        add(lblNome); 
        txtNome = new JTextField();
        txtNome.setSize(150,20);
        txtNome.setLocation(90, 100);
        add(txtNome);

        // Senha
        lblSenha = new JLabel("Senha");
        lblSenha.setSize(90,20);
        lblSenha.setLocation(30, 130);
        lblSenha.setForeground(new Color(0,128,0));
        add(lblSenha);
        txtSenha = new JPasswordField();
        txtSenha.setSize(150,20);
        txtSenha.setLocation(90, 130);
        add(txtSenha);

        // Endereço
        lblEndereco = new JLabel("Endereço");
        lblEndereco.setSize(90,20);
        lblEndereco.setLocation(30, 160);
        lblEndereco.setForeground(new Color(0,128,0));
        add(lblEndereco);
        txtEndereco = new JTextField();
        txtEndereco.setSize(150,20);
        txtEndereco.setLocation(90, 160);
        add(txtEndereco);
        
        // Telefone
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setSize(90,20);
        lblTelefone.setLocation(30, 190);
        lblTelefone.setForeground(new Color(0,128,0));
        add(lblTelefone);
        txtTelefone = new JTextField();
        txtTelefone.setSize(150,20);
        txtTelefone.setLocation(90, 190);
        add(txtTelefone);
                
        // CEP
        lblCep = new JLabel("Cep");
        lblCep.setSize(90,20);
        lblCep.setLocation(30, 220);
        lblCep.setForeground(new Color(0,128,0));
        add(lblCep);
        txtCep = new JTextField();
        txtCep.setSize(150,20);
        txtCep.setLocation(90, 220);
        add(txtCep);
        
        lblEstado = new JLabel("Estado");
        lblEstado.setSize(90,20);
        lblEstado.setLocation(30, 250);
        lblEstado.setForeground(new Color(0,128,0));
        add(lblEstado);
        txtEstado = new JTextField();
        txtEstado.setSize(150,20);
        txtEstado.setLocation(90, 250);
        add(txtEstado);
        
        // Altura
        lblAltura = new JLabel("Altura");
        lblAltura.setSize(90,20);
        lblAltura.setLocation(30, 280);
        lblAltura.setForeground(new Color(0,128,0));
        add(lblAltura);
        txtAltura = new JTextField();
        txtAltura.setSize(150,20);
        txtAltura.setLocation(90, 280);
        add(txtAltura);
                
        // Isso é a caixa de sexo
        genero.setSize(50,20);
        genero.setLocation(350,50);
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
        img  = new ImageIcon(getClass().getResource("/img/background.jpeg")); // só altera o que está entre aspas por favor
        lblImagen = new JLabel("", img, JLabel.CENTER);
    lblImagen.setBounds(0, -20, 600, 500); // só altera essa linha aqui pelo amor de deus
        add(lblImagen);
        
        
        
    }
    public static void main(String[] args) {
        new Cadastro().setVisible(true);
    }
    
        @Override
    public void actionPerformed(ActionEvent e) {
        
        // Botão voltar
        if (e.getSource() == btnVotlar) {
            new Intro().setVisible(true);
            dispose();
        }
        
        // Ação do botão de cadastro
        if (e.getSource() == btnCadastrar) {
            // Instanciando o objeto da classe funcionario
            Usuario usuario;
            usuario = new Usuario();

            UsuarioDAO dao;
            dao = new UsuarioDAO();
            boolean status;
            int resp;

            // Quando o btn for apertado vai pegar esses itens -- colocar
            usuario.setPeso(Double.parseDouble(txtPeso.getText()));
            usuario.setNome(txtNome.getText());
            usuario.setEndereco(txtTelefone.getText());
            usuario.setCep(txtCep.getText());
            usuario.setAltura(Double.parseDouble(txtAltura.getText()));
            

            status = dao.conectar(); // Aqui estamos fazendo a con com o banco
            if(status == false){
                JOptionPane.showMessageDialog(null,"Erro na conexão com o banco de dados");
            }else{ // o else é pq conectou ent chamo o metodo/função salvar
                resp = dao.salvar(usuario);// AQUI É O COMANDO INSERT
                if(resp==1){ // se ela for 1 deu tudo certo -- NÃO mudar pra switch-case
                    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
                }else if (resp == 1062){
                    JOptionPane.showMessageDialog(null,"Essa matricula ja foi cadastrada");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro ao tentar salvar o Usuario");
                }
                dao.desconectar();
            }
        }   
    }
}
