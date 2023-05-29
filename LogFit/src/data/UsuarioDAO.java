package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public boolean conectar() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_logfit", "root", "admin");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public int salvar(Usuario usuario) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO tb_cadastro VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getCpf());
            st.setString(3, usuario.getEndereco());
            st.setString(4, usuario.getCep());
            st.setString(5, usuario.getEstado());
            st.setString(6, usuario.getTelefone());
            st.setString(7, usuario.getEmail());
            st.setDouble(8, usuario.getAltura());
            st.setDouble(9, usuario.getPeso());
            st.setDouble(10, usuario.getPesoIdeal());
            st.setString(11, usuario.getLogin());
            st.setString(12, usuario.getSenha());
            st.setString(13, usuario.getSexo());
            status = st.executeUpdate(); // EXECUTANDO O QUE FOI COLOCADO NA LINHA DE CIMA.
            return status; // AQUI VAI RETORNAR 1 PORQUE QUANDO VC EXECUTA O COMANDO INSERT ELE INSERE NO BANCO E VOLTA O VALOR 1 OU SEJA DEU CERTO.
        } catch (SQLException ex) { // EX RECEBE AS EXEÇOES OU SEJA GEREALMENTE ERRO
            System.out.println(ex.getErrorCode() + ex.getMessage()); // VAI MOSTRAR O CÓDIGO DO ERRO -- EX: 1062 TENTATIVA DE INSERIR UMA MATRICULA JA CADASTRADA.
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

    public Usuario consultar(String senha, String login) {
        try {
            Usuario usuario = new Usuario(); 
            st = conn.prepareStatement("SELECT * FROM tb_cadastro WHERE senha = ? AND login = ?");
            st.setString(1, senha);
            st.setString(2, login);
            rs = st.executeQuery(); // A VARIAVEL RS É PRA GUARDAR O QUE FOI GERADO.
            // VERIFICA SE A CONSULTA ENCONTROU O FUNCIONÁRIO COM A MATRICULA INFORMADA.
            if (rs.next()) { // SE ENCONTROU O USUÁRIO.
                // COLOCAR OS OUTROS ITENS DO USUÁRIO AQUI.
                // SÓ COLOCA AQUI QUANDO TIVER AS TEXT BOX.
                usuario.setNome(rs.getString("nome"));
                usuario.setAltura(rs.getDouble("altura"));
                //usuario.setPesoIdeal(rs.getDouble("Peso Ideal"));
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
}
