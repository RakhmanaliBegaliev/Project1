package service;

import model.User;
import service.impl.NotFoundIdException;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void findById(int userid) throws NotFoundIdException;

    void deleteById(int userid);

    List<User> getAll();

}
