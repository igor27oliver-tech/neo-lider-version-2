package repository;

import model.Cargo;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> userList = new ArrayList<>();
    public UserRepository() {
       userList.add(new User("Igor", "123", Cargo.ADMIN, 1));
        userList.add(new User("maria", "123", Cargo.PCP, 2));
        userList.add(new User("machado", "123", Cargo.ESTOQ, 3));
        userList.add(new User("Leo", "123", Cargo.PCP, 4));
        userList.add(new User("Nogueira", "123", Cargo.ESTOQ, 5));
        userList.add(new User("dan", "123", Cargo.ADMIN, 6));


    }

    public List<User> getUserList() {
        return userList;
    }
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
