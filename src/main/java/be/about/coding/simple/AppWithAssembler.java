package be.about.coding.simple;

public class AppWithAssembler {

    public static void main(String[] args) {
        var app = new AppWithAssembler();
        app.startApplication();
    }

    /**
     * Who has the assembler role in this example?
     */
    public void startApplication() {
        var client = DIFramework.createClient();
        client.doSomething(5);
    }
}
