package be.about.coding.simple;

/**
 * Has the responsibility to build all the dependencies in the right order and to inject them in the right order.
 */
public class DIFramework {

    public static Service createService() {
        return new Service();
    }

    public static Client createClient() {
        var service = createService();
        return new Client(service);
    }
}
