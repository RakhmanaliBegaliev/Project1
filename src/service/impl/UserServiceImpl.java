package service.impl;
import dao.UserDao;
import model.User;
import service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUserList().add(user);
    }

    @Override
    public User findById(int userid) throws NotFoundIdException {
            User user = userDao.getUserList().stream()
                    .filter(x -> x.getId() == userid).findFirst().orElseThrow(()-> new NotFoundIdException("not found"));

        return user;
    }
    @Override
    public void deleteById(int userid) throws NotFoundIdException {
        User user = userDao.getUserList().stream().filter(x->x.getId() == userid)
                .findFirst().orElseThrow(()-> new NotFoundIdException("not found"));;
        userDao.getUserList().remove(user);
    }
        @Override
        public List<User> getAll () {
            return userDao.getUserList();
        }
}




