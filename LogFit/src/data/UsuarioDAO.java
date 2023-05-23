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
<<<<<<< HEAD
            st = conn.prepareStatement("INSERT INTO tb_cadastro VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?)"); // os ? repesentam o que vai serr inseido -- colocar + se precisar
            // Objeto usurario colocar isso pra fazer a inserção aq e não no botão
            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getCpf());
            st.setString(3, usuario.getEndereco()); // usar os get do usuario
            st.setString(4, usuario.getCep());
=======
            st = conn.prepareStatement("INSERT INTO cadastro VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?,?)"); // OS ? REPESENTAM O QUE VAI SER INSERIDO -- COLOCAR + SE PRECISAR.
            // OBJETO USUÁRIO COLOCAR ISSO PRA FAZER A INSERÇÃO AQUI E NÃO NO BOTÃO.
            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getSenha());
            st.setString(3, usuario.getEndereco());
            st.setString(4, usuario.getTelefone());
>>>>>>> 3af72f87bce3c8e8ca08134b6738f0b87b3ea4f9
            st.setString(5, usuario.getEstado());
            st.setDouble(6, usuario.getAltura());
            st.setString(7, usuario.getCep());
            st.setString(8, usuario.getCpf());
            st.setDouble(9, usuario.getPeso());
            st.setDouble(10, usuario.getPesoIdeal());
            st.setString(11, usuario.getSexo());
            st.setString(12, usuario.getLogin());
            st.setString(13, usuario.getEmail());

<<<<<<< HEAD
            status = st.executeUpdate();// executando o que foi colocado na linha de cima
            return status; // aqui vai retornar 1 pq qunado vc executa o comando insert ele insere no banco e volta o valor 1 ou seja deu certo
        } catch (SQLException ex) { // ex recebe as exeçoes ou seja gerealmente erro
            System.out.println(ex.getErrorCode() + ex.getMessage()); // Vai mostrar o codigo do erro -- EX: 1062 tentativa de inserir uma matricula ja cadastrada
=======
            status = st.executeUpdate(); // EXECUTANDO O QUE FOI COLOCADO NA LINHA DE CIMA.
            return status; // AQUI VAI RETORNAR 1 PORQUE QUANDO VC EXECUTA O COMANDO INSERT ELE INSERE NO BANCO E VOLTA O VALOR 1 OU SEJA DEU CERTO.
        } catch (SQLException ex) { // EX RECEBE AS EXEÇOES OU SEJA GEREALMENTE ERRO
            System.out.println(ex.getErrorCode() + ex.getMessage()); // VAI MOSTRAR O CÓDIGO DO ERRO -- EX: 1062 TENTATIVA DE INSERIR UMA MATRICULA JA CADASTRADA.
>>>>>>> 3af72f87bce3c8e8ca08134b6738f0b87b3ea4f9
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

<<<<<<< HEAD
            st = conn.prepareStatement("SELECT * FROM tb_cadastro where senha = ? and login = ?"); // Vai conectar e fazer o comando select
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

                return usuario; // tem que retornar um objeto da classe funcionario pra poder checar
=======
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
>>>>>>> 3af72f87bce3c8e8ca08134b6738f0b87b3ea4f9
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
}
