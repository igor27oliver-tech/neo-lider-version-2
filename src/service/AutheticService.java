package service;

import Controller.AdmController;
import model.Cargo;
import model.User;
import repository.UserRepository;
import repository.ItemRepository;
import service.ItemService;
import service.UserService;
import Controller.AdmController;

public class AutheticService {

    private UserRepository userList;
    private EncaminhamentoSetoresService encaminhamentoSetoresService;

    public AutheticService(UserRepository userList) {

        this.userList = userList;

        // ✅ CRIAR O REPOSITORY PRIMEIRO
        ItemRepository itemRepository = new ItemRepository();

        // ✅ PASSAR PARA O SERVICE
        ItemService itemService = new ItemService(itemRepository);
        UserService userService = new UserService(userList);

        // ✅ CRIAR CONTROLLER
        AdmController admController =
                new AdmController(itemService, userService);

        this.encaminhamentoSetoresService =
                new EncaminhamentoSetoresService(admController);
    }

    public Cargo login(String username, String password) {

        for (User u : userList.getUserList()) {

            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)) {

                Cargo cargo = u.getCargo();
                encaminhamentoSetoresService.redirect(cargo);
                return cargo;
            }
        }

        return null;
    }
}