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


        ItemRepository itemRepository = new ItemRepository();


        ItemService itemService = new ItemService(itemRepository);
        UserService userService = new UserService(userList);


        AdmController admController =
                new AdmController(itemService, userService);

        this.encaminhamentoSetoresService =
                new EncaminhamentoSetoresService(admController);
    }

    public Cargo login(String username, String password) {

        String usernameDigitado = username.trim();
        String passwordDigitada = password.trim();

        for (User u : userList.getUserList()) {
            // para ver o que esta sendo comparado ->
           // System.out.println("Digitado: " + usernameDigitado + " | " + passwordDigitada);
           // System.out.println("Banco: " + u.getUsername() + " | " + u.getPassword());

            if (u.getUsername().trim().equalsIgnoreCase(usernameDigitado)
                    && u.getPassword().trim().equals(passwordDigitada)) {

                Cargo cargo = u.getCargo();
                encaminhamentoSetoresService.redirect(cargo);
                return cargo;
            }
        }

        return null;
    }}