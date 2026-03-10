

import Controller.AdmController;
import Controller.LoginController;
import model.Cargo;
import repository.ItemRepository;
import repository.UserRepository;
import service.ItemService;
import service.UserService;

import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args) {


        // 1️⃣ Criar Repositories
        UserRepository userRepository = new UserRepository();
        ItemRepository itemRepository = new ItemRepository();

        // 2️⃣ Criar Services
        UserService userService = new UserService(userRepository);
        ItemService itemService = new ItemService(itemRepository);





        // 3️⃣ Criar Controller
        LoginController loginController = new LoginController(userRepository);;
        loginController.loginInP();




    }

}
