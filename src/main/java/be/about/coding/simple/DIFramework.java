package be.about.coding.simple;

public class DIFramework {

    public static Service createService() {
        return new Service();
    }

    public static Client createClient() {
        var service = createService();
        return new Client(service);
    }
}
