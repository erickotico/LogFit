package Telas;

import data.Usuario;
import data.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Cadastro  extends JFrame implements ActionListener{
    
//variaveis de String 
     JLabel lblNome;
     JTextField txtNome;

     // NÃO MEXE NISSO É O BOX DE FEMININO E MASCULINO
     String[] sexo = new String[] {"F", "M"};
     JComboBox<String> genero = new JComboBox<>(sexo);

    //variaveis de inteiros alterar depois
     JLabel lblIdade, lblAnoMatricula, lblMatricula, lblCodigo, lblCpf, lblTelefone, lblAltura;
     JTextField txtIdade, txtAnoMatricula, txtMatricula, txtCodigo, txtCpf, txtTelefone, txtAltura;

     JLabel lblPeso;
     JTextField txtPeso;
     
     JButton btnVotlar, btnCadastrar;

     public Cadastro(){
         // Tamanho do formulario principal
        setSize(500, 600); 
        setLocationRelativeTo(null); // Centraliza o formulario
        setTitle("Cadastro de funcionários");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(null);

        
        // NOME
        lblNome = new JLabel("Nome");
        lblNome.setSize(100,30);
        lblNome.setLocation(30, 50);
        add(lblNome); 
        txtNome = new JTextField();
        txtNome.setSize(200,30);
        txtNome.setLocation(100, 50);
        add(txtNome);

        // IDADE
        lblIdade = new JLabel("Idade");
        lblIdade.setSize(100, 30);
        lblIdade.setLocation(100, 100);
        add(lblIdade);
        txtIdade = new JTextField();
        txtIdade.setSize(200,30);
        txtIdade.setLocation(100, 100);
        add(txtIdade);

        // Peso
        lblPeso = new JLabel("Peso");
        lblPeso.setSize(100, 30);
        lblPeso.setLocation(30, 200);
        add(lblPeso);
        txtPeso = new JTextField();
        txtPeso.setSize(200,30);
        txtPeso.setLocation(100, 200);
        add(txtPeso);
        
        // Telefone
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setSize(100, 30);
        lblTelefone.setLocation(30, 250);
        add(lblTelefone);
        txtTelefone = new JTextField();
        txtTelefone.setSize(200,30);
        txtTelefone.setLocation(100, 250);
        add(txtTelefone);
                
        // CPF
        lblCpf = new JLabel("CPF");
        lblCpf.setSize(100, 30);
        lblCpf.setLocation(30, 300);
        add(lblCpf);
        txtCpf = new JTextField();
        txtCpf.setSize(200,30);
        txtCpf.setLocation(100, 300);
        add(txtCpf);
        
        // Altura
        lblAltura = new JLabel("Altura");
        lblAltura.setSize(200, 30);
        lblAltura.setLocation(30, 400);
        add(lblAltura);
        txtAltura = new JTextField();
        txtAltura.setSize(100,30);
        txtAltura.setLocation(150, 400);
        add(txtAltura);
                
        // Isso é a caixa de sexo 
        genero.setSize(100,30);
        genero.setLocation(350,50);
        add(genero);
        //String selectedSexo = (String) genero.getSelectedItem();
        
        // Botão voltar 
        btnVotlar = new JButton("Voltar");
        btnVotlar.setSize(100, 30);
        btnVotlar.setLocation(300, 300);
        btnVotlar.addActionListener(this);
        add(btnVotlar);
        
        // Botão de cadastro
        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setSize(100, 30);
        btnCadastrar.setLocation(150, 350);
        btnCadastrar.addActionListener(this);
        add(btnCadastrar);
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

            // Quando o btn for apertado vai pegar essas paradas
            usuario.setPeso(Double.parseDouble(txtPeso.getText()));
            usuario.setNome(txtNome.getText());
            usuario.setTelefone(txtTelefone.getText());
            usuario.setCpf(txtCpf.getText());
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
