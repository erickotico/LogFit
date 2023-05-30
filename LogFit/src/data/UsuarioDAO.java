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
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public Usuario consultar(String senha, String login) {
        try {
            Usuario usuario = new Usuario(); 
            st = conn.prepareStatement("SELECT * FROM tb_cadastro WHERE senha = ? AND login = ?");
            st.setString(1, senha);
            st.setString(2, login);
            rs = st.executeQuery();
            if (rs.next()) {
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
