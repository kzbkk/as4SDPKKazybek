public class Main {
    public static void main(String[] args) {
        SubscriptionFacade facade = new SubscriptionFacade();
        facade.subscribe("Alex", "Premium");
        System.out.println("----------------");
        facade.subscribe("John", "Basic");
        facade.subscribe("Mike", "Unknown");
    }
}