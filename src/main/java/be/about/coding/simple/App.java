package be.about.coding.simple;

/**
 * In Java up until version 21, you need a class with a public static void main() function or method. Such a class
 * is THE START POINT TO RUN AN APPLICATION.
 */
public class App 
{
    public static void main(String[] args) {
        var app = new App();
        app.startApplication();
    }

    /**
     * Who has the assembler role in this example?
     */
    public void startApplication() {
        var client = new Client();
        var service = new Service();
        client.setService(service);
        client.doSomething(5);
    }
}
