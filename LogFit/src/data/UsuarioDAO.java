package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement st;
    ResultSet rs; // PRA FUNÇÃO CONSULTAR QUE VAMOS USAR COMO LOGIN.

    //FUNÇÃO FAZ TODOS OS TRAMITS DE CONEXÃO.
    public boolean conectar() { // SÓ CHAMAR O CONECTAR() NO BOTÃO DE LOGIN E NO DE CADASTRO.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_logfit", "root", "123456"); // URL - USUARIO - SENHA <- DO BANCO LÓGICO.
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    // Função faz o insert
    public int salvar(Usuario usuario) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO cadastro VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?,?)"); // OS ? REPESENTAM O QUE VAI SER INSERIDO -- COLOCAR + SE PRECISAR.
            // OBJETO USUÁRIO COLOCAR ISSO PRA FAZER A INSERÇÃO AQUI E NÃO NO BOTÃO.
            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getSenha());
            st.setString(3, usuario.getEndereco());
            st.setString(4, usuario.getTelefone());
            st.setString(5, usuario.getEstado());
            st.setDouble(6, usuario.getAltura());
            st.setString(7, usuario.getCep());
            st.setString(8, usuario.getCpf());
            st.setDouble(9, usuario.getPeso());
            st.setDouble(10, usuario.getPesoIdeal());
            st.setString(11, usuario.getSexo());
            st.setString(12, usuario.getLogin());
            st.setString(13, usuario.getEmail());

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

    public Usuario consultar(String senha, String login) { // <-- PASSAR O PARÂMETRO LOGIN E SENHA É OBRIGATÓRIO -- O USUÁRIO DEPOIS DE PUBLIC É PQ VAI RETORNAR UM OBJETO USUÁRIO.
        try {
            Usuario usuario = new Usuario();  // PODE DECLARAR AQUI OU LÁ EM CIMA MAS SÓ VOU USAR AQUI MESMO.

            st = conn.prepareStatement("SELECT * FROM cadastro WHERE senha = ? AND login = ?"); // VAI CONECTAR E FAZER O COMANDO SELECT.
            st.setString(1, senha); // VAI PUXAR A SENHA.
            st.setString(2, login); // VAI PUXAR O LOGIN.

            rs = st.executeQuery(); // A VARIAVEL RS É PRA GUARDAR O QUE FOI GERADO.
            // VERIFICA SE A CONSULTA ENCONTROU O FUNCIONÁRIO COM A MATRICULA INFORMADA.
            if (rs.next()) { // SE ENCONTROU O USUÁRIO.
                // COLOCAR OS OUTROS ITENS DO USUÁRIO AQUI.
                // SÓ COLOCA AQUI QUANDO TIVER AS TEXT BOX.
                usuario.setNome(rs.getString("nome")); // VAI COLOCAR A NOME E JOGAR NO OBJETO USUÁRIO.
                usuario.setAltura(rs.getDouble("altura"));
                //usuario.setPesoIdeal(rs.getDouble("Peso Ideal"));

                return usuario; // TEM QUE RETORNAR UM OBJETO DA CLASSE FUNCIONÁRIO PRA PODER CHECAR.
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
}
