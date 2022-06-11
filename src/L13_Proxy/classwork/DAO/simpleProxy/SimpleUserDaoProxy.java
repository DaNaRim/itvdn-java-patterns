package L13_Proxy.classwork.DAO.simpleProxy;

import L13_Proxy.classwork.DAO.UserDAO;
import L13_Proxy.classwork.domain.User;
import L13_Proxy.classwork.security.SecurityMode;

public class SimpleUserDaoProxy extends UserDAO {

    public SimpleUserDaoProxy() {
        super();
    }

    public User getUserById(SecurityMode mode, long id) {
        String stringUser = super.getUserById(id);
        User user = new User();
        user.setId(id);
        user.setName(stringUser.substring(stringUser.indexOf("name='") + 6, stringUser.indexOf("',")));
        if (mode == SecurityMode.PROTECTED) {
            user.setPassword("***");
        } else if (mode == SecurityMode.FREE) {
            user.setPassword(stringUser.substring(stringUser.indexOf("password='") + 10, stringUser.indexOf("'}")));
        } else {
            user.setId(-1);
            user.setName(null);
            user.setPassword(null);
        }
        return user;
    }
}
