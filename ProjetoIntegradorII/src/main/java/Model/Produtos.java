
package Model;

/**
 *
 * @author GuiMikami
 */
public class Produtos {
    
    private int id;
    private String descricao;
    private float valor;
    private int Quantidade;

    public Produtos(String Descriçao, float Valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public Produtos(int id, String descricao, float valor,int quantidade) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.Quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
    
    
    
}
