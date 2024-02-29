package org.example;
import java.util.ResourceBundle;
public class Main {
    public int login(String userId ,String pwd)
    {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String userName = rb.getString("userName");
        String password = rb.getString("password");

        if(userId.equals(userName) && pwd.equals(password)) return 1;

        return 0;
    }
}