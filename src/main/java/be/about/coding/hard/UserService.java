package be.about.coding.hard;

import java.util.List;

public class UserService {

    private String url = "jdbc:postgress://localhost/database";
    private String username = "admin";
    private String password = "admin";


    public List<String> getAllUserNames() {
        // some code here
        // Imagine at some point, we need to make a connection to the database

        var databaseConnection = new DatabaseConnection(url, username, password);
        // Well, in order to create a database connection, this service needs to know the url, the password and the username.
        // Where is the userservice going to get these values?
        // Hard coding these values is tedious. What if they change because for example we have multiple environments...
        // Should the UserService really be responsible for getting these values?
        // We might use external configuration for that. But then again, this user service will need to know about how
        // where this configuration is and how to get to it.
        // The user repository just wants to do stuff that concerns users.

        return databaseConnection.doQuery("select * from users");
    }

}
