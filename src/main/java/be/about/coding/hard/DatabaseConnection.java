package be.about.coding.hard;

import java.util.List;

public class DatabaseConnection {

    private final String url;
    private final String user;
    private final String password;

    public DatabaseConnection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    private void connect() {
        System.out.printf("Doing things behind the scenes with these properties %s, %s, %s", url, user, password);
    }

    public List<String> doQuery(String query) {
        connect();
        System.out.printf("doing this query {}%n", query);

        return List.of("Nicholas");
    }
}
