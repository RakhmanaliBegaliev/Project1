package service.impl;
import dao.UserDao;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUserList().add(user);
    }

    @Override
    public void findById(int userid) throws NotFoundIdException {

        if(userid == userid){
        throw new RuntimeException("There is no");
        }else {
            userDao.getUserList().stream()
                    .filter(x -> x.getId() == userid)
                    .forEach(System.out::println);;
        }
    }

    @Override
    public void deleteById(int userid) {
        userDao.getUserList().stream()
                .filter(x -> x.getId() == userid)
                .collect(Collectors.toList()).remove(1);

    }

    @Override
    public List<User> getAll()
    {
            return userDao.getUserList();
    }


}
