public class Main {
    public static void main(String[] args) {
        SubscriptionFacade facade = new SubscriptionFacade();
        facade.subscribe("Kazybek", "Premium");
        facade.subscribe("Ernar", "Basic");
        facade.subscribe("ALan", "Unknown");
    }
}