package cn.lightfish.design_patterns.creational.simple_factory;
import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void designPatternTest() {
        UserDAO userDao = new UserDAO();
        int permission = userDao.getPermission("Jame", "Jame");
        User user = UserFactory.getUser(permission);
        user.say();
        user.work();
    }
}