package L13_Proxy.classwork.DAO.interfaces;

import L13_Proxy.classwork.domain.User;

public interface IUserDAO {

    User saveUser(User user);

    String getListOfUsers();

    String getUserById(long id);

}
