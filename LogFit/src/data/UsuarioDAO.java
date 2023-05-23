package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement st;
    ResultSet rs; // Pra função consultar que vamos usar como login

    //Função faz todos os tramits de conexão
    public boolean conectar() { // ai é só chamar o conectar() no botão de login e no de cadastro

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_logfit", "root", "admin"); // URL - usuario - senha <- Do banco lógico
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    // Função faz o insert
    public int salvar(Usuario usuario) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO cadastro VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?)"); // os ? repesentam o que vai serr inseido -- colocar + se precisar
            // Objeto usurario colocar isso pra fazer a inserção aq e não no botão
            st.setString(1, usuario.getNome()); 
            st.setString(2, usuario.getCpf()); 
            st.setString(3, usuario.getEndereco()); // usar os get do usuario
            st.setString(4, usuario.getCep());
            st.setString(5, usuario.getEstado());
            st.setString(6, usuario.getTelefone());
            st.setString(7, usuario.getEmail());
            st.setDouble(8, usuario.getAltura());
            st.setDouble(9, usuario.getPeso());
            st.setDouble(10, usuario.getPesoIdeal());
            st.setString(11, usuario.getLogin());
            st.setString(12, usuario.getSenha());

            
            status = st.executeUpdate();// executando o que foi colocado na linha de cima
            return status; // aqui vai retornar 1 pq qunado vc executa o comando insert ele insere no banco e volta o valor 1 ou seja deu certo
        } catch (SQLException ex) { // ex recebe as exeçoes ou seja gerealmente erro
            System.out.println(ex.getErrorCode() +  ex.getMessage()); // Vai mostrar o codigo do erro -- EX: 1062 tentativa de inserir uma matricula ja cadastrada
            return ex.getErrorCode();
        }
    }

    // Função desconecta do banco
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }

    public Usuario consultar(String senha, String login) { // <-- passar o parametro login e senha é obrigatorio -- o usuario depois de public é pq vai retornar um obj usuario
        try {
            Usuario usuario = new Usuario();  // Pode declarar aqui ou lá em cima mas só vou usar aqui mesmo

            st = conn.prepareStatement("SELECT * FROM cadastro where senha = ? and login = ?"); // Vai conectar e fazer o comando select
            st.setString(1, senha); // vai puxar a a senha
            st.setString(2, login); // vai puxar a a senha
            
            rs = st.executeQuery(); // a variavel rs  é pra guardar o que foi gerrado
            // Verifica se a consulta encontrou o funcionario com a matricula informada
            if (rs.next()) {//Se encontrou o Usuario
                // COLOCAR OS OUTROS ITENS DO usuario aqui
                // SÓ COLOCA AQUI QUANADO TIVER AS TEXT BOX
                usuario.setNome(rs.getString("nome")); // Vai colocar a nome e jogar no objeto Usuario
                usuario.setAltura(rs.getDouble("altura"));
                //usuario.setPesoIdeal(rs.getDouble("Peso Ideal"));
                
                return usuario; // tem que retornar um objeto da classe funcionario pra poderr checar
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
}
