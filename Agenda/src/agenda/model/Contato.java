/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.model;

/**
 *
 * @author Bruno Santos
 */
public class Contato {
    
    private int _id;
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(){
        
    }

    public Contato(int _id, String nome, String telefone, String email) {
        this._id = _id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
