package Model;

import java.util.Date;

/**
 *
 * @author GuiMikami
 */
public class Cliente {
    
    //Dados entrada do cliente
    
    private int id;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    private String nome;
    private String sexo;
    private String  dataNascimento;
    private String telefone;
    private String email;
    private String endereco;
    private String cep;
    private String estadoCivil;

    public Cliente(int cep, String nome, String dataNascimento, String nome0, String email, String endereco, String nome1, String estadoCivil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    

    //Construtor para criar um cliente
    public Cliente(int id, String nome, String sexo, String dataNascimento, String telefone, String email, String endereco, String cep, String estadoCivil) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
       
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.estadoCivil = estadoCivil;
    }
//Construtor com dados opcionais
    public Cliente(int id, String nome, String sexo, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    

  

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


  

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
    
    
    
    
    
    
    
}
