package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    Connection conn;
    PreparedStatement st;
    
    public boolean conectar(){ // ai é só chamar o conectar() no botão de login e no de cadastro
  
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aquiVemoNomeDoBancoNãodaTabela","root",""); // URL - usuario - senha <- Do banco lógico
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }
    public void salvar(Usuario usuario){ // mudar de pra int no futuro e colocar os comando sql
    
    }
    
    public void desconectar(){ // pode ser void pq não vai retronar nada
        try {
        conn.close();
        } catch (SQLException ex) {
            // pode colocar menssagem de erro aqui pro usuario ou não tbm tanto faz
        }
    }
}

// Tem que colocar em Libraries o conector

// Função int salvar() pra incluir na tabela, uma pro login pra conferir se ta no banco ou não ai puxa os dados do usuario
