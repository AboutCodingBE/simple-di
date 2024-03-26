package be.about.coding.simple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        var app = new App();
        app.startApplication();

    }

    public void startApplication() {
        var client = new Client(new Service());
        client.doSomething(5);
    }
}
