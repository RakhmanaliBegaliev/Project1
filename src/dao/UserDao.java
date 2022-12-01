package dao;
import model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
   private List<User> userList=new ArrayList<>();

   public UserDao() {
      this.userList = userList;
   }

   public List<User> getUserList() {
      return userList;
   }

   public void setUserList(List<User> userList) {
      this.userList = userList;
   }

   @Override
   public String toString() {
      return "UserDao{" +
              "userList=" + userList +
              '}';
   }
}
