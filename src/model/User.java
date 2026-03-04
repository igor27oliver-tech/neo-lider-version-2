package model;

public class User {
    private String username;
    private String password;
    private Cargo cargo;
    private int id;
    public User(String username, String password,Cargo cargo, int Id) {
        this.username = username;
        this.password = password;
        this.cargo = cargo;
        this.id = Id;
    }
    public User() {
        username = "";
        password = "";
        cargo = null;
        id = 0;
    }
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public Cargo getCargo() {return cargo;}
    public void setCargo(Cargo cargo) {this.cargo = cargo; }
    public int getId() {return id;}

    @Override
    public String toString() {
        return "Usuário: " + username +
                " | Cargo: " + cargo;
    }
}
