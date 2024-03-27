package be.about.coding.hard;

public class Runner {

    public static void main(String[] args) {
        var service = new UserService();
        var names = service.getAllUserNames();

        System.out.println("Output ...");
        names.stream()
                .forEach(System.out::println);
    }

}
