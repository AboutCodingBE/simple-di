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
        System.out.println("Fake Logging: Connecting...");
    }

    public List<String> doQuery(String query) {
        connect();
        System.out.printf("Fake Logging: doing this query {%s} \n", query);

        return List.of("Nicholas");
    }
}
