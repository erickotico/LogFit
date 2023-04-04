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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aquiVemoNomeDoBancoNãodaTabela","root",""); // URL - usuario - senha <- Do banco logico
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }
    
    
}

// Tem que colocar em Libraries o conector

// Ai depois fazer uma função int salvar() pra incluir na tabela, uma void desconectar() e uma pro login pra conferir se ta no banco ou não
