
package Dao;
import Model.Cliente;
import Model.Produtos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.security.auth.spi.LoginModule;
import javax.swing.JOptionPane;
public class Dao {
    
    
  public static String url= "jdbc:mysql://localhost:3306/lojamusica";
   public static String login= "root";
   public static String senha = "root";
   
   
   public static boolean Salvar(Cliente objCliente){
       boolean retorno = false;
        Connection conexao = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, login, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente (Nome,Email,EstadoCivil,CPF,Telefone,Nascimento,Logradouro,Complemento,Numero,Bairro,Cep) VALUES(?,?,?,?,?,?,?,?,?,?,?)"
                    , Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(1,objCliente.getNome());
            comandoSQL.setString(2,objCliente.getEmail());
            comandoSQL.setString(3, objCliente.getEstadoCivil());
            comandoSQL.setString(4,objCliente.getCPF());
            comandoSQL.setString(5, objCliente.getTelefone());
            comandoSQL.setString(6, objCliente.getEndereco());
            comandoSQL.setString(7, objCliente.getDataNascimento());
                        
            int numeroLinha = comandoSQL.executeUpdate();
            if(numeroLinha>0){
                retorno = true;
                
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if(rs!=null){
                if(rs.next()){
                    objCliente.setId(rs.getInt(1));
                }
            }
            }
            
        }catch(ClassNotFoundException ex){
            retorno=false;
        }catch(SQLException ex){
            retorno = false;
        }
        return retorno;
               
   }
    
  
    
}
