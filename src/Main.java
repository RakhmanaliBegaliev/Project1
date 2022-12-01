
import model.User;
import service.UserService;
import service.impl.NotFoundIdException;
import service.impl.UserServiceImpl;

import static Gender.Gender.FEMALE;
import static Gender.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.addUser(new User(1, "Ronaldo", 37, MALE));
        userService.addUser(new User(2, "Messi", 35, MALE));
        userService.addUser(new User(3, "Sara", 22, FEMALE));
        userService.addUser(new User(4, "RAYAN", 2, MALE));

        try {
//            userService.deleteById(5);
//            System.out.println(userService.getAll());
            System.out.println(userService.method(5));
        }
        catch (NotFoundIdException e){
            System.out.println(e.getMessage());
        }

    }

}