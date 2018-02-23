package cn.lightfish.design_patterns.creational.simple_factory;

public class UserDAO {

    public int getPermission(String account, String password) {
        if ("Tony".equalsIgnoreCase(account) && "Tony".equalsIgnoreCase(password)) {
            return 0;
        }
        if ("Mike".equalsIgnoreCase(account) && "Mike".equalsIgnoreCase(password)) {
            return 1;
        }
        if ("Jame".equalsIgnoreCase(account) && "Jame".equalsIgnoreCase(password)) {
            return 2;
        }
        return -1;
    }
}