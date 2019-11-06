
package univs.edu.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Usuario {
    
    @Id
    @GeneratedValue
    private int idUsuario;
    
    @Column(length = 100, nullable = false)
    private String nome;
    
        @Column(length = 100, nullable = false, unique = true)
    private String login;
    
            @Column(length = 100, nullable = false)
    private String senha;

   
    public int getIdUsuario() {
        return idUsuario;
    }

  
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

  
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getLogin() {
        return login;
    }

   
    public void setLogin(String login) {
        this.login = login;
    }

    
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
