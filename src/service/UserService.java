package service;
import model.User;
import service.impl.NotFoundIdException;
import java.util.List;

public interface UserService {
    void addUser(User user);

    User findById(int userid) throws NotFoundIdException;

    void deleteById(int userid) throws NotFoundIdException;

    List<User> getAll();

}
