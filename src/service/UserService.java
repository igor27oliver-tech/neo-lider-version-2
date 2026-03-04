package service;
import model.Cargo;
import model.User;
import repository.UserRepository;

public class UserService {
    UserRepository userReposity;
    public UserService(UserRepository userList) {this.userReposity = userList;}
    public String addUser (String name,String senha, Cargo cargo,int id){
       userReposity.getUserList().add(new User(name,senha,cargo,id));
      return "adicionado com sucesso";
    }
   public void excluirUser(int idIn){
        userReposity.getUserList().removeIf(user -> user.getId() == idIn);
   }
   public String listaUser(){
       return userReposity.getUserList().toString();
   }
    public String listaSetor(Cargo setor) {

        StringBuilder builder = new StringBuilder();

        for (User user : userReposity.getUserList()) {
            if (user.getCargo() == setor) {
                builder.append(user.toString()).append("\n");
            }
        }

        return builder.toString();

    }
    public String buscarId(int id){
        StringBuilder builder = new StringBuilder();
        for (User user : userReposity.getUserList()){
            if (user.getId() == id){
                builder.append(user.toString()).append("\n");
            }
        }
        return builder.toString();
    }

}
