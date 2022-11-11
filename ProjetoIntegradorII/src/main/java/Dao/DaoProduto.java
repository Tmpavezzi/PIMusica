
package Dao;
import static Dao.Dao.login;
import static Dao.Dao.senha;
import static Dao.Dao.url;
import Model.Produtos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.security.auth.spi.LoginModule;
import javax.swing.JOptionPane;





public class DaoProduto {
    public static String url= "jdbc:mysql://localhost:3306/lojamusica";
   public static String login= "root";
   public static String senha = "root";
   
   
   public static boolean SalvarP(Produtos objProdutos){
       boolean retorno = false;
       Connection conexao =null;
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, login, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produto (Nome,Quantidade,Valor) VALUES(?,?,?)"
                    , Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(2,objProdutos.getDescricao());
            comandoSQL.setFloat(3, objProdutos.getValor());
            comandoSQL.setInt(1, objProdutos.getId());
            int numeroLinha = comandoSQL.executeUpdate();
            if(numeroLinha>0){
                retorno = true;
                
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if(rs!=null){
                    if(rs.next()){
                        objProdutos.setId(rs.getInt(1));
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
