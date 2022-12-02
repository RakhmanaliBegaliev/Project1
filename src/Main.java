
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
        userService.addUser(new User(3, "Jennifer", 22, FEMALE));

        try {
            System.out.println("User which you want to find: " + userService.findById(1));
            System.out.println("All users: " + userService.getAll());
            userService.deleteById(2);
            System.out.println("All users after deleting some users: " + userService.getAll());
        }
        catch (NotFoundIdException e){
            System.out.println(e.getMessage());
        }

    }

}