package L13_Proxy.classwork;

import L13_Proxy.classwork.DAO.UserDAO;
import L13_Proxy.classwork.DAO.complicatedProxy.ComplicatedUserDaoProxy;
import L13_Proxy.classwork.DAO.interfaces.IUserDAO;
import L13_Proxy.classwork.DAO.simpleProxy.SimpleUserDaoProxy;
import L13_Proxy.classwork.domain.User;
import L13_Proxy.classwork.security.SecurityMode;


public class Main {

    public static void main(String[] args) {
        User user = new User("John Doe", "qwerty123");
        User user2 = new User("Jane Doe", "0123456789");

        IUserDAO userDao = new UserDAO();
        SimpleUserDaoProxy simpleUserDaoProxy = new SimpleUserDaoProxy();
        IUserDAO complicatedUserDao = new ComplicatedUserDaoProxy().createUserDaoProxy(new UserDAO());

        User savedUser = complicatedUserDao.saveUser(user);
        User savedUser2 = complicatedUserDao.saveUser(user2);

        System.out.println("Saved user: " + savedUser.toString());
        System.out.println("Saved user: " + savedUser2.toString());
        System.out.println();
        System.out.println(userDao.getListOfUsers());
        System.out.println();
        System.out.println(userDao.getUserById(2L));

        System.out.println(simpleUserDaoProxy.getUserById(SecurityMode.PROTECTED, 1L));
        System.out.println(simpleUserDaoProxy.getUserById(SecurityMode.FREE, 1L));

//        System.out.println(complicatedUserDao.getUserById(1l));
//        System.out.println(complicatedUserDao.getUserById(2l));
//        System.out.println();
//        System.out.println(complicatedUserDao.getListOfUsers());
    }
}
