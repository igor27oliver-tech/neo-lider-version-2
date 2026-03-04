

public class User {
    String email;
    String nome;
    String senha;
    String setor;
    int id;

    public User (String email,String nome, String senha, String setor,int id){ // construtor 
        this.nome = nome;
        this.senha = senha;
        this.setor = setor;
        this.id = id;
        this.email = email;
    }
public User (){ // construtor vazio serve para criar objetos sem parametros
    nome = "nome";
    senha = "senha";
    setor = "setor";
    id = 0;
    email = "email";   
    }


}
