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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_empresa", "root", "admin"); // URL - usuario - senha <- Do banco lógico
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    // Função faz o insert
    public int salvar(Usuario usuario) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?,?)"); // os ? repesentam o que vai serr inseido -- colocar + se precisar
            // Objeto usurario colocar isso pra fazer a inserção aq e não no botão
            st.setString(1, usuario.getNome()); // usar os get do usuario
            st.setString(2, usuario.getEndereco());
            st.setString(3, usuario.getCep());
            st.setDouble(4, usuario.getAltura());
            st.setDouble(5, usuario.getPeso());
            st.setDouble(6, usuario.getPesoIdeal());
            st.setString(7, usuario.getTelefone());
            // Não sei se precisa colocar pro id

            status = st.executeUpdate();// executando o que foi colocado na linha de cima
            return status; // aqui vai retornar 1 pq qunado vc executa o comando insert ele insere no banco e volta o valor 1 ou seja deu certo
        } catch (SQLException ex) { // ex recebe as exeçoes ou seja gerealmente erro
            System.out.println(ex.getErrorCode()); // Vai mostrar o codigo do erro -- EX: 1062 tentativa de inserir uma matricula ja cadastrada
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

    public Usuario consultar(String senha) { // <-- passar o parametro senha é obrigatorio
        try {
            Usuario usuario = new Usuario();  // Pode declarar aqui ou lá em cima mas só vou usar aqui mesmo

            st = conn.prepareStatement("SELECT * FROM usuario where senha = ?"); // Vai conectar e fazer o comando select
            st.setString(1, senha); // vai puxar a a senha
            rs = st.executeQuery(); // a variavel rs  é pra guardar o que foi gerrado
            // Verifica se a consulta encontrou o funcionario com a matricula informada
            if (rs.next()) {//Se encontrou o funcionario
                // COLOCAR OS OUTROS ITENS DO usuario aqui
                usuario.setSenha(rs.getString("senha")); // Vai colocar a matricula e jogar no objeto funcionario
                usuario.setNome(rs.getString("nome")); // Vai colocar a nome e jogar no objeto Usuario
                usuario.setEndereco(rs.getString("endereço"));
                usuario.setPeso(rs.getDouble("Peso"));
                return usuario; // tem que retornar um objeto da classe funcionario pra poderr checar
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }

    }

}
