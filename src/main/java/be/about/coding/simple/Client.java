package be.about.coding.simple;

public class Client {

    private Service service;

    public Client(Service service) {
        this.service = service;
    }

    public Client() {
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void doSomething(int times) {
        for(int i = 0; i < times; i++) {
            service.sayHi();
        }
    }
}
