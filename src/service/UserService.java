package service;
import model.Cargo;
import model.User;
import repository.UserRepository;


 public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUser(String name, String senha, Cargo cargo, int id) {

        userRepository.addUser(new User(name, senha, cargo, id));

        return "Adicionado com sucesso";
    }

    public void excluirUser(int id) {
        userRepository.deleteUser(id);
    }

    public String listaUser() {
        return userRepository.getUserList().toString();
    }

}
