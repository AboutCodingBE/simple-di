package be.about.coding.hard;

public class DependencyFactory {

    public DatabaseConnection createDatabaseConnection() {
        // it is ok to know where to get the properties for this connection as it is my responsibility to create
        // all of these objects

        var url = "jdbc:postgress://localhost/database";
        var username = "admin";
        var password = "admin";

        return new DatabaseConnection(url, username, password);
    }

//    public UserRepository createGetAllUsersProcess() {
//        return new UserRepository(createDatabaseConnection());
//    }
}
